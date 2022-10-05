import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scan;
        int cents;

        scan = new Scanner(System.in);

        System.out.print("Input the cents :");

        cents = scan.nextInt();

        System.out.printf("The value is %1$d dollors and %2$2d cents", cents / 100, cents % 100);

        scan.close();
    }
    
}
