import java.util.*;
public class ak{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count= 0;
        int tmp = n;
        while(tmp != 0){
            tmp = tmp/10;
            count++;
        }
        // split 
        k = k%count;
        if(k<0){
            k= k+count;
        }
        int split = (int)Math.pow(10,k);
        int p1= n/split;
        int p2 = n%split;
        //merge 
        int merge = (int)Math.pow(10,count-k);
        int ans = (p2*merge)+p1;
        System.out.print(ans);
    }
}