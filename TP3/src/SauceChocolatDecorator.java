
public class SauceChocolatDecorator extends ToppingDecorator {
	public SauceChocolatDecorator (Product coupe) {
		super(coupe);
	}
	public float cout() {
		
		return   (super.cout()+0.7f);
	}
public String description() {
		
		return coupeToppingDecorator.description() + " et sa delicieuse sauce Chocolat";
	}

}

