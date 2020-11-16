package project08_1;

public class TooMuchStuffException extends Exception {

	private int inputNumber;
	
	public TooMuchStuffException(String msg) {
		super(msg);
	}
	
	public TooMuchStuffException() {
		super("Too much stuff!");
	}
	
	public TooMuchStuffException(int number) {
		super("Too much stuff!");
		inputNumber = number;
	}
	
	public int getNumber() {
		return inputNumber;
	}
	
}
