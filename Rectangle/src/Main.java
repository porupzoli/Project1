
import java.awt.Rectangle;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RectangleClass a = new RectangleClass(6, 4);
		RectangleClass b= new RectangleClass(3);
		RectangleClass c=a;
		
		System.out.println(a + "\n" + b + "\n" + c);
		
		a.setSides(5, 6);
		
		System.out.println(a + "\n" + b + "\n" + c);
		
		a.setSides(b.getaSide(),b.getbSide());
		
		System.out.println(a + "\n" + b + "\n" + c);
		
		System.out.println(a.aside_bside(b));
	

		RectangleClass[] rectangleArray= new RectangleClass[10];
		Random randomizer = new Random();
		
		for(int i=0; i<rectangleArray.length; i++)
		{
			rectangleArray[i]= new RectangleClass(randomizer.nextInt(8)+2,randomizer.nextInt(10)+2);
			System.out.println(rectangleArray[i]);
			
		}
		
		
		
		System.out.println("\n");
		RectangleClass min=rectangleArray[0];
		for(int i=0; i<rectangleArray.length; i++)
		{
			if(rectangleArray[i].Bigger(min)==true)
			{
				min.setSides(rectangleArray[i].getaSide(), rectangleArray[i].getbSide());
			}
			
		}
		
		System.out.println(min);
		
		Scanner scanner= new Scanner(System.in);
		int num1= scanner.nextInt();
		int num2= scanner.nextInt();
		
		RectangleClass d= new RectangleClass(num1, num2);
		int db=0;
		for(int i=0; i<rectangleArray.length; i++)
		{
			if(rectangleArray[i].Bigger(d)==true)
			{
				db++;
			}
		}
		
		System.out.println("\n"+ db);
		int index=0;
		
		for(int i=0; i<rectangleArray.length; i++)
		{
			if(d.aside_bside(rectangleArray[i])==true)
			{
				index=i+1;
				break;
			}
		}
		System.out.println(index); 
		
	}
}
