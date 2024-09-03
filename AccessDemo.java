public class AccessDemo {
    //to be edited
    private int n1;
    public int n2;
    protected int n3;
    int n4 = 40;
    void inClass(){
        n1 = 10;
        n2 = 20;
        n3 = 30;
        n4 = 40;
    }
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.inClass();
        System.out.println(obj.n1);
        System.out.println(obj.n2);
        System.out.println(obj.n3);
        System.out.println(obj.n4);
    }

}

class OutClass{
    
}
