import java.util.Scanner;

public class IODemo {
    public static void main(String[] args) {
        Hello h1 = new Hello();//Inheritance
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);//creating object for scanner

        h1.msg();
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello "+ name);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Hello "+age);
        System.out.println("Enter your Salary");
        float Salary = sc.nextFloat();
        System.out.println("Hello "+ Salary);
    }
}

class Hello{
    void msg(){
        System.out.println("Hello NBN");
    }
}