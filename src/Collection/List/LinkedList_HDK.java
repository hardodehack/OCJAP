package Collection.List;

import Collection.Cobrands;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_HDK {

    public static void main(String[] args) {

        LinkedList<Cobrands> ll = new LinkedList<>();


        ll.add(new Cobrands(1,"ABSDHFJD788"));
        ll.add(new Cobrands(4,"CBSDHFJD788"));
        ll.add(new Cobrands(5,"TBSDHFJD788"));
        ll.add(new Cobrands(0,"JBSDHFJD788"));
        ll.add(new Cobrands(2,"OBSDHFJD788"));
        ll.add(new Cobrands(7,"ZBSDHFJD788"));


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
