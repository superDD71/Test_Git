import java.util.Scanner;

public class Sdz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Veuillez entrer du texte");
				String str = sc.nextLine();
				System.out.println("Vous avez saisi : " + str);
				System.out.println("Veuillez saisir un nombre");
				int nombreTest = sc.nextInt();
				System.out.println("Vous avez saisie le nombre : " + nombreTest);
				System.out.println("Entrez un seul caractere");
				sc.nextLine();
				String strIndex = sc.nextLine();
				char charTest = strIndex.charAt(0);
				System.out.println("Vous avez tapé la lettre : " + charTest);
				Scanner nbre = new Scanner(System.in);
				System.out.println("Veuillez taper un nombre!");
				int i = nbre.nextInt();
				if (i < 0)
				
				
					System.out.print("Le nombre est négatif!!");
				
				else
				
					System.out.println("Le nombre est positif");
				
				nbre.nextLine();
				System.out.println("veuillez taper un nombre!");
				i = nbre.nextInt();
				if (i<100 || i>100)
					System.out.println("Nombre extérieur à l'interval");
				else
					System.out.println("Nombre dans l'interval");
				nbre.nextLine();
				
	}

}
