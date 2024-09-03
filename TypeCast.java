public class TypeCast {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Implicit Type Casting
        byte bytenum = 10;
        short shortnum = bytenum;
        int intnum = shortnum;
        double doublenum = intnum;

        // Explicit Type Casting
        int num = 234;
        byte by = (byte) num;

        int charnum = 3;
        char charnum1 = (char) charnum;// explicit - int to char
        int charnum2 = charnum1;// implicit - char to int
         
        char alpha = 'A';
        int alphanum = alpha;// implicit - char to int

    }
}
