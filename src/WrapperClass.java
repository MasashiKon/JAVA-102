public class WrapperClass {
    
    public static void main(String[] args) {
        
        /*
         * Why we need wrapper class?
         * 
         * 1) Wrapper class will convert primitive data types into objects.
         * 2) Data structures in collection framework 
         */

         int valueInt = 123;
         Integer value = 123;

         double valueDouble = 123.5d;
         Double valueDbl = 123.5;

         System.out.println(valueDbl.doubleValue());
         System.out.println(valueDouble == valueDbl.doubleValue());

         Integer myInt = 100;
         String myString = myInt.toString();
         System.out.println(myString);
         System.out.println(myString.getClass().getName());
         
    }
}
