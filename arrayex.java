import java.util.Scanner;
class arrayex
{
     
        public static void main(String args[])
{
        Scanner bs=new Scanner(System.in);
        System.out.println("Enter the num of elements in array");
        int ns=bs.nextInt();

        int arr[]=new int[ns];
  
        System.out.println("Hey pls enter array values");
        for(int i=0;i<ns;i++)//traditionalfor
        {

            arr[i]=bs.nextInt();
        }
         
        System.out.println("Array values are");
        for(int dummy:arr)//referencefor
        System.out.println(dummy);  
}

}