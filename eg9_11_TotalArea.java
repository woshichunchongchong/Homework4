package Example;

public class eg9_11_TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eg9_8_CircleWithPrivateDataFields[] circleArray;
		
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static eg9_8_CircleWithPrivateDataFields[] createCircleArray()
	{
		eg9_8_CircleWithPrivateDataFields[] circleArray = new eg9_8_CircleWithPrivateDataFields[5];
		
		for (int i=0;i<circleArray.length;i++)
		{
			circleArray[i] = new eg9_8_CircleWithPrivateDataFields(Math.random()*100);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(eg9_8_CircleWithPrivateDataFields[] circleArray)
	{
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;++i)
		{
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("--------------------------------------");
		
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	public static double sum(eg9_8_CircleWithPrivateDataFields[] circleArray)
	{
		double sum=0;
		
		for (int i=0;i<circleArray.length;++i)
			sum+=circleArray[i].getArea();
		
		return sum;
	}
}
