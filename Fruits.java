class Fruit
{
	String name, taste, size;
	void eat()
	{
		System.out.println("Fruits are healthy");
	}
}
class Apple extends Fruit
{
	Apple()
	{
		name="Apple";
		taste="Sweet";
	}
	void eat()
	{
		System.out.println(name+" is "+taste+" to taste ");
	}
}
class Orange extends Fruit
{
	Orange()
	{
		name="Orange";
		taste="Tangy";
	}
	void eat()
	{
		System.out.println(name+" is "+taste+" to taste ");
	}
}
public class Fruits 
{

	public static void main(String[] args) 
	{
		Fruit f=new Fruit();
		Apple a=new Apple();
		Orange o=new Orange();
		f.eat();
		a.eat();
		o.eat();
		

	}

}
