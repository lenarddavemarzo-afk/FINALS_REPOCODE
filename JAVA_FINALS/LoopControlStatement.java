import java.util.Scanner;

public class LoopControlStatement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUsing continue statement\n");

        for (int i = 1 ; i <= 10; i++){
            if (i == 5){
                System.out.println("STUDENT 5 IS ABSENT");
                continue;
            
            }
            System.out.println("STUDENT " + i + " IS PRESENT");
        }


        System.out.println("\nUsing break statement\n");

        for (int j = 1; j <= 20; j++) {
            if (j == 10) {
                System.out.println("You're just here at 10km");
                break;
            }
            System.out.println(j + "km");
        }
    }
}