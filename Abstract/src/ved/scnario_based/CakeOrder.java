package ved.scnario_based;

public class CakeOrder {
	public static void main(String[] args) {
		
		OrderedCake c = new OrderedCake();
		System.out.println(c);
		
		OrderedCake c2 = new OrderedCake("Round", "Chocolate", 4);
		System.out.println(c2);
			
		OrderedCake c1 = new OrderedCake("Square", "pineapple", 3, " Happy B'Day ");
		System.out.println(c1);
	}

}
