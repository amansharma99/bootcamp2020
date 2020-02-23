package Collection;
import java.util.*;
import java.lang.*;

public class Q4 {

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args)
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Aman", 45);
        hm.put("Sham", 2);
        hm.put("Ram", 22);
        hm.put("Robert", 44);
        hm.put("Manish", 56);
        hm.put("John", 5);
        hm.put("Clarence", 98);
        Map<String, Integer> hm1 = sortByValue(hm);
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}