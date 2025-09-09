package ved.AbstractDemo1;

abstract class Car{
	protected int speed = 120;
	
	public Car() {
		System.out.println("Car class Contructor");
	}
	public void getCarDetails() {
		System.out.println("It has 4 wheels and one engine!!!");
	}
	public abstract void run();
}
class Honda extends Car{
	
	@Override
	public void run() {
		System.out.println("Honda car is Running!!");
	}
}

public class AbstractDemo3 {
	public static void main(String[] args) {
		Car c = new Honda();
		
		System.out.println("speed of the car is "+c.speed);
		c.getCarDetails();
		c.run();

	}

}
