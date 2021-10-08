
public class Recieve implements State{
	

	VaccumCleaner vc;
	

	public Recieve(VaccumCleaner vc) {
		this.vc = vc;
	}

	public void startState() 
	{
		System.out.println("You will recieve order soon !!!");	

	}
    public void finishState() 
    {
		System.out.println("Your recieved the order !!!");	

    }
}
