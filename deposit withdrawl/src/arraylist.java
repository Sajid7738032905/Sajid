import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        HashMap<String,String> we= new HashMap<String, String>();
        ob.add(23);
        ob.add(2345);
        ob.add(97);
        ob.add(76);
        ob.add(88);
        we.put("india","africa");
        we.put("das","dfg");
        we.put("jhg","hjoiu");
        Collections.sort(ob);
        for (int i=0;i<ob.size();i++)
            System.out.println(ob.get(i));
        System.out.println(we);


    }
}
