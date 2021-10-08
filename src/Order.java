
public class Order implements State {


	VaccumCleaner vc;
	

	public Order(VaccumCleaner vc) {
		this.vc = vc;
	}
	public void startState() 
	{
		System.out.println("Your order is started !!!");	

	}
    public void finishState() 
    {
		System.out.println("Your order is finished !!!");	

    }

}
