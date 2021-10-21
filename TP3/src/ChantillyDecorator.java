
public class ChantillyDecorator extends ToppingDecorator {
	
	public ChantillyDecorator (Product coupe) {
		super(coupe);
	}
	public float cout() {
		
		return   (super.cout()+0.5f);
	}
public String description() {
		
		return coupeToppingDecorator.description() + " chantilly";
	}

}