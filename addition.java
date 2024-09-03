import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition: "+sum);
    }
}
