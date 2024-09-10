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
        return;
        }
      print1_n(n-1);
      System.out.print(n+" ");
    }
  }
