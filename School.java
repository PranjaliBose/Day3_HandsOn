class Person1
{
	String name;
	String dateOfBirth;
	void study()
	{
		System.out.println("Studying is good ! ");
		
	}
	
}
class Teacher extends Person1
{
	double salary;
	String subject;
	Teacher(double salary,String subject)
	{
		salary=50000.00;
		subject="Maths";
	}
	void teach()
	{
		System.out.println("Salary of "+subject+" taecher is : "+salary);
	}
	
}
class Student extends Person1
{
	int sid;
	Student(int sid)
	{
		sid=10;
	}
	void learn()
	{
		System.out.println("Student ID is : "+sid);
	}
}
class CollegeStudent extends Student
{
	String collegename;
	String year;
	super.Student;
	CollegeStudent()
	{
		collegename="ABC";
		year="First";
	}
	void college()
	{
		System.out.println("Name of college is : "+collegename+" and year is :"+year);
		
	}
}
public class School 
{

	public static void main(String[] args) 
	{
		

	}

}
