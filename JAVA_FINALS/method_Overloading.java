import java.util.Scanner;
public class method_Overloading {

    public static String displayInfo(String name) {
        return name;
    }

    public static int displayInfo(int age) {
        return age;
    }

    public static double displayInfo(double height) {
        return height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        String nameResult = displayInfo(name);
        int ageResult = displayInfo(age);
        double heightResult = displayInfo(height);

            System.out.println("Your Name is: " + nameResult + " and you are " + ageResult + " years old." + " Your Height is " + heightResult + " meters");
            

    }
}

    