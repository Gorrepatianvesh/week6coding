
public class CleanWaterVCBuilder extends VCBuilder {

	public CleanWaterVCBuilder()
	{
		this.name = " clean water vaccum cleaner";

	}
	@Override
	public VCBuilder tocleanwater() {
		this.state.add(name + " is used to clean the water");
		return this;
	}

	@Override
	public VCBuilder tocleandirt() {
		
		return this;
	}

	@Override
	public VCBuilder tocleancarpet() {
		
		return this;
	}

}
