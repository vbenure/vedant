package ved.scnario_based;

public abstract class Cake {
	private String shape;
	private String flavor;
	private int quantity;
	public static double price = 400;
	
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "A " + shape +" "+ flavor+" Cake Of " + quantity + " KG is Ready @ Rs." + price;
	}	
}
