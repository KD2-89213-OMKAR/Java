package assignment;

public class Circle {
	private double myX;
	private double myY;
	private double diameter;
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.diameter = 100;
	}
	public Circle(double myX, double myY, double diameter) throws WrongInput {
		this.myX = myX;
		this.myY = myY;
		if(diameter < 0) {
			throw (new WrongInput("Diameter can't be negative."));
		}
		this.diameter = diameter;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws WrongInput {
		if(diameter < 0) {
			throw (new WrongInput("Diameter can't be negative."));
		}
		this.diameter = diameter;
	}

	public String getString() {
		return String.format("myX: %.2f\n myY: %.2f\n diameter: %.2f\n",myX ,myY, diameter);
	}
}

