/* Decompiler 3ms, total 74ms, lines 35 */
package lab2;

public class Person {
   protected String name;
   protected String email;

   public Person(String name, String email) {
      this.name = name;
      this.email = email;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public String toString() {
      return "Person: " + this.name;
   }

   public static void main(String[] args) {
   }
}
