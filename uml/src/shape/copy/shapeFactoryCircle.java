package shape.copy;

public class shapeFactoryCircle extends shapeFactory{

		public  ShapeInterface createShape() {
			return new Circle();
		}
	

}
