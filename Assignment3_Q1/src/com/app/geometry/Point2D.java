package com.app.geometry;
import static java.lang.Math.*;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		this(0.0, 0.0);
	}
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public boolean isEqual(Point2D d2) {
		if(this.x == d2.x && this.y == d2.y) {
			return true;
		}
		return false;
	}
	public String getDetails() {
		return "Point's " + x + " & " + y + " co-ords";
	}
	public double calculateDistance(Point2D d2) {
		double distance = sqrt((pow(abs((this.x-d2.x)),2.0)+pow(abs((this.y-d2.y)),2.0)));
		return distance;
	}
	

}
