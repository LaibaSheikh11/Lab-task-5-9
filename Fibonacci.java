import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("\nENTER HOW MANY NUMBER OF TERMS YOU WANT:  ");
int n=sc.nextInt();
int i=0,j=1,nextTerm;
System.out.println(" \nFIBONACCI SERIES ");
for(int c=0;c<n;c++)
{
if(c<=1)
nextTerm=c;
else
{
nextTerm=i+j;
i=j;
j=nextTerm;
}
System.out.println(nextTerm);
}
}
}