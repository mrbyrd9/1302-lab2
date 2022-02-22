/* Decompiler 3ms, total 76ms, lines 34 */
package lab2;

public class Student extends Person {
   private String classStatus;

   public Student(String name, String email, String classStatus) {
      super(name, email);
      this.classStatus = classStatus;
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
      return "Student: " + this.name;
   }

   public static void main(String[] args) {
   }
}
