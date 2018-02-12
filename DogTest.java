class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   
   // Methods of the class...
   public String toString() {
      return "I'm a dog called " + name + ", I'm " + age + " years old and I have a flea named " + dogsFlea.name;
   }

}

class DogOwner {
   // Properties of the class...
   private String name;
   private int salary;
   public Dog ownersDog;
   
   // Constructer of the class..
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }
   
   // Methods of the class...
   public String toString() {
      return "I'm a man called " + name + " with a salary of " + salary + " and a dog named " + ownersDog.name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");
      
      Dog r = new Dog("Rex", 7, p);
      Dog j = new Dog("Jimbo", 7, s);
      Dog f = new Dog("Fido", 7, z);
      
      DogOwner a = new DogOwner("Angus", 1000, r);
      DogOwner b = new DogOwner("Brian", 1000, j);
      DogOwner c = new DogOwner("Charles", 1000, f);
      
      System.out.println(r.toString());
      System.out.println(j.toString());
      System.out.println(f.toString());
      
      System.out.println(a.toString());
      System.out.println(b.toString());
      System.out.println(c.toString());
      
      System.out.println(a.ownersDog.dogsFlea.toString());
   }
}
