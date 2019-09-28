package Academy.learningProgramming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {
    public static void main(String[] args) {
        /* This is how to declare HashMap */
        Map hmap = new HashMap();

      //Adding elements to HashMap/having keys and values
        hmap.put("12", "Chaitanya");
        hmap.put('2', "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        hmap.put(3,"abc");
        hmap.put(3,"abc1");
        hmap.put(3,"abc2");
        hmap.put(3,"abc3");
        System.out.println(hmap.get(3));
        hmap.put(3,"abc4");
        hmap.put(4, "Anuj");

        System.out.println(hmap.get(3));




        /* Display content using Iterator*/
        Set set = hmap.entrySet();

//        Map myMap = new HashMap();
        System.out.println("*******");
        System.out.println(set);
        System.out.println("*******");
        Iterator iterator = set.iterator();


        System.out.println("value of 3 is "+hmap.get(3));

        while(iterator.hasNext()) {

//            System.out.println(iterator.next());

            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("***********");


            System.out.println(iterator.next());
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
//        String var= hmap.get(2);
//        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }
    }
}
