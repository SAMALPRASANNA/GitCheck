package B;

public class A {
        public static void main(String[] args) {
        	 int [] arr ={15,8,10,22,11,22,15,10};   
             
             System.out.println("Duplicate array is : ");  
             
             for(int i = 0; i < arr.length; i++) {  
                 for(int j = i + 1; j < arr.length; j++) {  
                     if(arr[i] == arr[j])  
                         System.out.println(arr[j]);  
                 }  
       }
}
}		 

	  