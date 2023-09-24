public class Main1 {
    public static void main(String[] args) {
        AccessModifiersDemo myObj = new AccessModifiersDemo();
        System.out.println(myObj.getPrivateVar(10));
        System.out.println(myObj.getDefaultVar(2.5));
        System.out.println(myObj.getProtectedVar(true));
        System.out.println(myObj.getPublicVar("bool"));

        SubclassDemo myObj1 = new SubclassDemo();
        myObj1.displayProtectedVar();

    }
}