package ru.ponomarev.lessons;

import java.util.Scanner;

public class InteractRunner1 {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculatorsum calс = new Calculatorsum();
			String exit = "no";
			while (!exit.equals("yes")){
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				try {
					calс.div(Integer.valueOf(first), Integer.valueOf(second));
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Введите аргументы!");
				}
				System.out.println("Result: "+ calс.getResult());
				calс.cleanResult();
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
}