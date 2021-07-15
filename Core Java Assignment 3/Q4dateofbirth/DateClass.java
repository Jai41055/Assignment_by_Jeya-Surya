/**
 * 
 */
package Q4dateofbirth;

public class DateClass {
	
	private int date;
    private int month;
    private int year;

    public DateClass(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }

   
	
	  @Override public int hashCode() { final int prime = 31; int result = 1;
	  result = prime * result + date; 
	  result = prime * result + month; 
	 // result =prime * result + year; 
	  return result; }
	
	  @Override public boolean equals(Object obj) { 
		  if (this == obj) return true;
		  if (obj == null) return false; 
		  if (getClass() != obj.getClass()) return false; 
		  DateClass other = (DateClass) obj; 
		  if (date != other.date) return false; 
		  if (month != other.month) return false;  
		  if (year == other.year) return false;
		  
		  return true; }
	 


	public int getDate(){ return this.date;}
    public int getMonth(){return this.month;}
    public int getYear(){return this.year;}
    
    public String toString(){ return "date: "+this.date+"  month: "+this.month+"  year: "+this.year+"  ";}

}


