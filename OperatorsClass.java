class OperatorsClass{
    //to be edited
    public static void main(String args[]){
        //Assignment Operator
        int number = 25;
        int num = 25;
        System.out.println(number);
        System.out.println(num);

        //+ operator
        number += 5;
        num = 5;
        System.out.println(number);
        System.out.println(num);

        //- operator
        number -= 10;
        System.out.println(number);

        //* operator
        number *= 2;
        System.out.println(number);

        // '/' operator
        number /= 2;
        System.out.println(number);

        // % operator
        number %= 10;
        System.out.println(number);

        //Comparison Operator
        int num1 = 30;
        int num2 = 40;

        boolean value1 = num1 > num2;
        System.out.println(value1);

        boolean value2 = num1 < num2;
        System.out.println(value2);

        boolean value3 = num1 == num2;
        System.out.println(value3);
    }
}