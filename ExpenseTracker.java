import java.util.Scanner;

public class ExpenseTracker {
    private float expense;


    public void setExpense()
    {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter expense: ");

            String userInput = myObj.nextLine();  // Read user input
            expense = Float.parseFloat(userInput);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public float getExpense(){
        return expense;
    }
        
    
}
