import java.util.*;
public class task4 {
 static boolean check(String a){
 int v=0;
 char[] sk = a.toCharArray();
 for(int i=0;i<sk.length;i++){
 if(sk[i]==sk[sk.length-1-i]){
 v++;
 }
 }
 if(v==sk.length){
 return true;}
 else{
 return false;}}
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Word ");
 String a=sc.nextLine();
 boolean f=check(a);
 if(f){
 System.out.println("Yes,Given String is palindrome.");
 }
 else{
 System.out.println("Given String is not palindrome.");
 }
 sc.close();
 }}
