package com.poly.test04;
import java.util.Scanner;

public class Square extends AreaImpl{
	

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		int x = sc.nextInt();
		System.out.print("세로 : ");
		int y = sc.nextInt();
		
		int res = x*y;
		
		super.setResult(String.valueOf(res));
		

}
	
}
