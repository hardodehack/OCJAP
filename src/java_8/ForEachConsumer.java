package java_8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachConsumer {

    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=1;i<=10;i++) aList.add(i);

        System.out.println(" Method 1");
        System.out.println("*******************************************");
        aList.forEach(new MyConsumer());

        System.out.println(" Method 1 in 2");
        System.out.println("*******************************************");
        aList.forEach(new MyConsumer2());

        System.out.println(" Method 2");
        System.out.println("*******************************************");
        aList.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer o) {
                System.out.println("Calling with Anonymous Inner Class "+o);
            }
        });

        Consumer<Integer> lambda = (Integer o) ->{
            System.out.println("Yieeepiiii Traversing using Consumer forEach and Lambda Expressions... "+o);
        };
        System.out.println(" Method 3");
        System.out.println("*******************************************");
        aList.forEach(lambda);
    }
}

class MyConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer o) {
        System.out.println("Iterating through forEach with *** MyConsumer *** Class... "+o);
    }
}

class MyConsumer2 implements Consumer<Integer>{
    @Override
    public void accept(Integer o) {
        System.out.println("Iterating through forEach *** MyConsumer2 *** Class... "+o+7+" Added 7 Here.. Check it is not adding 7 as a Int.");
    }
}