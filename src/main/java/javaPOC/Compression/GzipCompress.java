package javaPOC.Compression;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.zip.GZIPInputStream;

/**
 * Created by Arpan on 7/24/17.
 */
public class GzipCompress {

    public static void main(String[] args) {
        System.out.println(getClusterWorkerDetails("PV01"));
    }

    public static LinkedHashMap<String, Object> getClusterWorkerDetails(String clusterName) {
        int totalWorker = 0;
        int happyWorker = 0;
        ArrayList<LinkedHashMap<String, Object>> workers = new ArrayList<LinkedHashMap<String, Object>>();
        LinkedHashMap<String, Object> clusterWorkerDetails = new LinkedHashMap<String, Object>();
        String url = "https://if1-carnival.icloud.apple.com/Carnival/services/1.1/isapplications/health";
        String[] command = {"curl", " -X", "POST ", "-H ", "\"Content-Type: application/json\" ", "-H ", "Accept-Encoding:gzip,deflate ", "-d ", "'{ \"appName\": [\"ireporterstreamingservice\"] }' ", url};
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;
        try {
            p = process.start();


            /* Not able to get the data .. Need to check more in it */
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));


            /*
            byte[] bytes = IOUtils.toByteArray(p.getInputStream());
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            GZIPInputStream gis = new GZIPInputStream(bis);
            */



            /*For testing purpose We have downloaded the json zip and changed the parsing logic to make it compatible with the new format
            * So here we are passing location of the zip file ,which we have downloaded and start the parsing .
            * We have used the below command in-order to download the zip in local .
            *
            *curl -X GET -H "Content-Type: application/json" -H Accept:application/json -H Accept-Encoding:gzip -d '{ "appName": ["ireporterstreamingservice"] }' https://if1-carnival.icloud.apple.com/Carnival/services/1.1/isapplications/health  >>  /Users/soumyajit.c03/Documents/json.gzip
            * */
            String gzipFile = "/Users/Arpan/Documents/json.gzip";

            FileInputStream fis = new FileInputStream(gzipFile);
            GZIPInputStream gis = new GZIPInputStream(fis);


            StringBuilder builder = new StringBuilder();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gis, "UTF-8"));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            String result = builder.toString();

            result = result.substring(result.indexOf("\"response\":"), result.lastIndexOf("}")).replace("\"response\":", "");

            JSONArray jsonarray = new JSONArray(result);
            JSONObject jsonobject;
            JSONObject jsoninstancesarrayobject;


            for (int i = 0; i < jsonarray.length(); i++) {

                jsonobject = jsonarray.getJSONObject(i);
                String instances = jsonobject.getString("instances");
                String health = jsonobject.getString("health");

                JSONArray instancesarray = new JSONArray(instances);

                /* Loop to get the inner element */

                for (int j = 0; j < instancesarray.length(); j++) {
                    jsoninstancesarrayobject = instancesarray.getJSONObject(j);

                    String app = jsoninstancesarrayobject.getString("app");
                    String dataCenter = jsoninstancesarrayobject.getString("dataCenter");
                    String port = jsoninstancesarrayobject.getString("port");
                    String host = jsoninstancesarrayobject.getString("host");
                    String instance = jsoninstancesarrayobject.getString("id");
                    String group = jsoninstancesarrayobject.getString("group");

                    if (clusterName.equals(group.substring(group.indexOf("-") + 1).toLowerCase()))
                        totalWorker++;

                    if (clusterName.equals(group.substring(group.indexOf("-") + 1).toLowerCase()) && health.equals("HAPPY"))
                        happyWorker++;

                    if (clusterName.equals(group.substring(group.indexOf("-") + 1).toLowerCase())) {
                        LinkedHashMap<String, Object> workerDetails = new LinkedHashMap<String, Object>();
                        workerDetails.put("host", host);
                        workerDetails.put("instance", instance);
                        workerDetails.put("port", port);
                        workerDetails.put("health", health);

                        workers.add(workerDetails);
                    }
                }
            }
            clusterWorkerDetails.put("DC", clusterName);
            clusterWorkerDetails.put("configuredWorkers", totalWorker);
            clusterWorkerDetails.put("liveWorkers", happyWorker);
            clusterWorkerDetails.put("workers", workers);
            gis.close();

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return clusterWorkerDetails;
    }
}
