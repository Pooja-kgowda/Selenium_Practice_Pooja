package Map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcepts {
    public static void main(String[] args) {

        Map<String,Integer>m1=new HashMap<String,Integer>();
        m1.put("First",1);
        m1.put("Second",20);
        m1.put("Third",300);
        m1.put("Fourth",4000);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.containsKey("First"));
        System.out.println(m1.containsKey("FIRST"));
        System.out.println(m1.get("First"));
        System.out.println(m1.get("ten"));
        System.out.println(m1.replace("First",1,100));
        System.out.println(m1.remove("First"));
        System.out.println(m1);
        Set<Map.Entry<String,Integer>> s1=m1.entrySet();
        for (Map.Entry<String,Integer>entry:s1)
        {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        m1.forEach((k,v)-> System.out.println(k+"-->"+v));
    }


}
