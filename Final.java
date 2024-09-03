public class Final {
    public static void main(String[] args){
        CClass obj = new CClass();
        obj.show();
    }
}

final class AClass{// final keyword on class prohibits other class from extending from it.
    int savings = 2500000;
    void business(){
        System.out.println("Family Business");
    }

    void home(){
        System.out.println("Parent Home");
    }
}

class BClass{
    final void show(){// final keyword in method prohibits other classes from overiding it but we can call it
        System.out.println("Hello in B");
    }

    final int save = 3000000;// final variable value can not be changed by other class.
}

class CClass extends BClass{

}