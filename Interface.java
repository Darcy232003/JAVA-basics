public class Interface {
    public static void main(String[] args) {
       MyInterface obj = new MyClass();
       obj.show();
       obj.display(); 
    }
}

interface MyInterface{
    void show();

    void display();
}

class MyClass implements MyInterface{
    @Override
    public void show(){

    }

    @Override
    public void display(){

    }
}
