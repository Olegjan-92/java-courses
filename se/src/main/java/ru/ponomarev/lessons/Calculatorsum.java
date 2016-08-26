package ru.ponomarev.lessons;

public class Calculatorsum {
	private int result;
	public void add(int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}public void div(int ... args) throws  UserException{
		if (args.length > 0) {
			this.result = args[0];
			for (int params : args) {
				if (params == 0){
					throw new IllegalArgumentException("Деление на ноль");
				}
				this.result /= params;
			}
		}
		else {
			throw new UserException("Вы должны ввести аргументы!");
		}
	}
	public int getResult() {
		return this.result;
	}
	public void cleanResult() {
		this.result = 0;
	}
}