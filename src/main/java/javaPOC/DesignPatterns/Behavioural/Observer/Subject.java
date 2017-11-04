package javaPOC.DesignPatterns.Behavioural.Observer;

/**
 * Created by Arpan on 10/3/17.
 */
public interface Subject {

    public void register(Observer o);

    public void unregister(Observer o);


}
