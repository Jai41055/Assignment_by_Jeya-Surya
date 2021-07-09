/**
 * 
 */
package Q2employelabour;

public class employe {

	public String name;
	public int id;
	public int basicpay;
	public int bonus;
	//creating constructor
	public employe(String name, int id, int basicpay, int bonus) {
		super();
		this.name = name;
		this.id = id;
		this.basicpay = basicpay;
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getBasicpay() {
		return basicpay;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	
	
	
	
}