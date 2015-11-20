import java.util.*;
class VowelFrequency
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String st = in.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();

		st=st.toLowerCase();

		for(int i = 0;i<st.length();i++)
		{
			char c = st.charAt(i);

			String ch = String.valueOf(c);

			Integer frequency = map.get(ch);

			Integer value;

			if (frequency == null) 
				value = new Integer(1);
			else{
				value = new Integer(frequency.intValue()+1);
			}
			map.put(ch, value);



		}
		//System.out.println();
		System.out.println("Frequency of A : "+map.get(String.valueOf('a')));
		System.out.println("Frequency of E : "+map.get(String.valueOf('e')));
		System.out.println("Frequency of I : "+map.get(String.valueOf('i')));
		System.out.println("Frequency of O : "+map.get(String.valueOf('o')));
		System.out.println("Frequency of U : "+map.get(String.valueOf('u')));
	}	
}			

