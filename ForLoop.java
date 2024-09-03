import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int n;
        for (n=1; n<=10; n++){// for(initialization; condition; increment or decrement;)
            //n++ even output
            System.out.println(num+"*"+n+" = "+num*n);
            //n++ odd output
        }
        System.out.println(n);//will increment out of loop
    }
}
