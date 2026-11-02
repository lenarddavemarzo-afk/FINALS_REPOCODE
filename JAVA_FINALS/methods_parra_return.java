import java.util.Scanner;
public class methods_parra_return{

    static int measure(int lenght, int width) {

        System.out.println("\nNo user input\n");

        return lenght * width;

    }

    public static void main(String[] args){
        int plywood = measure(4 , 8);
            System.out.println("The plywood overall measure is " + plywood);

    }
} 

    static int Plyboard(int lengths, int Widths, int Heights){

        return lengths + Widths + Heights;
    }

    public static void main (String[] args){

        System.out.println("\nWith user input\n");

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Lenght: ");
                int lengths = sc.nextInt();

            System.out.print("Enter Width: ");
                int Widths = sc.nextInt();

            System.out.print("Enter Height: ");
                int Heights = sc.nextInt();

                    int measures = Plyboard(lengths, Widths, Heights);
                        System.out.println("Your overall plyboard is " + measures);
                    
                    
    }
