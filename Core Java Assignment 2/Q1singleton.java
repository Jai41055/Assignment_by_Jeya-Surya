/**
 * 
 */

/**
 * @author Surya
 *
 */
public class singleton {

	public static singleton object=null;
	public singleton()
	{
		
	}
	private static singleton getinstance()
	{if(object==null)
		object=new singleton();
		return object;
	}
	public void getConnection()
	{
		System.out.println("To be connected");
	}
	public static void main(String[] args) {
		singleton object1=singleton.getinstance();
		
		{
			
		}
		object1.getConnection();



	}

}
