import java.util.Scanner;
public class methods_sample{

    static boolean isEven(boolean num){
        if (num == true){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
            int num = sc.nextInt();
                int result = num % 2;
            System.out.println("The number is even: " + isEven(result == 0)); 
    }
}
    // TO RUN THE CODE ABOVE,COMMENT THE CODE BELOW AND UNCOMMENT THE CODE ABOVE

    static double BMI(double a, double b) {

        return a / b;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

           System.out.print("Enter your weight in kg: ");
                double a = sc.nextDouble();
    
            System.out.print("Enter your height in m: ");
                double b = sc.nextDouble();
            double final_b = b * b;
            System.out.printf("Your BMI is: %.2f%n", BMI(a, final_b));
}
