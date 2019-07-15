import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
			System.out.println("Welcome us calu!");
			System.out.println("Enter your first num:");
			Scanner bu = new Scanner(System.in);
			int num1 = bu.nextInt();
			System.out.println("What action do you want to perform?");
			System.out.println("Enter: 1 for '+' 2 for '-' 3 for '*' 4 for '/' 5 for '%'");
			int acti = bu.nextInt();
			if (acti == 1) {
				System.out.println("Enter your second num:");
				int num2 = bu.nextInt();
				int answer = num1 + num2;
				System.out.println(num1 + "+" + num2 + "=" + answer);
			} else if (acti == 2){
				System.out.println("Enter your second num:");
				int num2 = bu.nextInt();
				int answer = num1 - num2;
				System.out.println(num1 + "-" + num2 + "=" + answer);
			} else if (acti == 3){
				System.out.println("Enter your second num:");
				int num2 = bu.nextInt();
				int answer = num1 * num2;
				System.out.println(num1 + "*" + num2 + "=" + answer);
			} else if (acti == 4){
				System.out.println("Enter your second num:");
				int num2 = bu.nextInt();
				int answer = num1 / num2;
				System.out.println(num1 + "/" + num2 + "=" + answer);
			} else if (acti == 5){
				System.out.println("Enter your second num:");
				int num2 = bu.nextInt();
				int answer = num1 % num2;
				System.out.println(num1 + "%" + num2 + "=" + answer);
			} else
				System.out.println("You musted enter to 1 for 5");
			bu.close();
		}

	}