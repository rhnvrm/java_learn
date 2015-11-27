import java.util.*;
class ReplaceThe
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = in.nextLine();

		String[] st = input.split(" ");

		List<String> list = new ArrayList<String>();

		for(int i = 0; i < st.length;i++){
			if(st[i].compareTo("the") == 0){
				list.add(st[i].toUpperCase());
			}
			else{
				list.add(st[i]);
			}
		}

		String listString = "";

		for (String s : list)
		{
		    listString += s + " ";
		}

		System.out.println(listString);
	}	
}			

