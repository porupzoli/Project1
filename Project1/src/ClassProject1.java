import java.util.Random;

public class ClassProject1 {
	
	public static void main(String[] args) {
		
		
		double pi1=1.0;
		for (double i=1; i<=10000;i++) {
			pi1=pi1*(2*i/(2*i+1))*(2*i/(2*i-1));
		}
		pi1=pi1*2;		
		System.out.println(pi1);
		
		
		
		
		double pi2=0.0;
		for(double i=0; i<=10000; i++){
			pi2=pi2+((Math.pow((-1), i))/(2*i+1)); 
		}
		pi2=pi2*4;
		System.out.println(pi2);
		
	
		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(fak(i));
		}
		
		
		
		
		
		for(int i=0; i<=100; i++)
		{	
			if(prim(i) && prim(i+2))
				{	
					System.out.print(i);
					System.out.println(" "+ (i+2));
				}	
		}
		
		
		
		
		int [] array1= new int[10];
		for (int i = 0; i < array1.length; i++) 
		{
			array1[i]=(int)(Math.random()*10)+1;	
			System.out.print(" "+ array1[i]);
		}
		System.out.println("");
		int a=8;
		linearsearch(a,array1);
		
		
		
		
		
		
		
		int [] array2= new int[10];
		for (int i = 0; i < array2.length; i++) 
		{
			array2[i]=(int)(Math.random()*10)+1;	
			System.out.print(" "+ array2[i]);
		}
		System.out.println("");
		
		sort(array2);
		for(int i :array2)
		{
			
			System.out.print(" "+ i);
		}
		System.out.println("");
		
		binearsearch(a, array2);
	
		
		
		}
		
			
		
	
	
	public static int fak(int num){	
		int x=1;
		for(int i=1; i<=num; i++)
		{
			x*=i;
		}
		return x;
	}
	
	
	public static boolean prim(int num){	
		if (num < 2){	
			return false;
		}
		
        if (num == 2){	
        	return true;
        }
        
        if (num % 2 == 0){	
        	return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {	
            	return false;
            }
        }
        return true;
	}
	
	
	
	
	public static void linearsearch(int num, int[] array){
		int i=0;
		int index;
		boolean x=false;
		
		while(i<array.length && (x==false))
		{	
			if(array[i]==num)
			{	
				x=true;
				index=i+1;
				System.out.println("Found: "+ index);
			}
			i++;
		}
		if(x==false){	
			System.out.println("Not found");
		}
	}
	
	public static void sort(int[] array)
	{	
		int i=0;
		int j=0;
		int x=0;
		
		
		while(i<=9)
		{	
			j=i+1;
			while(j<array.length)
			{	
				if(array[j]<array[i])
				{	
					x=array[j];
					array[j]=array[i];
					array[i]=x;
				}
				j++;
			}
			i++;	
		}		
	}
	
	
	
	
	public static void binearsearch(int num, int[] array)
	{
		int startvalue=0;
		int endvalue=array.length+1;
		int midvalue=(startvalue+endvalue)/2;
		int index;
		boolean a=true;
		while(startvalue<endvalue && a==true) 
		{
			if(num==array[midvalue])
			{
				index=midvalue+1;
				a=false;
				System.out.println("Found: "+ index);
			}
			else if(num>array[midvalue]) 
			{
				startvalue=midvalue;
			}
			else 
			{
				endvalue=midvalue;
			}
			midvalue=(startvalue+endvalue)/2;
		}
		if(a==true)
		{
			System.out.println("Not found");
		}
			
	}
	

}

