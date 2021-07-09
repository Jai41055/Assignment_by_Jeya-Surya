/**
 * 
 */
package Q2employelabour;


public class manager extends employe{

	public manager(String name, int id, int basicpay, int bonus) {
		super(name, id, basicpay, bonus);
		
	}
	int incentive=super.getBonus();
	public int getBonus() {
		return incentive;
	}
	

}
