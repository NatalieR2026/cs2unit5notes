public class Main {

   // This iis the "TESTER CLASS" with a main method

   public static void main(String []args) {
      System.out.println("Constructing Student Objects...");

      // Call DEFAULT CONSTRUCTOR
      // "Student senior" is the type declaration
      // "= new Student()" is calling the constructor
      Student kinder = new Student();

      // Call CONSTRUCTOR with PARAMETERS (String, String, int)
      Student junior = new Student("Paige", "Nunez", 2026);
      // Does argument order matter?? Yes!
      // Student senior = new Student(2025, "Zoie", "Vitale");

      // Look at our constructed Student objects
      System.out.println(kinder); // will print the LOCATION of the object
      // unless our class has a toString method defined

      // Test ACCESSOR/GETTER methods
      // methods that RETURN output need to be handled
      // 1. eitherr by storing the output in a variable
      String juniorEmail = junior.getEmail();
      System.out.println(juniorEmail);
      // 2. or by using the method call directly
      System.out.println(kinder.getEmail());

   }
}
