package Example;

public class eg9_6_CircleWithStaticMembers {
	double radius;
	
	static int numberOfObjects = 0;
	
	eg9_6_CircleWithStaticMembers()
	{
		radius = 1;
		numberOfObjects++;
	}
	
	eg9_6_CircleWithStaticMembers(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects()	
	{
		return numberOfObjects;
	}
	
	double getArea()
	{
		return radius*radius*Math.PI;
	}
}
