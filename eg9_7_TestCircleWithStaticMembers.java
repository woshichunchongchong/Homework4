package Example;

public class eg9_7_TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+eg9_6_CircleWithStaticMembers.numberOfObjects);
		
		eg9_6_CircleWithStaticMembers c1 = new eg9_6_CircleWithStaticMembers();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+ c1.radius+") and a number of Circle objects ("+c1.numberOfObjects+")");
		
		eg9_6_CircleWithStaticMembers c2 = new eg9_6_CircleWithStaticMembers(5);
		
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+ c1.radius+") and a number of Circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2: radius ("+ c2.radius+") and a number of Circle objects ("+c2.numberOfObjects+")");
	}

}
			