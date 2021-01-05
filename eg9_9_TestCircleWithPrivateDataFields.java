package Example;

public class eg9_9_TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eg9_8_CircleWithPrivateDataFields myCircle = new eg9_8_CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		System.out.println("The number of objects created is  "+ eg9_8_CircleWithPrivateDataFields.getNumberOfObjects());
	}

}
