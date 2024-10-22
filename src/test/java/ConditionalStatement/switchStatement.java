package ConditionalStatement;

class calNoOfDays {

	static int noOfDays(int year, int month) {
		int noOfDays = 0;

		switch (month) {
		case 1:
			noOfDays = 31;
			break;
		case 2:
			noOfDays = 29;
			break;
		case 3:
			noOfDays = 31;
			break;
		case 4:
			noOfDays = 30;
			break;
		case 5:
			noOfDays = 31;
			break;
		case 6:
			noOfDays = 30;
			break;
		case 7:
			noOfDays = 31;
			break;
		case 8:
			noOfDays = 30;
			break;
		case 9:
			noOfDays = 31;
			break;
		case 10:
			noOfDays = 30;
			break;
		case 11:
			noOfDays = 31;
			break;
		case 12:
			noOfDays = 30;
			break;
		default:
			System.out.println("invalid month");
		}
		return noOfDays;
	}
}

public class switchStatement {
	public static void main (String[]arg) {
//static method called by its class name. Storing the value of static method on result variable who returning int value		
		int result=calNoOfDays.noOfDays(2000, 3); 
		System.out.println("Days in month: "+result);
		
	}
}
