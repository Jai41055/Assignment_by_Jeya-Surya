package Q6chatbox;

import java.util.Scanner;

public class ChatRoomMain {

	public static void main(String[] args) {






		chatroom ch=new chatroom();
		//		Iterator<HashMap<HashMap<Integer, String>, ArrayList<String>>> itr=chroom.iterator();
		//		while(itr.hasNext())
		//		{
		//			System.out.println(itr.next());
		//			
		//		}


		while(true)
		{
			System.out.println("1) Create a chatroom"+
					"\n2) Add the user "+
					"\n3) User login"+ "\n4) Send a message"+"\n5) Display the messages from a specific chatroom"+
					"\n6) List down all users belonging to the specified chat room."+"\n7) Logout"+ "\n8) Delete an user"+
					"\n9) Delete the chat room.");
			System.out.println("select the option");
			Scanner sc=new Scanner(System.in);
			int opn=sc.nextInt();
			switch (opn) {
			case 1:ch.createroom();

			break;

			case 2:System.out.println("Enter id and password");

			int id=sc.nextInt();
			String passwd=sc.next();
			ch.createuser(id,passwd);
			break;
			case 3:System.out.println("Enter id and password");

			int id1=sc.nextInt();
			String passwd1=sc.next();
			ch.userlogin(id1,passwd1);
			break;

			case 4:
				id1=sc.nextInt();
				String passwd2=sc.next(); 
				String messg=sc.next();
				ch.sendmesg(id1, passwd2, messg);
				break;

			case 5:ch.getmesg();
					break;
			case 6:System.out.println("all user of this group---");
					ch.getusers();
					break;
			default:System.out.println("enter correct option");
			break;

			}
		}
	}


}
