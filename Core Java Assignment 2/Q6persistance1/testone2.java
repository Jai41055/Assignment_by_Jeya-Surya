/**
 * 
 */
package Q6persistance1;

/**
 * @author Surya
 *
 */
public class testone2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FilePersistance newfile= new FilePersistance ();
		DatabasePersistance newfile1=new DatabasePersistance();
		
		newfile.persist();
		newfile1.persist();
	}

}
