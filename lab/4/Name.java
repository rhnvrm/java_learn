package Lab3;

import java.util.*;

public class Name{
	String firstName;
	String lastName;
	String middleName;

	public Name(String x){
		String a[] = new String[3];
		a = x.split(" ", 3);

		if(a.length == 3){
			firstName = a[0];
			lastName = a[2];
			middleName = a[1];
		}
		else if(a.length == 2){
			firstName = a[0];
			lastName = a[1];
		}
		else{
			firstName = x;
		}
		
	}

	public void setName(String x){
		String a[] = new String[3];
		a = x.split(" ", 3);

		if(a.length == 3){
			firstName = a[0];
			lastName = a[2];
			middleName = a[1];
		}
		else if(a.length == 2){
			firstName = a[0];
			lastName = a[1];
		}
		else{
			firstName = x;
		}
	}

	public String getName(){
		String s = firstName;
		if(middleName != null) s = s.concat(" " + middleName);
		if(lastName != null) s = s.concat(" " + lastName);

		return s;
	}

	public boolean sameName(Name x){
		if(this.getName().toLowerCase().compareTo(x.getName().toLowerCase()) == 0) return true;
		else return false;
	}

	public boolean similarName(Name x){
		
		String[] a = new String[3];
		a = x.getName().split(" ", 3);
		Arrays.sort(a);

		String[] b = new String[3];
		b = this.getName().split(" ", 3);
		Arrays.sort(b);
		
		return Arrays.equals(a,b);
	}

	public boolean maybeSameName(Name x){
		
		String[] a = new String[3];
		a = x.getName().split(" ", 3);
		

		//Arrays.sort(a);

		String[] b = new String[3];
		b = this.getName().split(" ", 3);
//			System.out.println(b[0]);

		for(int i = 0; i < a.length; i++){
			a[i] = a[i].substring(0,1);
			//System.out.println(a[i]);
		}
		//Arrays.sort(b);
		
		for(int i = 0; i < b.length; i++){
			b[i] = b[i].substring(0,1);
			//System.out.println(b[i]);
		}
		return Arrays.equals(a,b);
	}

}