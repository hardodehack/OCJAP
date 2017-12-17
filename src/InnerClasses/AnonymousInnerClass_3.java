package InnerClasses;

interface ForAnnonInterface{
    void fromInterfaceAnno();
}

public class AnonymousInnerClass_3 {
    void doStuff(){
        ForAnnonInterface annonInterface = new ForAnnonInterface() /* Yes This is Possible in Anonymous Interface Case. */ {
            @Override
            public void fromInterfaceAnno() {
                System.out.println("Calling From Anonymous Interface........");
            }
            public void youCanNotAccessMe(){
                System.out.println("You Cann't Access Me from Any Ways.......");
            }
        };

        annonInterface.fromInterfaceAnno();

        //annonInterface.youCanNotAccessMe();
        /*  You will never able to acces this method....
            As It is not Present in the Interface, using which we have created Anno Inner Class Object..
         */
    }// End of doStuff.

    public static void main(String[] args) {

        AnonymousInnerClass_3 ann = new AnonymousInnerClass_3();
        ann.doStuff();

        int h = Integer.valueOf("123");


    }

}
