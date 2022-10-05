import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scan;
        int radius;

        scan = new Scanner(System.in);

        System.out.print("Input the radius: ");
        radius = scan.nextInt();

        System.out.print("The area is: " + (radius * Math.PI));

        scan.close();
    }
    
}
