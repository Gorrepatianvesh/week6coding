
public class CleanCarpetVCBuilder  extends VCBuilder {

	public CleanCarpetVCBuilder()
	{
		this.name = " clean carpet vaccum cleaner";

	}
	@Override
	public VCBuilder tocleanwater() {
		return this;
	}

	@Override
	public VCBuilder tocleandirt() {
		
		return this;
	}

	@Override
	public VCBuilder tocleancarpet() {
		this.state.add(name + " is used to clean the carpet");
		return this;
	}

}
