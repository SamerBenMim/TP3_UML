
public class Parfum {
	String name;
	public final static Parfum CASSIS =new Parfum("CASSIS");
	public final static Parfum CHOCOBLANC =new Parfum("CHOCOBLANC");
	public final static Parfum CHOCOLAIT =new Parfum("CHOCOLAIT");
	public final static Parfum FRAISE =new Parfum("FRAISE");
	public final static Parfum FRAMBOISE=new Parfum("FRAMBOISE");
	public final static Parfum CHOCONOIR=new Parfum("CHOCONOIR");
	 public Parfum(String s) {
		this.name=s;
	}
	public String toString() {
		return name;	}

}
