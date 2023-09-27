package com.collection.part1_list.array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Date;
import java.util.List;



public class ArrayListTest {
	public void testArrayList() {
		//ArrayList 
		ArrayList alist = new ArrayList();
		
		//다형성 적용
		List list = new ArrayList();
		Collection clist = new ArrayList(); 
		
		//arraylist는 저장순서가 유지, index가 적용
		//객체만 저장할 수 있다. 
		
		alist.add("apple");
		alist.add(123); //autoBoxing 처리
		alist.add(45.67);
		alist.add(new Date());
	
	System.out.println("alist: " + alist );
	
	//인덱스가 지정되어 있기에 for 문으로 접근 가능 
	for (int i = 0 ; i< alist.size();i++) {
		System.out.println(i+ " : "+alist.get(i));
	}
	
	alist.add("apple");
	System.out.println("alist: " + alist );
	
	
	//객체를 중간에 추가하는 경우 해당 인덱스에 덮어쓰는게 아닌 
	//기존의 데이터들을 하나씩 뒤로 보내고 추가.
	
	alist.add(1, "banana");
	System.out.println("alist: " + alist );
	
	//리스트 중간에 들어있는 객체를 삭제하는 경우
	//삭제된 후 나머지 객체들이 자동으로 인덱스 하나씩 앞으로 당긴다. 
	alist.remove(3);
	System.out.println("alist: " + alist );
	
	//alist 변경하고 싶을 때에는 set 이용
	
	alist.set(1, false);
	System.out.println("alist: " + alist );
	
	//
	list.add("apple");
	list.add("grape");
	list.add("banana");
	list.add("mango");
	list.add("orange");
	
	System.out.println("list: " + list );
	
	//ArrayList는 오름차순 정렬 가능한 sort() 메소드 사용가능
	Collections.sort(list);
	//list.sort(null)
	System.out.println("list: " + list );
	
	
	
	}
}
