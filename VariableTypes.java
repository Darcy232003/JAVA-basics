public class VariableTypes {
    static int n1;// instance variable - can be accessed inside the class
    static int n2;
    int number1;
    int number2;
    public static void main(String[] args) {
        //n1 = 20;
        //n2 = 30;
        add();
        int sum = n1 + n2;
        System.out.println(sum);

        VariableTypes obj = new VariableTypes();
        obj.number1 = 10;
        obj.number2 = 20;

        int sum2 = obj.number1 + obj.number2;
        System.out.println(sum2);
    }

    static void add(){
        int num1 = 10;
        int num2 = 29; // local variable - can be accessed only inside the method
                        // cant be made static or given any access modifier.
        n1 = num1;
        n2 = num2;
    }
}
