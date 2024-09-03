public class recursion {
    public static void main(String[] args){
        num();
    }

    static void num(){
        int A = 'A';
        System.out.println(A);
        num1();
    }

    static void num1(){
        System.out.println("Hello in 1");
    }
}
