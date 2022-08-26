// Fig. 10.13: Employee.java

package payroll.logic;

public abstract class Employee{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // three-argument constructor
   public Employee( String first, String last, String ssn ){
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } // end three-argument Employee constructor

   // abstract method overridden by concrete subclasses
   public abstract double earnings(); // no implementation here

   // return the taxes that the employee has to pay
   public double taxes() {
      double earnings = earnings();
      if (earnings > 400.0) {
         if (earnings-400 > 500)
            return 50.0 + (earnings - 900) * 0.20;
         else
            return (earnings - 400) * 0.10;
      }
      return 0.0;
   }

   // return String representation of Employee object
   public String toString(){
      return String.format( "%s %s\nsocial security number: %s \nearnings: %.2f ",
         getFirstName(), getLastName(), getSocialSecurityNumber(), earnings() );
   } // end method toString
      
   // two-argument constructor
   public Employee( String first, String last ){
       this(first, last, "");
   } // end two-argument Employee constructor
   
   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber

    public String iniTials(){
        return this.firstName.substring(0, 1)+"."+this.lastName.substring(0,1)+".";
    }
} // end class Employee


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
