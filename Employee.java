/* Decompiler 22ms, total 92ms, lines 47 */
package lab2;

import java.util.Date;

public class Employee extends Person {
   protected int salary;
   protected Date dateHire = new Date();
   Date date;

   public Employee(String name, String email, int salary) {
      super(name, email);
      this.date = this.dateHire;
      this.salary = salary;
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

   public String toString() {
      return "Employee: " + this.name;
   }

   public static void main(String[] args) {
   }
}
