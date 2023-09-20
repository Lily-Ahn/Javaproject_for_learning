package com.test01;

public class DiArrayTest_test {
	
	
	public static void main(String[] args) {
		
		
		DiArrayTest_test da = new DiArrayTest_test();
		da.testInit1();
	
	}
	

	public void testInit1() {
		
		int arr[][]= new int[5][5];
		int num = 1;
		int rearr [] = new int [5];
		
		
		
		for (int i=0; i <5 ; i++) {

			for (int j=0; j <5; j++) {
			
				arr[j][i] = num ++;
				
				if (i==1) {
					
				   System.out.print(10-j + " ");

				} else if (i==3) {
					System.out.print(20-j + " ");
				} else { 
				System.out.print(arr[j][i] + " ");	
				}
			} System.out.println();
		}
		

			
		
		
		
		

 	
	   }
	}

 
