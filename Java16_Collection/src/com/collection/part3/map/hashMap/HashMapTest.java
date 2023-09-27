package com.collection.part3.map.hashMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void testHashMap() {
		HashMap hmap = new HashMap();
		
		//키와 값 쌍으로 저장 -> 키와 value의 묶음을 Entry 라고 부른다.
		//키, 값 둘다 반드시 객체
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		
		System.out.println("hamp : " + hmap);
		
		
		//키는 중복저장되지 않음.
		hmap.put(12, "school");
		System.out.println("hamp : " + hmap);
		
		//벨류는 중복 저장됨.
		hmap.put(11, "school");
		hmap.put(9, "school");
		System.out.println("hamp : " + hmap);
		
		//키값을 가지고 객체를 가져올 수 있다. 
		//get(key)
		System.out.println("키 9에 대한 객체 : " + hmap.get(9));
		
		//키값을 가지고 삭제 처리 
		hmap.remove(9);
		System.out.println("hamp : " + hmap);
		
		//
		hmap.clear();
		
		System.out.println();
		//Map에 저장된 객체 연속 처리 
		hmap.put("one", "java11");
		hmap.put("two", "mysql");
		hmap.put("three", "JDBC");
		hmap.put("four", "HTML5");
		hmap.put("five", "CSS");
		
		//1.keyset()
		// : key만 따로 set으로 만들고 iterator()로 목록 만들어 연속처리
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		while (keyIter.hasNext()) {
			String key = (String)keyIter.next();
			String value = (String)hmap.get(key);
			System.out.println(key+ "=" + value);
			
		}
		
		//2. entryset() : map 내부 클래스인 Entry(키와 벨류를 쌍으로 묶은 것)를 활용
		Set eSet = hmap.entrySet();
		Iterator entryIter = eSet.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
	
	}

}
