public class Return {
    public static void main(String[] args) {
        show();
        System.out.println(add());
        System.out.println(sub());
        System.out.println(nu());
        System.out.println(boo());
        System.out.println(floatadd());
    }

    public static int num =10;

    // void - no return value
    // void doesnt support return
    public static void show(){
        System.out.println("Hello in show");
    }

    // no return type methods need return keyword inside them
    static int add(){
        return 0;
    }

    static String sub(){
        return "Hello in sub";
    }

    //return null doesnt give output but gives an address
    static String nu(){
        return null;
    }

    static boolean boo(){
        return true;
    }

    static float floatadd(){
        return 12.5f;
    }
}
// return doesnt give a side effect