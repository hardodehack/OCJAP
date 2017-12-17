package InnerClasses;

public class MethodInnerClass_2 {

    private String outer = "Outer Private Method....";

    public void myInnerClassMethod(){
        class MethodInnerClass{
            void getOuter(){
                System.out.println(outer);
            }

        }
        // YOU HAVE TO INSTANTIATE A METHOD LOCAL CLASS HERE ONLY.. MEANS BEFORE END OF METHOD...........
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.getOuter();
    }


    public static void main(String[] args) {

        MethodInnerClass_2 methodInnerClass_2  = new MethodInnerClass_2();
        methodInnerClass_2.myInnerClassMethod();
    }


}
