package com.collection.part1_list.sort;

import java.util.Comparator;

public class ScoreDesc implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {
		int other1=o1.getScore();
		int other2=o2.getScore();
		
		if (other1>other2) {
			return -1;
		} else if(other1<other2){
			return 1;
		} else {
			return 0;
		}
	
	}

}
