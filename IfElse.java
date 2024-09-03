import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int n = sc.nextInt();

        if (n>18) {
            System.out.println("Person is eligible for voting");
        }
        else{
            System.out.println("Person is not eligible for voting");
        }

        String msg =(n > 18) ? "Voter" : "Not a voter"; //ternary operator

        System.out.println(msg);

        String rep = (n > 0) ? "Positive" : (n == 0) ? "Neutral" : "Negative";

        System.out.println(rep);
    }
}
