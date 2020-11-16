package project08_1;

public class PowerFailureException extends Exception {

	public PowerFailureException() {
		super("Power Failure");
	}
	
	public PowerFailureException(String msg) {
		super(msg);
	}

}
