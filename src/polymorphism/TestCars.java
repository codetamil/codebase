package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class TestCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Hyundai();
		
		List ll= new ArrayList();
		
		Hyundai hy= new Hyundai();
		
		BMW bmw = new BMW();
		
	
		car.move();
		hy.move();
		bmw.move();

	}

}
