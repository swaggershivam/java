// Function for hollow square 
static void hollowSquare(int rows) 
{ 
	int i, j; 
	for (i = 1; i <= rows; i++) 
	{ 
		// Print stars for each solid rows 
		if (i == 1 || i == rows) 
			for (j = 1; j <= rows; j++) 
				System.out.print("*"); 
  
		// stars for hollow rows 
		else
			for (j = 1; j <= rows; j++) 
				if (j == 1 || j == rows) 
					System.out.print("*"); 
				else
					System.out.print(" "); 
  
		// Move to the next line/row 
		System.out.print("\n"); 
	} 
}