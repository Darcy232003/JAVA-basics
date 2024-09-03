import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your college year");
        int year = sc.nextInt();

        switch (year){
            case 1:
                System.out.println("Hello in first year");
                break;

            case 2:
                System.out.println("Hello in second year");
                break;

            case 3:
                System.out.println("Hello in third year");
                break;

            case 4 :
                System.out.println("Hello in final year");
                break;

            default:
                System.out.println("Please enter correct year");
                break;
        }
    }
}
