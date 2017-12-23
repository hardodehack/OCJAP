package collection;

import collection.List.DummyClass;

import java.util.*;

public class TreeSet_Exp {

    /*

    Collections.sort(<LIST>) will only work for List Collections.

    To Sorting Elements in Sets and Queue, YOU HAVE TO USE TREESET or PRIORITYQUEUE and use Overloaded Constructor for TreeSet and PriorityQueue
                where you will pass Comparator Class's Object.


    TreeSet<Cobrands> tSet = new TreeSet<>(new CobComparator_AppId());

    PriorityQueue<Cobrands> pQ = new PriorityQueue<>(new CobComparator_AppId());

     */


    public static void main(String[] args) {


        PriorityQueue<Cobrands> pQ = new PriorityQueue<>(new CobComparator_AppId());

        TreeSet<Cobrands> tSet = new TreeSet<>(new CobComparator_AppId());

        tSet.add(new Cobrands(4,"GVCF4REW"));


        tSet.add(new Cobrands(2,"BCYF4REW"));

        tSet.add(new Cobrands(6,"ACYF4REW"));




        HashMap<DummyClass,Cobrands> hMap = new HashMap<>();

        hMap.put(new DummyClass(1,"ABC"),new Cobrands(1,"ABC"));

        hMap.put(new DummyClass(1,"ABC"),new Cobrands(1,"ABC"));
/*

        hMap.put("1",new Cobrands(4,"BCA"));

        hMap.put("1",new Cobrands(5,"ZQR"));
*/


        System.out.println("All About HashMap ............................");
        for(DummyClass s : hMap.keySet()){

            System.out.println(hMap.get(s));

        }


        System.out.println("All About HashSet...............................");
        for(Cobrands c : tSet){
            System.out.println(c);
        }



    }


}
