package com.test03_init;

public class InitBlock {
	
	/*1. 지정된 기본값으로 초기화 
	private String pname;
	private int price;
	private static  String brand;*/
	
	//명시적 초기화
	
	private String pname = "갤럭시 S23";
	private int price=120000;
	private static  String brand="삼성";
	
	
	public void information() { //필드값 확인하기 위한 출력문 실행 
		//외부에서 접근이 불가능한 필드 (private로 선언) 에 저장된 데이터 확인용 메소드 
		System.out.println(pname+ ", " + price + "," +brand);
	}



     //3. 초기화 블럭 
      static {
    	  
    	  //static 초기화 블럭에서는 non static field 필드 초기화할 수 없다 
    	  //static field 필드만 초기화할 수 있음 
    	  //pname = "아이폰";
    	  // price=120000;
    	  brand="애플";
    	  
      }
      
      //인스턴스 초기화 블럭 
      
      {
    	  //인스턴스 초기화 블럭에서는 static 필드 초기화 가능 
    	  pname = "아이폰15";
    	  price = 150000;
    	  brand = "apple";
  
      }
      
      public InitBlock() {} //기본 생성자 
      //4.객체를 초기화할 때 매개변수 있는 생성자를 생성하여 초기화할 수 있다. 
      //초기화할 값을 전달받아서 전달받은 값으로 초기화
      public InitBlock(String pname,int price,String brand) { //매개변수 생성자 
    	//this 라는 키워드가 의미하는 것은 현재 이 객체를 의미 
    	  this.pname = pname; // non-static field 이기에 해당객체를 의미하는 
    	  this.price = price; //this 키워드로 필드에 접근 
    	  InitBlock.brand = brand; //static 필드이기에 클래스명으로 접근
    	  
      }
      
      
      
   }


