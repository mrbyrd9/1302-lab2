/* Decompiler 13ms, total 94ms, lines 54 */
package lab2;

import java.util.Date;

public class Faculty extends Employee {
   private String researchInterest;
   Date date;

   public Faculty(String name, String email, int salary, String researchInterest) {
      super(name, email, salary);
      this.date = this.dateHire;
      this.researchInterest = researchInterest;
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

   public void setInterest(String interest) {
      this.researchInterest = interest;
   }

   public String getInterest() {
      return this.researchInterest;
   }

   public String toString() {
      return "Faculty: " + this.name;
   }

   public static void main(String[] args) {
   }
}
