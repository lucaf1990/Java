package Lambda_Expression;

import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public class product {

	Long id;
	String name;
	String category;
	Double price;

	public product(Long id, String name, String category, Double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	/*public String toString() {
//System.out.print(this.category + "\n" + this.name + "\n" + this.id+ "\n" + this.price + "\n");
		return (this.category + "\n" + this.name + "\n" + this.id+ "\n" + this.price + "\n");
	}*/
	
	
	
}
