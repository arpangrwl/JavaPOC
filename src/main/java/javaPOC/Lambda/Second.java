package javaPOC.Lambda;

@FunctionalInterface
interface I{
    public void runn();
}


interface I2{
    public int add(int a, int b);
}

public class Second {
    public static void main(String[] args) {

        I in = () -> System.out.println("This will just print");
        in.runn();

        I2 in2 = ( a , b ) -> ( a + b );
        System.out.println(in2.add(12,13));
    }
}
