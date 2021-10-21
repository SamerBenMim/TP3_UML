package builder;

public class CarBuilder  implements BuilderInterface {

	private Car car ;
	public CarBuilder() {
		this.reset();
	}
	public void reset() {
		this.car = new Car();
	}

	@Override
	public void setSeats(int nbrSeats) {
		this.car.setSeats(nbrSeats);
	}

	@Override
	public void setMat(String mat) {
		this.car.setMat(mat);
	}

	@Override
	public void setGps(boolean gps) {
		this.car.setGps(gps);
		
	}

	
	public Car getObject() {
		return this.car ;
	}

}
