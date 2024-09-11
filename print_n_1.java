//Print n to 1 
import java.util.Scanner;
  class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    print_n_1(n);
  }
  static void print_n_1(int n)
  {
    if(n==0)//base case
      return;
    System.out.print(n+" ");
    //we are printing the number first and then going to n-1 this will continue till the number reaches the last desired output ie.,1 if it goes any further ie., to 0 then we return
    print_n_1(n-1);
  }
}

TIME COMPLEXITY:the recursive function runs for n+1 times->O(n)
SPACE COMPLEXITY:due to recursive stack,it goes to the max depth of n->O(n)
