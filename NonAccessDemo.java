public class NonAccessDemo {
    //to be edited
    public static void main(String[] args) {
        System.out.println(num1);
        show();
        System.out.println(OtherClass.num2);//you can call static variables and methods from other class by mentioning its name
        OtherClass.display();
    }
    static int num1 = 10;
    static void show(){
        System.out.println("Hello in show()");
        OtherClass.display();
    }
}

class OtherClass{
    static void display(){
        System.out.println("Yo!");
    }
    static int num2 = 29;
}