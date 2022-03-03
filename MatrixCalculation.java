class variables
{
  //This class contains all the variables (It is not necessary to create a separate class just to store variables).
  //If you decide to create a separate class just for variables then remember that the classes which- 
  //-are going to use these needs to inherit the current class as the following variables are not global variables.
  
	int A[][] = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
	int B[][] = {{ 10 , 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 }};
	int i_1 = 0;
	int i_2 = 0;
	int j_1 = 0;
	int j_2 = 0;
	int k_1 = 0;
	int k_2 = 0;
	int l_1 = 0;
	int l_2 = 0;
  
}

class MatrixPrinting extends variables // Here extends keyword is used to inherit the values/variables of variables class.
{
  // This method takes care of printing all the matrices.
	void method()
	{

	System.out.println();

	System.out.println("First matrix: ");
  
  // outer loop for row.
	for(int i_1=0; i_1<A.length; i_1++) 
		{
		System.out.print("|");	// This is not necessary.
      		// inner loop for column.
      		for(int i_2=0; i_2<A[0].length; i_2++) 
      			{
        		System.out.print(A[i_1][i_2] + " ");
      			}
      		System.out.print("|");	
      		System.out.println(); // new line.
    		}

  System.out.println("Second matrix: ");
    
  // outer loop for row.
	for(int j_1=0; j_1<B.length; j_1++) 
		{
		System.out.print("|");
      		// inner loop for column.
      		for(int j_2=0; j_2<B[0].length; j_2++) 
      			{
        		System.out.print(B[j_1][j_2] + " ");
      			}
      		System.out.print("|");	
      		System.out.println(); // new line.
    		}	
	}
}

class MatrixProcessing extends MatrixPrinting
{
  // This method takes care of addition between A and B matrices.
	void addition()
	{
		System.out.println();
		System.out.println("The addition of 2 matrices A and B: ");
    
    // outer loop for row.
		for(int k_1=0; k_1<B.length; k_1++) 
		{
		System.out.print("|");
      		// inner loop for column.
      		for(int k_2=0; k_2<3; k_2++) 
      			{
        			System.out.print(A[k_1][k_2] + B[k_1][k_2] + " ");
      			}
      		System.out.print("|");	
      		System.out.println(); // new line.
    		}
	}
  // This method takes care of subtraction between A and B matrices.
 	void subtraction()
	{
		System.out.println();
		System.out.println("The subtraction of 2 matrices A and B: ");
    // outer loop for row.
		for(int l_1=0; l_1<B.length; l_1++) 
		{
		System.out.print("|");
      		// inner loop for column.
      		for(int l_2=0; l_2<3; l_2++) 
      			{
        			System.out.print(A[l_1][l_2] - B[l_1][l_2] + " ");
      			}
      		System.out.print("|");	
      		System.out.println(); // new line.
    		}
	}
}

class MatrixCalculations
{
	public static void main(String args[]) // Main method.
	{
		MatrixPrinting A = new MatrixPrinting(); // Object creation for the class arrayprinttesting.
		A.method(); // Calling a method using the created object.
		MatrixProcessing M = new MatrixProcessing();
		M.addition();
		M.subtraction();
	}
}
