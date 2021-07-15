package Q7carparking;

public class Parked_CarOwner_Details {
	
	public String ownerName;
	public String carModel;
	public String carNO;
	public long mobileNO;
	public String address;
	public int token;
	public boolean buzy = false;
	
	public Parked_CarOwner_Details(int token, String ownerName, String carModel, String carNO, long mobileNO, String address) {
		this.token = token;
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.mobileNO = mobileNO;
		this.address = address;
	}
	
	public int getToken(){
		return this.token;
	}
	
	static public void showCarDetails(Parked_CarOwner_Details p[]){
		for(int i=0;i<p.length;i++)
		System.out.println("token : "+p[i].token+" OwnerName : "+p[i].ownerName+" carModel : "+p[i].carModel+" MobileNo : "
		+p[i].mobileNO+" Address : "+p[i].address);
	}

}
