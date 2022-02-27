import java.util.*;

class test
{
	float[] x = {0f, 0.5f, 1f, 1.5f, 2f, 2.5f, 3f, 4f, 5f};
	float[] y = {0f, 6f, 19f, 32f, 45f, 56f, 65f, 89f, 104f};
	float n = 9;
	float sumx = 0f;
	float sumxsqr = 0f;
	float sumy = 0f;
	float sumysqr = 0f;
	double sumxy = 0d;
	double equation;
	double equationtop;
	double equationdown;
	double equationdownx;
	double equationdowny;
	double rx;
	double ry;

	void calc()
	{	

		//For loop to find sum of all the elements in array x
		for(int i = 0; i < x.length; i++ )
		{
			sumx = sumx + x[i];
		}

		//For loop to find total sum of each squared element in x
		//Example x1 square + x2 square + ....... + x9 square 
		for(int i_2 = 0; i_2 < x.length; i_2++ )
		{
			sumxsqr = sumxsqr + x[i_2] * x[i_2];
		}

		//For loop to find sum of all the elements in array y		
		for(int j = 0; j < x.length; j++ )
		{
			sumy = sumy + y[j];
		}

		//For loop to find total sum of each squared element in y
		//Example y1 square + y2 square + ....... + y9 square 
		for(int j_2 = 0; j_2 < x.length; j_2++ )
		{
			sumysqr = sumysqr + y[j_2] * y[j_2];
		}
		

		//For loop to find sum of all elements and y elements
		for(int k = 0; k < 9; k++ )
		{
			sumxy = sumxy + (x[k] * y[k]);
		}

		//Printing all the above results in an order

		System.out.println("Summation of x: " + sumx);

		System.out.println("Summation of y: " + sumy);

		System.out.println("Summation of x square: " + sumxsqr);

		System.out.println("Summation of y square: " + sumysqr);

		System.out.println("Summation of xy: " + sumxy);

		//Formula caluclation

		equationtop = n*(sumxy) - sumx * sumy;

		equationdownx = n*(sumxsqr) - (sumx * sumx);
		equationdowny = n*(sumysqr) - (sumy * sumy); 

		//Example to understand how to apply square root 
		//double R = Math.sqrt(X);
		//System.out.println("The square root of " + X + " is " + R);

		rx = Math.sqrt(equationdownx);
		ry = Math.sqrt(equationdowny);

		equation = equationtop / (rx * ry);

		//Printing final answer

		System.out.print("R = " + equation);
		
	}
}

class CertainStatisticFormula
{
	public static void main(String args[])
	{
		test T = new test();
		T.calc();
	}
}
