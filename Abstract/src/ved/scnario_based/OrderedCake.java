package ved.scnario_based;

public class OrderedCake extends Cake{
	
	public OrderedCake() {
		super("Round","Vanilla",1);
	}
	
	public OrderedCake(String shape, String flavor, int quantity) {
		super("round", "chocolate", 4);
		
	}
	
	public OrderedCake(String shape, String flavor, int quantity, String message) {
		super(shape, flavor, quantity);
		this.message = message;
	}
	
	private String message;	

	@Override
	public String toString() {
		
		if(message!=null)
			return "A "+super.getShape()+" "+super.getFlavor()+" Cake of "+super.getQuantity()+" KG is Ready with"+message+"message @ Rs."+super.getQuantity()*price;
		else
			return super.toString();
	}
	
}
