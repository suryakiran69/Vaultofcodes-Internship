import java.util.Scanner;
public class task5 {
 public static void main(String args[]){
 System.out.print("Enter the size of list: ");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++){
 System.out.print("Enter the number: ");
 a[i]=sc.nextInt();
 }
 System.out.println("Square of each number in list is :");
 for(int i=0;i<n;i++){
 a[i]=a[i]*a[i];
 System.out.print(a[i]+"\t");
 }
 }
}
