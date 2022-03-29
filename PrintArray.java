import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int NUM_ITEMS;
        int i;
 

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = input.nextInt(); 

        System.out.print("Enter the values of all items (seperated by space): ");
        int[] items = new int[NUM_ITEMS]; 

        for (i = 0; i <NUM_ITEMS;i++){
            items[i] = input.nextInt(); 
        }
        System.out.print("The values are: [");

        for (i = 0 ; i < NUM_ITEMS; i++){
            System.out.print(items[i]);
           
            if (i != NUM_ITEMS -1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
        input.close();
    }
}