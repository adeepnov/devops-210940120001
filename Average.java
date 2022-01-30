/* java program to take 5 numbers using Scanner and print the average ?
>> Enter 5 numbers : 1 2 3 4 5
Average = 3
*/

import java.util.Scanner;

class Average
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		float a,b,c,d,e; double r;
		a=in.nextFloat();
		b=in.nextFloat();
		c=in.nextFloat();
		d=in.nextFloat();
		e=in.nextFloat();
		
		r=(a+b+c+d+e)/5.0;
		System.out.println("Average is: "+r);
	}
}
