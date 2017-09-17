package javaPOC;

/**
 * Created by Arpan on 9/10/17.
 */
public abstract class AbstractClass {
    void fucn(){
        System.out.println("Hello THis is fun ");
    }

    public abstract void function1();
}


class ImplAbstracClass extends  AbstractClass{

    public static void main(String[] args) {

//        AbstractClass ac = new AbstractClass();
//        ac.fucn();
    }

    @Override
    public void function1() {

    }
}