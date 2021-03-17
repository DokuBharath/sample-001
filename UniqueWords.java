package Java;
import java.util.*;
public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String s;
	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter Student's Article");
	        s=in.nextLine();
	        s=s.toLowerCase();
	        StringTokenizer st=new StringTokenizer(s," ,.;:!?");
	        int num1=st.countTokens();
	        String s1[]=new String[num1];
	        while(st.hasMoreTokens())
	        {
	        	s1[i++]=st.nextToken();
	        }
	        TreeSet<String>t=new TreeSet<String>();
	        for(String s2:s1)
	        	t.add(s2);
	        Iterator<String> itr=t.iterator();  
	        i=1;
	        System.out.println("Number of words "+num1);
	        System.out.println("Number of unique words "+t.size());
	        i=1;
	       System.out.println("The words are");       
	        while(itr.hasNext()) 
	        {
	         System.out.println(i+". "+itr.next());  
	         i++;
	        }


	}

}
