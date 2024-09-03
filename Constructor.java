public class Constructor{
    int i;
    String name="";
    public Constructor(int n1, int n2, int n3){
    }
    public Constructor(){
        int i=0;
        int j=10;
        String name="Hallelujah";
        System.out.println(i+"\n"+name);
        System.out.println(i+j);
        System.out.println("Hello in Construction");
    }
    public static void main(String args[]){
        Constructor obj=new Constructor();
        Constructor obj1=new Constructor(15,16,17);
    }
}