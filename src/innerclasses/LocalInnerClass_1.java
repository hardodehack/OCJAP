package innerclasses;

public class LocalInnerClass_1 {

    private String outerVar="Private Variable from Outer.....";

    private class InnerClass{
        private void getOuterPrivate(){
            System.out.println(outerVar);
        }
    }

    //static will not allow in below signature.
    public void forInnerObj(){
        // You can directly create Object of InnerClass in Non_Main Method.
        InnerClass in2 = new InnerClass();
        in2.getOuterPrivate();
    }

    public static void main(String[] args) {
        //Here You have to create Outer Class object first and then you will get InnerClass Object.
        InnerClass in = new LocalInnerClass_1().new InnerClass();
        in.getOuterPrivate();
    }

}
