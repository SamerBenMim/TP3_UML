package shape.copy;

public class main {

	public static void main(String[] args) {
	 
		shapeFactory circleFactory= new shapeFactoryCircle();
		ShapeInterface circle= circleFactory.createShape();
		circle.draw();
	}

}
