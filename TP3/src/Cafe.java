
public class Cafe extends Boisson{
	public String nom;
	public Cafe(String s) {
		this.nom=s;
	}
public String description() {
	return "cafe "+nom;
}
public float cout() {
	return 1.5f;
}
}
