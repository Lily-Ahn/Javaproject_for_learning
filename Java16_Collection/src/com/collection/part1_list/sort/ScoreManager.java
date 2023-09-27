package com.collection.part1_list.sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ScoreManager {
	public static void main(String[] args) {
		List <Score> list = new ArrayList<Score>();
		list.add(new Score("이창진",99));
		list.add(new Score("남승주",75));
		list.add(new Score("이예담",88));
		list.add(new Score("안해림",32));
		list.add(new Score("김나현",72));
		list.add(new Score("박소정",61));
		
		System.out.println("list : " + list);
		//정렬
		//Comparable - 기본 정렬 기준을 구현, 기본적으로 적용되는 정렬기준
		
		//System.out.println("이예담",compareTo("안해림"));
		
		list.sort(null);
		System.out.println("list : "+ list);
		
		
		//list.sort(new ScoreDesc());
		Collections.sort(list,new ScoreDesc());
		System.out.println("list : "+ list);
		
	}
	

}
