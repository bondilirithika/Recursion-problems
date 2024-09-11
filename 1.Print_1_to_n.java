import java.util.Scanner;
class Solution{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter n:");
      int n=sc.nextInt();
      print1_n(n);
      }
    static void print1_n(int n){
      if(n==0){
          //base case
        return;
        }
      print1_n(n-1);//this will go until the base case is reached
      System.out.print(n+" ");//continues its execution after the base case has reached
    }
  }

//explanation:
//n=5->n!=0->calls func->n=4,not 0,calls func->n=3,not 0,calls func=>n=2,not 0,calls func=>n=1 not 0 calls func=>n=0 so it return to n=1 and remaining statement is executed so prints 1 then return to n=2 then prints 2
//then returns to n=3 and prints 3 then n=4 the n=5

/*TIME COMPLEXITY:the function runs for about n+1 times so,time complexity->O(n)
SPACE COMPLEXITY:We are only declaring some variables of constant size,space complexity->O(1) but as we are using recursion,
due to recursion stack,goes to the max depth of n, the space complexity->O(n)*/
