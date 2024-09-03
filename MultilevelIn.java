public class MultilevelIn {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();
        obj.num1=20;
        System.out.println(obj.num1);

        C objc = new C();
        objc.show();
        objc.display();
    }

}

// Parent class
class A{
    int num1=10;
    void show(){
        System.out.println("Hello in class A");
    }

    void display(){
        System.out.println("Hello in class A");
    }
}

//child class
class B extends A{
    //@Override
    void display(){
        System.out.println("Hello in class B");
    }
}

class C extends B{

}

class D extends C{

}
