

interface orderstatus{
	public String orderstate(String status);
}

interface ordermoney{
	
	public int orderamount(int amount);
}






public class Q2price {

	
	public static void main(String[] args) {
		
		
		ordermoney myordermoney =(int amount)->
		{    
			if(amount>10000)
			{
				return amount;
			}
			else
			return 0;
		};
		
		System.out.print(myordermoney.orderamount(20000));


		orderstatus myorderstatus =(String status)->
		{    
			if(status=="Accepted")
			return "Hello, your order is accepted";
			else
				return "Sorry your order is not Accepted";
		};
		
		System.out.println("\n"+myorderstatus.orderstate("Accepted"));
		
		
		
		
		
		
		
	}

}
