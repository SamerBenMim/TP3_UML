
	import java.util.List;
public class Main {

	    public static void main(String[] args) {

	    	FruitsRouges glace = FruitsRouges.SINGLETON;
	        ToppingDecorator toppingDecoratorChantilly = new ChantillyDecorator(glace);
	        ToppingDecorator toppingDecoratorFraise = new CoulisFraiseDecorator(glace);
	        Product cafe= new ChantillyDecorator(new Cafe("express"));

	        List<Product> cg = List.of(glace, toppingDecoratorFraise, toppingDecoratorChantilly,cafe);

	        Commande command = new Commande(cg);
	        command.publieFacture();
	    
	}

}
