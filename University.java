/* Decompiler 3ms, total 72ms, lines 29 */
package lab2;

public class University {
   public static void main(String[] args) {
      Person zack = new Person("Zack", "Zack@gmail.com");
      Faculty ann = new Faculty("Ann", "Ann@ung.edu", 72000, "Economics");
      Staff bob = new Staff("Bob", "Bob@ung.edu", 49000, "admin");
      Student john = new Student("John", "john@ung.edu", "junior");
      Employee max = new Employee("Max", "max@ung.edu", 50000);
      System.out.println(zack);
      System.out.println(bob);
      System.out.println(john);
      System.out.println(ann);
      System.out.println(max + "\n");
      ann.setEmail("ann@ung.edu");
      System.out.println(ann.email);
      System.out.println(zack.email);
      System.out.println(bob.email);
      System.out.println("Ann's interest is " + ann.getInterest());
      ann.setInterest("Finance");
      System.out.println("Ann's new interest is " + ann.getInterest());
      bob.setTitle("Dean");
      System.out.println("Bob is a " + bob.getTitle());
      System.out.println(bob.date);
      System.out.println(ann.date);
      System.out.println(max.date);
   }
}
