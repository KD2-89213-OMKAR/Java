package assignment;

public class WrongInput extends Exception {
	private String invalidMessage;
	
	public WrongInput() {
		this.invalidMessage = "";
	}
	public WrongInput(String mess) {
		this.invalidMessage = mess;
	}
	public String getInvalidMessage() {
		return invalidMessage;
	}
	public void setInvalidMessage(String invalidMessage) {
		this.invalidMessage = invalidMessage;
	}
	public String getString() {
		return String.format("%s", invalidMessage);
	}
}
