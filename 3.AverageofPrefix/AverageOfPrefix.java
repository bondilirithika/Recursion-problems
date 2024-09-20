import java.util.Scanner;
import java.util.ArrayList;
class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<>();
    System.out.print("Enter elements, enter -1 to stop:");
    while(true)
      {//taking input from the user
        int input=sc.nextInt();
        if(input==-1)   
          break;
        else
          arr.add(input);
      }
    ArrayList<Integer> res=new ArrayList<>();
    avgofpref(arr,res,0,0);
    System.out.print(res);
  }

  static void avgofpref(ArrayList<Integer> arr,ArrayList<Integer> res,int sum,int i)
  {
    if(i>=arr.size())
      return;//base case
    sum+=arr.get(i);
    res.add(sum/(i+1));
    avgofpref(arr,res,sum,i+1);
  }
}
        
