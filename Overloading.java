public class Overloading {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum(20,30);
        obj.sum(30, 40, 50);
        obj.sum(12.7f, 30.5f);
        obj.sum("Gojo", " Satoru");
        obj.sum();
        System.out.println(obj.sum(12.7, 3.5));
    }
}

class Add{

    void sum(){
        int n1=10;
        int n2=20;
        int result= n1+n2;
        System.out.println(result);
    }

    double sum(double n1, double n2){
        double  result = n1+n2;
        return result;
    }

    void sum(int n1, int n2){
        int result = n1+n2;
        System.out.println(result);
    }

    void sum(int n1, int n2, int n3){
        int result = n1 + n2 + n3;
        System.out.println(result);
    }

    void sum(float n1, float n2){
        float result = n1 + n2;
        System.out.println(result);
    }

    void sum(String n1, String n2){
        String result = n1 + n2;
        System.out.println(result);
    }
}