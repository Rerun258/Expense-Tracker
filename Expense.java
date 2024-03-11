import java.util.Scanner;

public class Expense 
{
    private double _amount;
    private String _placeName;
    Expense next;
    Expense privious;
    
    public Expense(){
        // set the amount
        Scanner myObj = new Scanner(System.in);
            System.out.print("Enter expense: ");
            
            double userInput = myObj.nextDouble();  // Read user input
            myObj.nextLine();

            
            set_amount(userInput);

            System.out.print("Enter place name: ");
            
            
            String userInputStr = myObj.nextLine();  // Read user input
            
            set_placeName(userInputStr);
            
            myObj.close();
    }
    

    public double get_amount() {
        return _amount;
    }

    public void set_amount(double _amount) {
        this._amount = _amount;
    }

    public String get_placeName() {
        return _placeName;
    }

    public void set_placeName(String _placeName) {
        this._placeName = _placeName;
    }

    public Expense getNext() {
        return next;
    }

    public void setNext(Expense next) {
        this.next = next;
    }

    public Expense getPrivious() {
        return privious;
    }

    public void setPrivious(Expense privious) {
        this.privious = privious;
    }
}
