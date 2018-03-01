/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;

class BRTest {
  private int calls = 0;
  private int succesfulCalls = 0;
  private int totalReturned = 0;
  private int randomNumber;
  
  private String[] exceptions = new String[] {"ArithmeticException", "NullPointerException",
    "ArrayIndexOutOfBoundsException", "ClassCastException", "NegativeArraySizeException"};
  private int[] excepCounts = new int[] {0,0,0,0,0};
  
  public void callIt(){
    calls = calls + 1;
    try{randomNumber = BadRandom.randVal();
      succesfulCalls = succesfulCalls + 1;
      totalReturned =+ totalReturned +randomNumber;
    }
    catch(Exception e){
      System.out.println(e);
      String exception =  e.toString();
      for (int i = 0; i < 4; i++) {
        if (exception == exceptions[i]) {
          excepCounts[i] = excepCounts[i] + 1;
        }
      }
    }
  }
  
  public void resetCounts(){
  calls = 0;
  succesfulCalls = 0;
  totalReturned = 0;
  for (int i = 0; i < 4; i++) {
    excepCounts[i] = 0;      
  }
  }
  
  public void nRandInts(int n){
    for (int i = 0; i < n; i++){
      do{
        callIt();
      }while(succesfulCalls < n);
    }
  }
  
  public void writeData(){
    System.out.println("number of calls: " + calls);
    System.out.println("Succesful calls: " + succesfulCalls);
    System.out.println("Total returned: " + totalReturned);
    System.out.println("Percentage " + exceptions[0] + ": " + (excepCounts[0]/calls*100));
  }
  
  public static void main(String[] args) {
BRTest me = new BRTest();
me.resetCounts();
me.nRandInts(30);
me.writeData();
}
  
}

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
  public void readAge () throws IOException {
    do{
    System.out.print("Input your age: ");
  
    try{age = Integer.parseInt(stdIn.readLine());
    }
    catch(IOException e) {
      System.out.println("IOException occured");
    }
    catch(NumberFormatException e) {
      age = -1;
      System.out.println("Enter integer");
    }
    } while(age < 0 || age > 150);
  }


  public void printName () {
    System.out.println("Name: " + name);
  }
   public void printAge () {
    System.out.println("Age: " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
    me.readAge();
    me.printAge();
  }
}



  
  