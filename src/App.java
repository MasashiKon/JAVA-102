public class App {
    public static void main(String[] args) throws Exception {

        String str1 = "This is a string";
        String str2 = new String("This is a string object");
        String str4 = new String("This is a string object");
        String str3 = new java.lang.String("This is also a string");

        String str = new String("CoffeeOrTea"); // create the original object
        System.out.println("Before substring: " +str);
        
        String sub = str.substring(8); // create a new object from the original
        
        System.out.println("After substring: " +str);
        System.out.println(sub);

        // System.in

    }
}
