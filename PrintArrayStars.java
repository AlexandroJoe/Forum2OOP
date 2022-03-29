
import java.util.Scanner;

public class PrintArrayStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int NUM_ITEMS;
        int a;
        int b;

        System.out.print("Enter number of items: ");
        NUM_ITEMS = input.nextInt(); 
    
        System.out.print("Enter number of items (seperated by space): ");
        int[] stars = new int[NUM_ITEMS]; 

        for (a = 0; a < NUM_ITEMS; a++){
            stars[a] = input.nextInt();
        }

        for (a=0; a< NUM_ITEMS; a++){
            System.out.print(a+ ": "); 
            for (b = 0; b < stars[a]; b++){
                System.out.print("*"); 
            }
            System.out.println("(" + stars[a] + ")");
        }
        input.close();
    }
}