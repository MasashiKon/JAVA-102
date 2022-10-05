public class PrintF {
    
    public static void main(String[] args) {
        
        //Conversion of type characters
        
        //For integers
        System.out.printf("%d%n", 10);

        //For float and double
        System.out.printf("%.3f%n", 10.1);

        //For character
        System.out.printf("%c%n", 'a');
        System.out.printf("%C%n", 'a');

        //For strings
        System.out.printf("%s%n", "hello");
        System.out.printf("%S%n", "hello");

        //For boolean
        System.out.printf("%b%n", 5 > 3);
        System.out.printf("%b%n", "cat");
        System.out.printf("%b%n", null);

        //For scientific notation
        System.out.printf("%e%n", 10.123);
        System.out.printf("%E%n", 10.123);

        //For octal
        System.out.printf("%o%n", 10);

        //Hexa
        System.out.printf("%x%n", 10);

        //Hash
        System.out.printf("%h%n", "hello");
        System.out.printf("%H%n", "hello");
        System.out.printf("%h%n", "HELLO");

        // System.out.printf("%t");
        // System.out.printf("%s", "indented");

        int num1 = 10;
        int num2 = 20;

        System.out.printf("%d%d%d%n", num1, num2, 3);

        //new line 
        System.out.printf("%n");

        int num3 = 11;
        char percentage = '%';
        System.out.printf("Did you know, %d%c %s%n", num3, percentage, "of people are left handed?");

        //composition
        //%[argument_index]$[flags][width][.precision]

        double dblNum1 = 10.123;
        double dblNum2 = 12.3456789;

        System.out.printf("%f%n", dblNum1); // no precision, default to 6 decimal places

        System.out.printf("%.0f%n", dblNum2); 
        System.out.printf("%.1f%n", dblNum2); 
        System.out.printf("%.2f%n", dblNum2); 
        System.out.printf("%.3f%n", dblNum2); 
        System.out.printf("%.4f%n", dblNum2); 
        System.out.printf("%.5f%n", dblNum2); 
        System.out.printf("%.6f%n", dblNum2); 
        System.out.printf("%.7f%n", dblNum2); 
        System.out.printf("%.8f%n", dblNum2); 


        //with arg index
        System.out.printf("%3$d %1$d %2$d%n", 10 ,20 ,30);

        String str = "hello";
        char alphabet = 'A';
        System.out.printf("%.3s%n", str);
        // System.out.printf("%.0c%n", alphabet); //will not compile

        String name = "Maor";
        int age = 12;
        double gpa = 4.0;

        System.out.printf("%-7s%7s%n", "Name=", name);
        System.out.printf("%-7s%7d%n", "Age=", age);
        System.out.printf("%-7s%7.2f%n", "GPA=", gpa);


    }
}
