package shape;

public class main {

	public static void main(String[] args) {
		ShapeInterface s= new shapeFactory().createShape(7);
		s.draw();
		System.out.print("fff");
		
		
	}

}
