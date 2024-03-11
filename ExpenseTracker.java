public class ExpenseTracker {
    private Expense _head;
    private Expense _tail;
    

    public void AddExpense()
    {
        Expense new_Expense = new Expense();
        if (_head == null){
            _head = new_Expense;
            _tail = new_Expense;
        }
        else{
            _tail.next = new_Expense;
            _tail.next.privious = _tail;
            _tail = new_Expense;
        }
    }      
    
    public void display_expenses(){
        Expense current = _head;
        while (current != null) {
            System.out.println(current.get_amount());
            current = current.next;
        }
    }
    
}
