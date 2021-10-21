package shape.copy;

public class shapeFactorySquare extends shapeFactory{
	public  ShapeInterface createShape() {
		return new square();
	}
}
