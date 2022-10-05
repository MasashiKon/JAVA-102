import java.util.Scanner;

public class Echo {
    
    public static void main(String[] args) {
        
        Scanner scan;
        String inputData;
        int inputNum;

        scan = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // inputData = scan.next(); //[0]
        // System.out.println("Your name is: " + inputData);
        // inputData = scan.next(); //[1]
        // System.out.println("Your name is: " + inputData);

        System.out.println("Enter a number: ");
        inputNum = scan.nextInt();
        System.out.println("The number entered is: " + inputNum);

        scan.close();
    }
}
