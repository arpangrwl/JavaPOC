package javaPOC.ObjectOrientedProgram.Constructor;

/**
 * Created by Arpan on 8/3/17.
 */

class A{

    A(){
        System.out.println("Constructor of A");
    }

}

class B extends A{
    B(){
        System.out.println("Constructor of B");
    }
}

class C extends B{

    C(){
        System.out.println("Constructor of C");
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {

        C c = new C();

    }
}
