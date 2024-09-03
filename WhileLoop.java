import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n=0;
        while(n<5){// while(condition)
            // n++ odd output
            System.out.println("Oi!"+n);
            n++;
        }
        System.out.println(n);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        while(n<11){
            System.out.println(num*n);
            n++;
        }
    }
}
