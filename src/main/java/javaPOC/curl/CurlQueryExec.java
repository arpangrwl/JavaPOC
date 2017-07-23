package javaPOC.curl;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * curl -X POST -H "Content-Type: application/json" -H Accept:application/json -H Accept-Encoding:gzip
 * -d '{ "appName": ["ireporterstreamingservice"] }'
 * https://if1-carnival.icloud.apple.com/Carnival/services/1.1/isapplications/health | gunzip
 */
public class CurlQueryExec {
    public static void main(String[] args) {
        int totalWorker = 0;
        int happyWorker = 0;
        ArrayList<LinkedHashMap<String, Object>> workers = new ArrayList<LinkedHashMap<String, Object>>();
        LinkedHashMap<String, Object> clusterWorkerDetails = new LinkedHashMap<String, Object>();
        String url = "https://if1-carnival.icloud.apple.com/Carnival/services/isapplications/health?appName=ireporterstreamingservice";
       // String[] command = {"curl", "-k", "Accept:application/json", url};
        String[] command = {"curl", "-X", "POST", "-H", "\"Content-Type: application/json\"", "-H", "Accept:application/json"
                ,"-H", "Accept-Encoding:gzip" ,"-d", "'{ \"appName\": [\"ireporterstreamingservice\"] }'" ,
        "https://if1-carnival.icloud.apple.com/Carnival/services/1.1/isapplications/health | gunzip"};
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            String result = builder.toString();

            System.out.println(result);
        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
