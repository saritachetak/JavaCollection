package Academy.learningProgramming;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListExample {


    public static  void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();    //array list contains
        // adding values
        list.add("sarita");
        list.add("vanita");
        list.add("pradeep");
        list.add("prashanth");
        list.add("pooja");
        list.add("kavita");
        list.add("asha");
        list.add("sarita");
        list.add("vani");
        //retriving values
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list.get(8));
        System.out.println(list.get(2));
        System.out.println("contents of list is:" + list);
        list.remove(3);
        System.out.println(list.contains("nike"));
        // list.clear();
        System.out.println("after clear the list is:");
        System.out.println(list.size());
        //Iterator it=list.iterator();
        // while(it.hasNext()){
        //   System.out.println("iterator is :" +it.next());
        Object clonlist;


        //for (int i = 0; i <= list.size(); i++) {
          //  System.out.println(list);

 for(String x:list)
     System.out.println(x);


            clonlist = list.clone();
            System.out.println("clonlist are:" + clonlist);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.println("iterator is :" + it.next());


                ArrayList obj = new ArrayList();  //arraylist contains all data type
                obj.add("sarita");
                obj.add(10);
                obj.add(10.0);
                obj.add('a');
                ArrayList<Integer> str=new ArrayList<>();// it will take only integer values
                str.add(1);
                str.add(2);
                str.add(3);
                str.add(4);
               // for(Integer x: str);
                //System.out.println(x);
                    System.out.println("size of list is:"+str.size());
                }





            }

        }





