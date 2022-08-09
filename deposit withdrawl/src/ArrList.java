import java.util.ArrayList;
public class ArrList {

    public static void main(String[] args)
    {
        ArrayList<Integer> sd= new ArrayList<Integer>();
        sd.add(9);
        sd.add(7);
        sd.add(6);
        sd.add(9876);
        sd.remove(0);
        System.out.println(sd.get(2));
    }
}
