package C;


public class  V extends Thread {
    @Override
     public void run(){
         for (int i=1;i<10000;i++){
             System.out.println("Bulu");
         }
     }
         public static void main(String[] args){
                 V v=new V();
               v.start();
              
              for (int i=1;i<10000;i++){
                 System.out.println("blue");
             
         }
     }
    }
