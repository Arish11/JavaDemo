package CoreJava;

public class Implementor {

	public static void main(String[] args) {
		
		Car car1 = new Hyundai();
		
		Car car2 = new Tata();		
		System.out.println("The color of car is: "+car1.color());
		System.out.println("The seats in car is: "+car1.seats());
		System.out.println("The engine of car is: "+car1.engine());
		System.out.println("________________________________________________");
		System.out.println();
		System.out.println("The color of car is: "+car2.color());
		System.out.println("The seats in car is: "+car2.seats());
		System.out.println("The engine of car is: "+car2.engine());
	}

}
