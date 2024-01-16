import java.util.Scanner;
public class frq 
{ 
 public static void main(String[] args) { 
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the text: ");
 String text=sc.nextLine();
 String[] w = text.split("\\s+");
 int a[]=new int[w.length];
 for(int i=0;i<w.length;i++){
 a[i]=0;
 }
 for(int i=0;i<w.length;i++){
 int p=1;
 if(a[i]==0){
 for(int j=i+1;j<w.length;j++){
 if(w[i].equals(w[j])){
 a[j]++;
 p++;
 }
 }
 System.out.println(w[i]+" :"+p);
 }}sc.close();;
}}
