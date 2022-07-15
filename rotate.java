import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int count = 0;
     int tmp = n;
     //1. digit count
     

     while ( tmp != 0 ) {
       tmp = tmp/10;
       count++;
      
       
     }// true rotation ye negative rotation vale code se phle aaayega notebook me explain h
     k= k%count;

     
     // handling negative value of k or say negative rotation
     if(k<0){
       k = k+count;
     }
     
     // split
     int splitHelper = (int)Math.pow(10,k);
     int p1 = n/splitHelper;
     int p2 = n%splitHelper;
     // merge
     int mergeHelper = (int)Math.pow(10, count-k);
     int ans = (p2*mergeHelper)+p1;
     System.out.println(ans);
    }
   }


   import java.util.*;
   public class Main{
    public static void main(Strings[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int count = 0;
      int tmp = n;
      while(tmp != 0){
        tmp = tmp/10;
        count++;
      }
      k = k%count;
      if(k<0){
        k = k+count;
      }
// split 
int splitHelper = (int)Math.pow(10,k);
int p1 = n/splitHelper;
int p2 = n%splitHelper;
//merge
int mergeHelper = (int)Math.pow(10, count-k);
int ans = (p2*mergeHelper)+p1;
System.out.println(ans);
    }
   }