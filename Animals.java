class Animal
{
	public void eat()
	{
		System.out.println("This is eat method");
	}
	public void sleep()
	{
		System.out.println("This is sleep method");
	}
}
class Bird extends Animal
{
	public void eat()
	{
		System.out.println("eating");
	}
	public void sleep()
	{
		System.out.println("sleeping");
	}
	public void fly()
	{
		System.out.println("flying");
	}
}
public class Animals 
{

	public static void main(String[] args) 
	{
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();

	}

}
