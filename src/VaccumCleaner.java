import java.util.List;

public class VaccumCleaner {

	State order;
	State shipped;
	State deliver;
	State receive;
	
	State state;
	int count = 0;
	String name;
	List<String> vc;
	
	public VaccumCleaner()
	{
		order = new Order(this);
    	shipped = new Shipped(this);
    	deliver = new Deliver(this);    
    	receive = new Recieve(this);
	}

	public void setName(String name) {
		this.name = name;
	}

	void addItems(List<String> vc) {
		this.vc = vc;
	}
 
	void clean() {
		System.out.println(name + " with :");
		for (String cleaners : vc) {
			System.out.println("   " + cleaners);
		}
	}
	public void Startclean()
	{
		state.startState() ;
	}
	

	public void Stopclean()
	{
		state.finishState() ;
	}
	
	void setState(State state) {
		this.state = state;
	}
	
    
	public State getOrder() {
		return order;
	}

	public State getShipped() {
		return shipped;
	}

	public State getDeliver() {
		return deliver;
	}

	public State getReceive() {
		return receive;
	}

	public State getState() {
		return state;
	}

	//To String Method
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Welcome To Vaccum cleaner Factory!!!");
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}



