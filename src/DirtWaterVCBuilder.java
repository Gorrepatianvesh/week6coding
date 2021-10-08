
public class DirtWaterVCBuilder  extends VCBuilder {

	public DirtWaterVCBuilder()
	{
		this.name = " clean dirt vaccum cleaner";

	}
	@Override
	public VCBuilder tocleanwater() {
		return this;
	}

	@Override
	public VCBuilder tocleandirt() {
		this.state.add(name + " is used to clean the dirt");
		
		return this;
	}

	@Override
	public VCBuilder tocleancarpet() {
		
		return this;
	}

}
