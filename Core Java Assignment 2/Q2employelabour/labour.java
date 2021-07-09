/**
 * 
 */
package Q2employelabour;

public class labour extends employe {

	public labour(String name, int id, int basicpay, int bonus) {
		super(name, id, basicpay, bonus);
		
	}
	int extratime=super.getBonus();
	public int getBonus() {
		return extratime;
	}

	

}
