/**
 * Created by root on 07/07/2016.
 */
public class DDD {

    String myString;



    public void setMyString(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }





    public static void main(String Atg[]){
        DDD d1 = new DDD();
        d1.setMyString("aaaaaaaaaaaaaa");
        DDD d2 = new DDD();
        d2.setMyString(d1.getMyString());

        //d1.setMyString("hhhhhhhhhhhhhhhhhhhhhhhhhhh");


        System.out.print(d2.getMyString());


    }
}
