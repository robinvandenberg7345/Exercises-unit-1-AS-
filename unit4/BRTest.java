/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;

public class BRTest {
  private int calls = 0;
  private int succesfulCalls = 0;
  private int totalReturned = 0;
  private int randomNumber;
  
  private String[] exceptions = new String[] {"java.lang.ArithmeticException: ArithmeticException: Division by zero!", 
    "java.lang.NullPointerException: NullPointerException: Uninitialised object reference.",
    "java.lang.ArrayIndexOutOfBoundsException: ArrayIndexOutOfBoundsException: Accessing 11th element of  10 element array!", 
    "java.lang.ClassCastException: ClassCastException: Casting apples into oranges.", 
    "java.lang.NegativeArraySizeException: NegativeArraySizeException: Squaaawk!  Screetch. Burp."};
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
      System.out.println(exception);
      for (int i = 0; i < 5; i++) {
        if (exceptions[i].equals(exception)) {
          excepCounts[i] = excepCounts[i] + 1;
        }
      }
    }
  }
  
  public void resetCounts(){
  calls = 0;
  succesfulCalls = 0;
  totalReturned = 0;
  for (int i = 0; i < 5; i++) {
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
    System.out.println("Percentage Arithmetic Exceptions: " + ((float) excepCounts[0]/ (float)calls*100));
    System.out.println("Percentage Null Pointer Exceptions: " + ((float) excepCounts[1]/ (float)calls*100));
    System.out.println("Percentage Array Index Exceptions: " + ((float) excepCounts[2]/ (float)calls*100));
    System.out.println("Percentage Class Cast Exceptions: " + ((float) excepCounts[3]/ (float)calls*100));
    System.out.println("Percentage Negative Array Exceptions: " + ((float) excepCounts[4]/ (float)calls*100));
    System.out.println("Percentage of succesful calls: " + ((float) succesfulCalls/ (float)calls*100));
  }
  
  public static void main(String[] args) {
BRTest me = new BRTest();
me.resetCounts();
me.nRandInts(30);
me.writeData();
}
  
}