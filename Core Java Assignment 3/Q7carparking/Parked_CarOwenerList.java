package Q7carparking;

import java.util.HashMap;
import java.util.Random;

public class Parked_CarOwenerList {
	
static HashMap<Integer,Parked_CarOwner_Details> list = new HashMap<>();
	
	static public int add_new_car(Parked_CarOwner_Details obj){
		 int token = obj.getToken();
		 System.out.println("token : "+token);
		 if(list.containsKey(token)){
			 System.out.println("key already");
		 }
		 else
			 list.put(token,obj);
		 
		return 0;
	}
	
	
	static public int generateToken(){
		int floor,section,comp,token;
		Random ran = new Random();
		floor = ran.nextInt(3);
		section = ran.nextInt(4);
		comp = ran.nextInt(20);
		//System.out.println("f : "+floor +"section : "+section+"comp : "+comp);
		token = (comp*10)+floor;
		token = (token * 10) + section;
		//System.out.println("token "+token);
		return token;
	}
	
	static public void remove_car(int token){
		list.remove(token);
		System.out.println("car removed");
	}
	
	static public void get_parked_car_location(int token){
		int temp = token;
		int floor = token%10;
		token = token/10;
		int section = token%10;
		token = token/10;
		int comp = token;
		System.out.println("car of token "+temp+" parked at : ");
		System.out.println(" floor : "+floor +" section : "+section+" compartment : "+comp);
	}

}
