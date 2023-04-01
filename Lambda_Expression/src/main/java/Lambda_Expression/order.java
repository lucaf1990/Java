package Lambda_Expression;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public  class order {

	Long id;
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate;
	List<product> products;
	customer customer;

	public order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<product> products,
			customer customer) {
	this.id=id;
	this.status=status;
	this.orderDate=orderDate;
	this.deliveryDate= deliveryDate;
	this.products=products;
	this.customer=customer;
	}

	public Collection<product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	

 
 

	
}
