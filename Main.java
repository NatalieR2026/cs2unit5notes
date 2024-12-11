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

      // Construct two more Student objects and print them out
      Student senior = new Student("Alex", "Greenholtz", 2025);
      System.out.println(senior);
      Student sophomore = new Student("Kyanni", "Gonzalez", 2027);
      System.out.println(sophomore);

   }
}
