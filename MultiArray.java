public class MultiArray {
    public static void main(String[] args) {
        int numbers[][] = { {10,20,30,40}, {11,12,13,14}, {11,22,33,44} };
        System.out.println(numbers[2][2]);
        System.out.println("-------------------------------------");

    /*
     * 
           0    1   2   3
        0  10   20  30  40    
        1  11   12  13  14
        2  11   22  33  44
        3

     
    */

    for(int i=0; i<numbers.length; i++){
        for(int j =0; j<numbers.length; j++){
            System.out.print(numbers[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");

    int[][][] number = {
        { {10, 20, 30, 40}, {11, 12, 13, 14}, {11, 22, 33, 44} },
        { {45, 56, 67, 78}, {79, 80, 81, 82}, {83, 84, 85, 86} }
    };

    // Access and print an element of the 3D array
    System.out.println(number[0][0][2]);

    System.out.println("-------------------------------------");


    for (int i = 0; i < number.length; i++) {
        for (int j = 0; j < number[i].length; j++) {
            for (int k = 0; k < number[i][j].length; k++) {
                System.out.print(number[i][j][k] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        System.out.println(); // Add a blank line between "slices" in the third dimension
    }
    }
}

