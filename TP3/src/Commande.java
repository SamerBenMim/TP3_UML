import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Commande {
	List<Product> achats= new LinkedList<>();
	 public Commande(List<Product>  achats) {
	        this.achats = achats;
	    }

	    public void publieFacture() {
	        float total = 0;
	        for (Iterator<Product> it = this.achats.iterator(); it.hasNext(); ) {
	        	Product achat = (Product) it.next();
	            System.out.println(achat.description() + " + " + achat.cout());
	            total = total + achat.cout();
	        }
	        System.out.println(" TOTAL : " + total);

	    }
}