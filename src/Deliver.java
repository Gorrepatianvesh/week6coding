
public class Deliver  implements State {

	VaccumCleaner vc;
	

	public Deliver(VaccumCleaner vc) {
		this.vc = vc;
	}
	public void startState() 
	{
		System.out.println("Your order will deliver soon !!!");	

	}
    public void finishState() 
    {
		System.out.println("Your order is delivered !!!");	

    }

}
