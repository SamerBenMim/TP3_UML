public class ToppingDecorator extends CoupeGlacee {

	public Product coupeToppingDecorator ;
	
	public ToppingDecorator(Product Coupe) {
		this.coupeToppingDecorator = Coupe ;
	}
	
	public float cout() {
		return coupeToppingDecorator.cout();
	}
	public String description() {
		
		return coupeToppingDecorator.description();
	}
	

}
