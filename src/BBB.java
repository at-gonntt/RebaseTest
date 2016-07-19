/**
 * Created by root on 01/07/2016.
 */
public class BBB<T> {

    // T stands for "Type"
    private T t;
    private T[] array;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }


    public static void main(String arg[]) throws InterruptedException {

        Thread.sleep(6000);
        System.out.print("kkkk");
        Thread.sleep(9000);
        System.out.print("kkkk");

    }


}
