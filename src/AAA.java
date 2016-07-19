import java.util.Objects;

/**
 * Created by root on 01/07/2016.
 */
public class AAA {


    private Integer object;

    public void set(Integer object) {
        this.object = object;
    }

    public Integer get() {
        return object;
    }

    public static void main(String arg[]) {
        AAA a = new AAA();
        Integer o = a.get();
    }

}
