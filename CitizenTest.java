class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;
   private int    networth;
   private String talk;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }
   public Citizen(String aName) {
       name = aName;
       salary = 0;
       savings = 0;
       loan = 0;
   }
   

   // Methods of the class...
   public int getSalary() {
      return salary;
   }
   public void setSalary(int aSalary) {
      salary = aSalary;
   }
   public void salaryRise(int amount) {
       salary = salary + amount;
   }
   public int netWorth() {
       networth = savings - loan;
       return networth;
   }
   public String toaString() {
       talk = name + " has a salary of " + salary + " and " + savings + " saved up";
       if (loan > 0) {
           talk = talk + " with a loan of " + loan;
       }
       
       return talk;
   }

}

class CitizenTest {
    
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);
      Citizen f = new Citizen("Fred");
      e.salaryRise(10000);
      System.out.println("Ernie's networth is: " + e.netWorth());
      System.out.println(b.toaString());
      System.out.println("Ernie's salary is: " + e.getSalary());
      System.out.println(f.toaString());
   }
}