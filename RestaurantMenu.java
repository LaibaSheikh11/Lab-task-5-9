import java.util.Scanner;
public class RestaurantMenu{
  public static void main(String[] args) {

  System.out.println("             *******MENU*******        ");
  System.out.println("1.    " +"SAMOSA");
  System.out.println("2.    " +"PATIES");
  System.out.println("3.    " +"CHAAT");
  System.out.println("4.    " +"MAGGIE");
  System.out.println("5.    " +"FRENCH FRICES");
  System.out.println("6.    " +"CHAI");
  System.out.println("7.    " +"COLD DRINKS");
  System.out.println("8.    " +"ICE CREAM");
 System.out.print("Enter Selected Item Number To Know Price :  ");
Scanner reader = new Scanner(System.in);
int Price = reader.nextInt();
 System.out.print("Price Of Selected Item Is :  ");
    switch (Price) {
      case 1:
        System.out.println("25");
        break;
      case 2:
        System.out.println("30");
        break;
      case 3:
        System.out.println("40");
        break;
      case 4:
        System.out.println("80");
        break;
      case 5:
        System.out.println("50");
        break;
      case 6:
        System.out.println("60");
        break;
      case 7:
        System.out.println("50");
        break;
           case 8:
        System.out.println("70");
        break;
    
}
System.out.println("           *****VISIT AGAIN*****        ");
}
}