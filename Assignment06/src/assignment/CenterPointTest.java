package assignment;

public class CenterPointTest {

	public static void main(String[] args) {
		try {
			Circle c1 = new Circle();
			c1.setMyX(10);
			c1.setMyY(10);
			c1.setDiameter(10);
			// assigning the negative value
			// then it throw the exception
			c1.setDiameter(-10);
			System.out.println("Output"+c1.getString());
		}catch(WrongInput e) {
			e.printStackTrace();
			System.out.println("Error: "+e.getString());
		}

	}

}
