import java.util.*;

public class primetillend{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        while(low <= high){
          boolean isprime = true;
          for(int div = 2; div*div <=high; div++){
            if(low%div == 0){
              isprime = false;
              break;
            }
          }
          if(isprime)
            System.out.println(low);
            low++;
          
        }
        
    }
}