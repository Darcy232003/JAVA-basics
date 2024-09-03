public class HelloPune {
    //JVM only searches for main method and executes it.
    //String array is used to store everything in the main method.
    public static void main(String[] args){
        int num=10;
        char alpha='a';
        System.out.println("Hello Pune in main method");
        System.out.println(num);
        System.out.println(alpha);

    }
}
//only the class which has main method will execute.
class HelloNBN{
    public static void msg(){
        System.out.println("Hello Pune");
    }
}
