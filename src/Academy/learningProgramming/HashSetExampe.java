package Academy.learningProgramming;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExampe {
    public static void main(String[] args) {
        HashSet set = new HashSet();  //cannot using same values more than one time
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("five");
        set.add("five");
        set.add("five");
        Iterator it = set.iterator();
        //System.out.println("set");
        while (it.hasNext()) ;
        {
            System.out.println(it.next());}
        System.out.println("set of list are:"+set);
        System.out.println(set.size());
        set.contains(set);
        System.out.println("*********************");

        System.out.println(set.add("five"));
        System.out.println(set.contains("six"));




    }
    }

