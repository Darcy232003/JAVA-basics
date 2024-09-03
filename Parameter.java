public class Parameter {
    public static void main(String[] args) {
        Addition.add();// no need to pass values in non parameterized
        Addition.add1(20);// need to pass values in parameterized
        Addition.add2(30, 40);
        Addition.hello("Aru");
    }
}

class Addition{
    static void add(){// non parameterizeed
        int n1=10;
        int n2=20;
        System.out.println(n1+n2);
    }

    static void add1(int num1){ // single parameter
        int n1=num1;
        int n2=20;
        System.out.println(n1+n2);
    }

    static void add2(int n1, int n2){ // double parameter
        System.out.println(n1+n2);
    }

    static void hello(String name){
        System.out.println("Hello "+name);
    }

}