package shape;

import shape.copy.Rectangle;

public class shapeFactory {
 public ShapeInterface createShape( int x) {
	 switch(x)
     {
         case(1):
             return new Circle();
         
         case(2):
             return new square();
         default:
         return new Rectangle();
 }
	
}
}
