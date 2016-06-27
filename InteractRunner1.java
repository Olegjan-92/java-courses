import java.util.Scanner;

public class InteractRunner1 {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculatorsum calssum = new Calculatorsum();
			Calculatorraz calsraz = new Calculatorraz();
			String exit = "no";
				while (!exit.equals("yes")){
					System.out.println("Выберите операцию: +/- ");
					String oper = reader.next();
					System.out.println("Enter first arg: ");
					String first = reader.next();
					System.out.println("Enter second arg: ");
					String second = reader.next();
					if (oper.equals("+")){
					calssum.add(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calssum.getResult());
					calssum.cleanResult();
					}
					if (oper.equals("-")){
					int arg1 = Integer.valueOf(first);
					int arg2 = Integer.valueOf(second);
					int sum = arg1 - arg2;
					System.out.println("Result: " + sum);
					}
					System.out.println("Exit: yes/no ");
					exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
}