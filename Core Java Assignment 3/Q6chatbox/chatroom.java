package Q6chatbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class chatroom {
	
	ArrayList<HashMap<HashMap<Integer,String>,ArrayList<String>>>chroom=new ArrayList<HashMap<HashMap<Integer,String>,ArrayList<String>>>();
	HashMap<Integer, String> login=new HashMap<Integer, String>();
	ArrayList<String> mesg=new ArrayList<String>();
	HashMap<HashMap<Integer, String>, ArrayList<String>> usr=new HashMap<HashMap<Integer,String>,ArrayList<String>>();
	void createroom()
	{



	}

	void createuser(int id,String passwd)
	{
		login.put(id, passwd);
		usr.put(login, mesg);
		chroom.add(usr);

	}

	void userlogin(int id,String passwd)
	{
		String pass=login.get(id);
		if(passwd.equals(pass))
		{
			System.out.println("login success");
		}

	}

	void sendmesg(int id,String passwd,String messg)
	{	login.put(id, passwd);
	mesg.add(messg);
	usr.putIfAbsent(login, mesg);
	}

	void getmesg()
	{
		System.out.println((usr.get(34)));
	}

	void getusers()
	{
		Iterator<HashMap<HashMap<Integer, String>, ArrayList<String>>> itr=chroom.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}

	}

}
