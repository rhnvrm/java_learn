package Lab3;

import java.util.*;

public class Mainclass{
	
	public static void main(String args[]){

		Student x = new Student("John Doe", "Bob Doe", "Lisa Doe");
		Student y = new Student("d", "Bob Doe", "Lisa Doe");

		System.out.println(y.getStudentName().sameName(x.getStudentName()));
	}
}