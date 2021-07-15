/**
 * 
 */
package hashtable;


public class Employee {
	
	private String name;
    private int id;

    public Employee(String n,int i){name= n;id= i;}
    
	public String getName() {return name;}
	public int getId() {return id;}
	
	public void setName(String name) {this.name = name;}
	public void setId(int id) {this.id = id;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		result = prime * result +id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 15;
	}

	@Override
	public boolean equals(Object obj) {
		
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		return true;
	}
	
	public String toString(){ return "id: "+this.id+"  name: "+this.name+"  ";}


}
