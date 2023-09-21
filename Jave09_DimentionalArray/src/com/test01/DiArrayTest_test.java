package com.test01;

public class DiArrayTest_test {
	
	
	public static void main(String[] args) {
		
		
		DiArrayTest_test da = new DiArrayTest_test();
		//da.testInit1();
		da.testInit2();
	
	}
	

	public void testInit1() {
		
		int arr[][]= new int[5][5];
		int num = 1;
		
		
		for (int i=0; i <5 ; i++) {

			for (int j=0; j <5; j++) {
			
				arr[j][i] = num;
				
				if (i==1) {
					arr[j][i] = 10-j;
				   System.out.print(num + " ");

				} else if (i==3) {
					arr[j][i] = 20-j;
					System.out.print(num + " ");
				} else { 
					arr[j][i] = num;
				System.out.print(num + " ");	
				} num++; 
			} 
			System.out.println();
		}
 	
		//잘 넣어졌는지 한 번 더 출력해서 확인 
		
		
		for (int i=0; i <5 ; i++) {

			for (int j=0; j <5; j++) {
				
				System.out.print(arr[j][i] + " ");
			}   System.out.println();
		}
		
		
	   }
	
    public void testInit2() {
		
		int arr[][]= new int[5][5];
		int num = 1;
		
		
		
		for (int i=0; i <5 ; i++) {

			for (int j=0; j <5; j++) {
			
				num= (i+1)+(5*j);
				arr[j][i] = num;
				
				 System.out.print(num + "\t");
				
				num++;
				
			} System.out.println();
		}	
	
	 	
			//잘 넣어졌는지 한 번 더 출력해서 확인 
			
			
			for (int i=0; i <5 ; i++) {

				for (int j=0; j <5; j++) {
					
					System.out.print(arr[j][i] + " ");
				}   System.out.println();
			}
	
	
	}
    
}

 
