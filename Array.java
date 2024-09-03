public class Array {
    //to be edited
    public static void main(String[] args) {
        String cities[] = {"Nagpur", "Pune", "Nashik", "Akola"};
        int i=0;
        while(i<cities.length){
            System.out.println(cities[i]+ " ");
            i++;
        }

        char letters[] = {'A', 'B', 'C', 'D'};
        do{
            System.out.println(letters[i]+ " ");
            i++;
        }
        while(i<letters.length);
    }
}
