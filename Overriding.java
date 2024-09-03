public class Overriding {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.speak();
        Cat obj = new Cat();
        obj.speak();
    }
}

class Animal{

    void speak(){
        System.out.println("Welcom to Animal Farm");
    }
}

class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Cat says Meow");
    }
}
