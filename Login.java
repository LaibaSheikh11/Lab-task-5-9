import java.util.Scanner;


public class Login {


public static void main(String[] args) {
System.out.println("\n\tLOGIN INTERFACE\n");

Scanner in = new Scanner(System.in);


System.out.print("\n   EMAIL: ");


String email = in.nextLine();


System.out.print("PASSWORD: ");


String password = in.nextLine();


String[][] userDetails = {


{"email1@gmail.com", "password1"},

{"email2@gmail.com", "password2"},

{"email3@gmail.com", "password3"},

{"email4@gmail.com", "password4"},

{"email5@gmail.com", "password5"}

};


boolean isValidUser = false;


for (int i = 0; i < userDetails.length; i++) {


if (userDetails[i][0].equals(email) && userDetails[i][1].equals(password)) {

isValidUser = true;


break;


}


}


if (isValidUser) {


System.out.println("\n\t  WELCOME!");


} 
else {


System.out.println("\n      INVALID EMAIL OR PASSWORD.");


}


}


}