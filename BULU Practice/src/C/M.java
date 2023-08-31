package C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M {
	public static void main(String[] args) {

		List<Integer> ps=new ArrayList<Integer>();
		
		  ps.add(1);
		  ps.add(2);
		  ps.add(3);
		  ps.add(4);
		  ps.add(5);
		  ps.add(6);
		  ps.add(7);
	ps.stream().skip(2).limit(5).forEach(System.out::println);
}	     
	}
	  

		
		
		

