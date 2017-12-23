package collection.List;

import collection.Cobrands;

import java.util.*;

public class MethodsInCollectionsInterface {

    public static void main(String[] args) {

        LinkedList<Cobrands> ll = new LinkedList<>();


        ll.add(new Cobrands(1,"ABSDHFJD788"));
        ll.add(new Cobrands(4,"CBSDHFJD788"));
        ll.add(new Cobrands(5,"TBSDHFJD788"));
        ll.add(new Cobrands(0,"JBSDHFJD788"));
        ll.add(new Cobrands(2,"OBSDHFJD788"));
        Cobrands cs = new Cobrands(7,"ZBSDHFJD788");
        ll.add(cs);

        /*
            Here sort, binarySearch, shuffle methods will work for only collection types of List.
                HashMap<String,String> hMap = new HashMap<>();
                hMap.put("Pappu","TaTa");
        */

        // The Frequency method to count number of occur, supported for all kind of collection.
        System.out.println(Collections.frequency(ll,cs));

        System.out.println(Collections.disjoint(ll,new ArrayList<>()));

        // The Shuffle Method of Collections Class.
        Collections.shuffle(ll, new Random());

        // Use of binarySearch method present Collections Class
        System.out.println(Collections.binarySearch(ll,cs)+" "+ll.get(5));

        // Min and Max comes with two variants, 1 is with Comparator and 2. Without Comparator(Direct collection.)
        Collections.min(ll);

        Collections.max(ll);




        System.exit(0);

        System.out.println("Using Enhanced For Loop");
        for(Cobrands c : ll){
            System.out.println(c.getCobId());
        }
        System.out.println("*************************************");

        System.out.println("Using ListIterator Next");
        ListIterator<Cobrands> llIter= ll.listIterator();
        while (llIter.hasNext()){
            Cobrands cobrands = llIter.next();
            System.out.println(cobrands.getCobId());
        }
        System.out.println("*************************************");

        System.out.println("Using ListIterator Previous");
        while (llIter.hasPrevious()){
            Cobrands cobrands = llIter.previous();
            System.out.println(cobrands.getCobId());
        }
        System.out.println("*************************************");

        Collections.sort(ll);
        System.out.println("Using Sorted ........... Enhanced For Loop");
        for(Cobrands c : ll){
            System.out.println(c.getCobId());
        }
        System.out.println("*************************************");

    }






}
