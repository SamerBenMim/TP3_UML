package builder;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
 *
 	builder = new CarBuilder();
		director.constructSportCar(builder);
		Car car= builder.getObject();
		
		
		System.out.println(car.getMat());
	}

}
 