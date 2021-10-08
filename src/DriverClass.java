
public class DriverClass {

	public static void main(String[] args) {

	VCBuilder vcBuilder = new CleanWaterVCBuilder();
	VaccumCleaner vc = vcBuilder.tocleanwater().tocleandirt().tocleancarpet().build();
	vc.setState(new Order(vc));
	vc.Startclean();
	vc.setState(new Shipped(vc));
	vc.Startclean();
	vc.Stopclean();

	vc.setState(new Deliver(vc));
	vc.Startclean();
	vc.Stopclean();

	vc.setState(new Recieve(vc));
	vc.Startclean();
	vc.Stopclean();
	vc.setState(new Order(vc));
	vc.Stopclean();
	vc.clean();
	
	VCBuilder vcwBuilder = new DirtWaterVCBuilder();
    vc = vcwBuilder.tocleanwater().tocleandirt().tocleancarpet().build();
	vc.setState(new Order(vc));
	vc.Startclean();
	vc.setState(new Shipped(vc));
	vc.Startclean();
	vc.Stopclean();

	vc.setState(new Deliver(vc));
	vc.Startclean();
	vc.Stopclean();

	vc.setState(new Recieve(vc));
	vc.Startclean();
	vc.Stopclean();
	vc.setState(new Order(vc));
	vc.Stopclean();
	vc.clean();
	
	VCBuilder vcBuilder3 = new CleanCarpetVCBuilder();
	vc = vcBuilder3.tocleanwater().tocleandirt().tocleancarpet().build();
	vc.setState(new Order(vc));
	vc.Startclean();
	vc.setState(new Shipped(vc));
	vc.Startclean();
	vc.Stopclean();

	vc.setState(new Deliver(vc));
	vc.Startclean();
	vc.Stopclean();

	vc.setState(new Recieve(vc));
	vc.Startclean();
	vc.Stopclean();
	vc.setState(new Order(vc));
	vc.Stopclean();
	vc.clean();
	
    System.out.println(vcBuilder);
	
}
}
