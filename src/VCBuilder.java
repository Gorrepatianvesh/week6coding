import java.util.ArrayList;
import java.util.List;

public abstract class VCBuilder {
	
	String name;
	List<String> state = new ArrayList<String>();

	public abstract VCBuilder tocleanwater();
	public abstract VCBuilder tocleandirt();
	public abstract VCBuilder tocleancarpet();


	public VaccumCleaner build() {
		VaccumCleaner vc = new VaccumCleaner();
	    vc.setName(this.name);
		vc.addItems(state);
		return vc;
	}
	
	public String toString() {
		return "YOU WON!!!";
	}

}
