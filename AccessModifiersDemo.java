public class AccessModifiersDemo {
    private int privateVar;
    double defaultVar;
    protected boolean protectedVar;
    public String publicVar;


    public int getPrivateVar(int A) {
        int privateVar = A;
        return privateVar;
    }

    double getDefaultVar(double B) {
        double defaultVar = B;
        return defaultVar;
    }

    protected boolean getProtectedVar(boolean C) {
        boolean protectedVar = C;
        return protectedVar;

    }

    public String getPublicVar(String D) {
        String publicVar = D;
        return publicVar;
    }

}