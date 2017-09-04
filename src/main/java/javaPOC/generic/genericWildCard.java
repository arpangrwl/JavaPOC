package javaPOC.generic;


import java.util.ArrayList;

class Machine {

    int var2;

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Machine class is called";
    }

    public void showMachine() {
        System.out.println("Show Machine is called");
    }

}

class Camera extends Machine {

    int var;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Camera class is called";
    }

    public void showCamera() {
        System.out.println("Show Camera is called");
    }
}

public class genericWildCard {

    public static void main(String[] args) {

        ArrayList<Machine> list = new ArrayList<>();
        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list1 = new ArrayList<>();
        list1.add(new Camera());
        list1.add(new Camera());

        showListOutput(list1);
    }

    public static void showListOutput(ArrayList<? extends Machine> list1) {

       // (list1 instanceof Camera) ? ((Camera) list1) : null;


        for (Object machine : list1) {
          //  machine.in
        }

    }

}

