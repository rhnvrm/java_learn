package Lab3;

import java.util.*;

public class Mainclass{
	
	public static void main(String args[]){

		Student arr[] = new Student[5];

		arr[0] = new Student("John Doe", "Bob Doe", "Lisa Doe");
		arr[1] = new Student("john doe", "Bob Doe", "Lisa Doe");
		arr[2] = new Student("joseph donalad", "Bob Doe", "Lisa Doe");
		arr[3] = new Student("Jack Daniels", "Bob Doe", "Lisa Doe");
		arr[4] = new Student("Doe John", "Bob Doe", "Lisa Doe");



		int countSameName = 0, countSimilarName = 0, countMaybeSameName = 0;

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(i != j && i < j){
					if(arr[i].getStudentName().sameName(arr[j].getStudentName())) countSameName++;
					if(arr[i].getStudentName().similarName(arr[j].getStudentName())) countSimilarName++;
					if(arr[i].getStudentName().maybeSameName(arr[j].getStudentName())) countMaybeSameName++;
				}
			}
		}

		System.out.println("Same Names:       " + countSameName);
		System.out.println("Similar Names:    " + countSimilarName);
		System.out.println("Maybe Same Names: " + countMaybeSameName);
	}
}