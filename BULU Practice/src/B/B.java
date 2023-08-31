package B;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
    List<Integer> l=new ArrayList<Integer>();
       l.add(12);
       l.add(13);
       l.add(14);
       l.add(15);
       l.add(16);
       l.add(17);
      
       System.out.println(l);
       List<Integer> p= l.stream().map(x->x).collect(Collectors.toList());
       System.out.println(p);
       System.out.println("Next One ");
       List<Integer> ps= l.parallelStream().map(x->x).collect(Collectors.toList());
       System.out.println(ps);
        }
}
