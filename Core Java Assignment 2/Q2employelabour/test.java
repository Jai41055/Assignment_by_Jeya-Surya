/**
 * 
 */
package Q2employelabour;


public class test {

	
	public static void main(String[] args) {

		manager object1=new manager("jeya",1234,80000,10000);
	     
	     labour object2 =new labour ("surya",5678,40000,5000);
	     
	     System.out.println(object1.name + " , ID:"+object1.id +", is getting basic pay "+object1.basicpay + " and extra bonus is "+object1.bonus);
	     System.out.println(object2.name + " , ID:"+object2.id +", is getting basic pay "+object2.basicpay + " and extra bonus is "+object2.bonus);
	}

}
