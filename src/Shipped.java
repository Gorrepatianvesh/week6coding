
public class Shipped implements State{
	VaccumCleaner vc;
	

	public Shipped(VaccumCleaner vc) {
		this.vc = vc;
	}
	public void startState() 
	{
		System.out.println("You  order will ship soon !!!");	

	}
    public void finishState() 
    {
		System.out.println("Your order is shipped !!!");	

    }
}
