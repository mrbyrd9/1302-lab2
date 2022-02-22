/* Decompiler 3ms, total 78ms, lines 54 */
package lab2;

import java.util.Date;

public class Staff extends Employee {
   private String title;
   Date date;

   public Staff(String name, String email, int salary, String title) {
      super(name, email, salary);
      this.date = this.dateHire;
      this.title = title;
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

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getSalary() {
      return this.salary;
   }

   public void setTitle(String Title) {
      this.title = Title;
   }

   public String getTitle() {
      return this.title;
   }

   public String toString() {
      return "Staff: " + this.name;
   }

   public static void main(String[] args) {
   }
}
