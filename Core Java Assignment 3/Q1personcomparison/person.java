package personcomparison;

public class person implements Comparable<person> {
	
	private int weight ;
	private int height;
	private String name;
	 
	public person (int weight,int height,String name)
	{
		this.weight=weight;
		this.height=height;
		this.name=name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Person Name is: "+ getName() + " Weight is: "+ getWeight()+ " Height is:"+ getHeight());
	}

	@Override
	public int compareTo(person mine) {
		
		 if(this.weight>mine.getWeight())
		 { 
			 return -1;
		 }
	     else if(this.weight < mine.getWeight())
	     { 
	    	 return 1;
	     }
	     else if(this.weight == mine.getWeight())
	     {
	            if(this.height > mine.getHeight())
	            { 
	            	return -1;
	            }
	            else if(this.height < mine.getHeight())
	            { 
	            	return 1;
	            }
	     }
		 return 0;
	}

}










