import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        String name = "Jaya";
        System.out.println("Hello, My name is "+ name);

	Scanner input= new Scanner(System.in);
	System.out.print("Enter your Budget in pence: ");
	if (!input.hasNextInt()){
		System.out.println("Enter your budget as a whole number: ");
		return;
	}
	int BudgetPence=input.nextInt();
	if(BudgetPence<0){
		System.out.println("Enter a budget of Zero pence or more.");
		return;
	}
	System.out.println("Budget in pence: "+BudgetPence);

	int totalExpensePence=0;
	System.out.println("How many expenses? ");
	if (!input.hasNextInt()){
		System.out.println("Enter the number of expenses as whole number");
		return;
	}
	int expenseCount=input.nextInt();
	if(expenseCount<0){
		System.out.println("Enter an expense count of zero or more");
		return;
	}
	
	for(int expenseNumber=1; expenseNumber<=expenseCount; expenseNumber++){
		int expensePence;
		
		while(true){
			System.out.println("Enter expense "+expenseNumber+" in pence");
			if(!input.hasNextInt()){
				System.out.println("Enter expense as a whole number");
				return;
			}
			expensePence=input.nextInt();
			if(expensePence>=0){
				break;
			}
			System.out.println("Enter an expense of 0 pence or more");
		}

		totalExpensePence = totalExpensePence+ expensePence;	
	}

	System.out.println("Total expense in pence: " + totalExpensePence);	

	int remainingPence=BudgetPence-totalExpensePence;
	System.out.println("Remaining in pence: "+remainingPence);

	if (remainingPence<0){
		System.out.println("You are over budget.");
	}
	else if (remainingPence==0){
		System.out.println("you have spent exactly your budget.");
	}
	else{
		System.out.println("You are within budget.");
	}
    }
}