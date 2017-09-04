package javaPOC.generic;

public class GenericFirst {

    Object t;

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericFirst gf = new GenericFirst();
        gf.setT("Arpan");

        System.out.println(gf.getT());

        gf.setT(2);
        System.out.println(gf.getT());

    }
}
