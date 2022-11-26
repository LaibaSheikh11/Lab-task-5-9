import java.util.Scanner;
public class CalculationProgram {
public static void main(String[] args){
System.out.println(" \t CALCULATION PROGRAM ");
System.out.println(" PLEASE ENTER X AND Y VALUE TO PROCEED ");
Scanner reader = new Scanner(System.in);
System.out.print(" x Value is : ");
int x = reader.nextInt();
System.out.print(" y Value is : ");
int y = reader.nextInt();
System.out.print("\n");
System.out.println("ADDITION, SUBTRACTION, MULTIPLICATION AND DIVISION CALCULATER\n");
System.out.print( " X + Y =  " ); System.out.println( x+y );
System.out.print( " X - Y =  " ); System.out.println( x-y );
System.out.print( " X x Y =  " ); System.out.println( x*y );
System.out.print( " X / Y =  " ); System.out.println( x/y );

 }
}