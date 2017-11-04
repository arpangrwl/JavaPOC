package javaPOC.Java8.Lambda;


interface  Intrfc{
    public void display();
        }

interface Intrfc1{

    public String display();
}

public class First {

    public static void main(String[] args) {

        Intrfc1 intr = new Intrfc1() {
            @Override
            public String display() {
                return "Hello World";
            }
        };

        System.out.println(intr.display());



        Intrfc intr1 = () -> System.out.println("It is working");
        intr1.display();


        Intrfc1 intrfc2 = () -> "It works as well ";

        System.out.println(intrfc2.display());


        }


}

