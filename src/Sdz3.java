import java.util.*;
public class Sdz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prenom;
		char reponse = 'O';
				while (reponse=='O')
				{
					System.out.println("Veuillez taper un prénom :");
					Scanner tapage = new Scanner(System.in);
					prenom = tapage.nextLine();
					System.out.println("Bonjour " + prenom + "!, comment allez-vous?");
					reponse = ' ';
					
					while (reponse != 'O' && reponse != 'N' )
					{
						System.out.println("Voulez-vous réessayer? O/N?");
						reponse = tapage.nextLine().charAt(0);
					}
				}
				System.out.println("Merci, Aurevoir!");
	}

}
