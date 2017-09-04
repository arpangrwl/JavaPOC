package javaPOC.generic;


public class GenericSecond<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericSecond<Integer> gs = new GenericSecond<Integer>();

        gs.setT(123);
        System.out.println(gs.getT());
    }
}
