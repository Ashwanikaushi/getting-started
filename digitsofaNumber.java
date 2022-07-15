import java.util.*;
    
    public class digitsofaNumber{
    
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int count = 0;
     int temp = n;
     
     while(temp != 0){
       temp = temp/10;// isse hum temp /= 10 bhi likh skte h
       count++;
     }
     int div = (int)Math.pow(10, count-1);
     while(div != 0)// yha n != to zero isiliye nhi likha kyuki agr n(140) ke last me zero h to bina zero diye ye print krdeta or error aa jata 
     {
       int q = n/div;
       System.out.println(q);
       n %= div;
       div /= 10;// same temp wala h upper dekho

     }
     }
    }