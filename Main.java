import java.util.Scanner;
public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Hello World");

    
    ExpenseTracker Personal = new ExpenseTracker();
    


    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }

    Scanner myObj = new Scanner(System.in);
    int userInput = 0;
    int countTest = 0;
    while (true) {
      try  {
        System.out.println("1. Add and expense");
        System.out.println("2. display expenses");
        System.out.println("3. quit");
        System.out.print("Enter menu number (1 or 2): ");

        userInput = 0;
        
        try {
          userInput = myObj.nextInt();  // Read user input
          countTest += 1;
        } catch (Exception e) {
          System.out.println("This scanner line is the problem");
          System.out.println(countTest);
          break;
        }
        
        
      


        if (userInput == 1){
          System.err.println("one works");
          Personal.AddExpense();
        }
        else if (userInput == 2){
          Personal.display_expenses();
        }
        else if (userInput == 3){
          break;
        }
        else{
          System.out.println("Invalid response.");
        }}
        
      catch (Exception e) {
          System.err.println("scanner problem");
        }
      myObj.close();
  } 
    }}
  



