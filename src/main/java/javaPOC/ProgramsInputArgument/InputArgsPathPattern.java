package javaPOC.ProgramsInputArgument;

/*


*/
public class InputArgsPathPattern {

    public static void main(String[] args) {

        String str = "/connect/<DC>PV/<INST>01/data/prod" ;

        String str1 = str.replaceAll("<DC>|<INST>","");
        System.out.println(str);

        String arr[] = str.split("/");

        String DC_NAME = "DC";
        String INSTANCE_NUM = "INST";
        System.out.println("Length of array is :- " + arr.length);
        for(String inputFolders : arr )
        {
            if(inputFolders.contains(DC_NAME))
            {
                DC_NAME = inputFolders.replace("<DC>","");
            }
            if(inputFolders.contains(INSTANCE_NUM))
            {
                INSTANCE_NUM = inputFolders.replace("<INST>","");
            }
        }

        System.out.println("print the value of DC_NAME :-  " + DC_NAME);
        System.out.println("print the value of INSTANCE_NUM:-  " + INSTANCE_NUM);
    }

//consumerDataFolders
    public void inputArgumentfunction(){}
}
