class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String haircolor;

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and the color of my hair is " + haircolor);
      commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }
   
   public void growOlder() {
      age = age + 1;
   }
   
   public void giveKnighthood() {
      name = "Sir " + name;
   }
   
   public void growOlderBy(int years) {
      age = age + years;
   }
}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();
      
      System.out.println(ls.age);
      ls.growOlderBy(10);
      ls.talk();
      
      wp.giveKnighthood();
      wp.growOlder();
      wp.talk();
      

   }

}

