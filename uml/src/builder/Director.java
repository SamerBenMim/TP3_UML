package builder;

public class Director {
 
	public void constructSportCar(BuilderInterface builder) {
		builder.reset();
		builder.setGps(false);
		builder.setMat("2123135");
		builder.setSeats(5);
	}
	
}
