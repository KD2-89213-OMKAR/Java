package assignment;

public class ExceptionLineTooLong extends Exception {
	private String invalidMessage;
	private int invalidField;
	
	public ExceptionLineTooLong() {
		this.invalidField = 0;
		this.invalidMessage = "";
	}
	public ExceptionLineTooLong(String mess, int num) {
		this.invalidMessage = mess;
		this.invalidField = num;
	}
	public String getInvalidMessage() {
		return invalidMessage;
	}
	public void setInvalidMessage(String invalidMessage) {
		this.invalidMessage = invalidMessage;
	}
	public int getInvalidField() {
		return invalidField;
	}
	public void setInvalidField(int invalidField) {
		this.invalidField = invalidField;
	}
	public String getString() {
		return String.format("%s = %d", invalidMessage, invalidField);
	}
}
