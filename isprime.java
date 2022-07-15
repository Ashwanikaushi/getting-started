import java.util.*;
  
  public class isprime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       
       int t = scn.nextInt();
       

       while(t!=0){
         boolean isprime = true;
         int n = scn.nextInt();
         for(int div = 2; div*div<=n; div++){
           if(n%div == 0){
             isprime = false;
             break;
           }
         }
       if(isprime){
          System.out.println("prime");
        }else{
          System.out.println("not prime");
        }
        t--;
       }
        
   }
  }