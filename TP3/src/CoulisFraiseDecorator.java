
public class CoulisFraiseDecorator extends ToppingDecorator {
	public CoulisFraiseDecorator (CoupeGlacee coupe) {
		super(coupe);
	}
	public float cout() {
		
		return   (super.cout()+ 1f);
	}
public String description() {
		
		return coupeToppingDecorator.description() + " au coulis de fraises fraiches";
	}
}
