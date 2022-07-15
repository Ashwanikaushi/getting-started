import java.util.*;
  
  public class fibonicci{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int first = 0, second = 1;
      for(int i = 1; i <= n; i++){
        int third = first + second;
        System.out.println(first);
        first = second;
        second = third;
      }
   }
  }