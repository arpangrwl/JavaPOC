package javaPOC.ProgramsInputArgument;

/**
 * Created by Arpan on 7/25/17.
 */
public class InputArgs {
    public static void main(String[] args) {


        String consumerDataHdfsPath = "/home/hadoop/local_ireporter/raw/PV/01";

        String inputDataPath = "hdfs://pv38q01if-ztdg11151701.pv.if1.apple.com:50001/home/hadoop/local_ireporter/raw/PV/01/producer_offsets/2017/07/25/17/30/";
        String inputfolders[] = inputDataPath.split("/");

        System.out.println(consumerDataHdfsPath.replaceAll(inputfolders[0] + "//" + inputfolders[2], ""));


    }
}