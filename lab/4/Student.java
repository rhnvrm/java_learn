package Lab3;

import java.util.*;

public class Student{
	Name studentName = new Name("");
	Name fathersName = new Name("");
	Name mothersName = new Name("");

	public Student(String s, String f, String m){
		studentName.setName(s);
		fathersName.setName(f);
		mothersName.setName(m);
	}

	public Name getStudentName(){
		return studentName;
	}

	public Name getFathersName(){
		return fathersName;
	}

	public Name getMothersName(){
		return mothersName;
	}

	public void setStudentName(String x){
		studentName.setName(x);
	}


	public void setFathersName(String x){
		fathersName.setName(x);
	}

	public void setMothersName(String x){
		mothersName.setName(x);
	}


}