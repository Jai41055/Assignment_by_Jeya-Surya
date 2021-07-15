package Q7carparking;

public class ParkingMain {

	public static void main(String[] args) {

		Parked_CarOwner_Details[] p = new Parked_CarOwner_Details[3];
			
			
			  p[0] = new Parked_CarOwner_Details(Parked_CarOwenerList.generateToken() ,"model1", "swift", "101", 987654321, "anna nagar");
			  p[1] = new Parked_CarOwner_Details(Parked_CarOwenerList.generateToken(),"model2", "Nano", "102", 135987465, "kk nagar");
			  p[2] = new Parked_CarOwner_Details(Parked_CarOwenerList.generateToken() , "model3" , "wagonR" , "103", 987654321, "melavasi" );
			
			 Parked_CarOwner_Details.showCarDetails(p);
			Parked_CarOwenerList.add_new_car(p[0]);
			//Parked_CarOwenerList.add_new_car(p2);
			//generateToken();
			int token = Parked_CarOwenerList.generateToken();
			
			
			Parked_CarOwenerList.get_parked_car_location(p[0].token);
			Parked_CarOwenerList.remove_car(p[0].token);
			
		}
	

}
