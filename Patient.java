
public class Patient 
{
	String patientName;
	double height, weight;
	Patient(String name,double height,double weight)
	{
		this.patientName=name;
		this.height=height;
		this.weight=weight;
	}
	double computeBMI()
	{
		return (weight/(height*height));
		
	}
	public static void main(String[] args) 
	{
		Patient p=new Patient("Sonia",1.63,60);
		System.out.println("Name : "+p.patientName+"\nBMI :"+p.computeBMI());

	}

}
