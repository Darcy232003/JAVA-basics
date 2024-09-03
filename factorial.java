import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    static long fact(int n){
        if (n == 0 | n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
