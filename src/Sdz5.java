import java.util.Scanner;
public class Sdz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CONVERTISSEUR DE DEGRES CELSIUS ET DE DEGRES FAHRENHEIT "
				+ "\n-------------------------------------------------------");
		char restart;
		
		do 
		{
			int modeChoisi = 0;
			double temperatureChoisie;
			double temperatureConvertie;
			Scanner sc = new Scanner(System.in);
			double arrondiTempConv;
			
			while ( modeChoisi != 1 && modeChoisi != 2 )
			{
			System.out.println("Choisissez le mode de conversion "
					+ "\n 1 - Convertisseur Celsius - Fahrenheit "
					+ "\n 2 - Convertisseur Fahrenheit - Celsius");
			modeChoisi = sc.nextInt();
			}
			
			
			
			System.out.println("Température à convertir : ");
			temperatureChoisie = sc.nextFloat();
			if (modeChoisi == 1)
			{			
				temperatureConvertie = 9/5*temperatureChoisie +32;
				arrondiTempConv= arrondi(temperatureConvertie, 2);
				System.out.println(temperatureChoisie + " °C est égale à : " + arrondiTempConv + " °F");
			}
			else
			{
				temperatureConvertie = ((temperatureChoisie-32)*5)/9;
				arrondiTempConv= arrondi(temperatureConvertie, 2);
				System.out.println(temperatureChoisie + " °F est égale à : " + arrondiTempConv + " °C");
			}
			
			sc.nextLine();
			
			do
			{
			System.out.println("Voulez-vous convertir une autre température? O/N?");
			restart = sc.nextLine().charAt(0);
			}while (restart != 'O' && restart != 'N' && restart != 'o' && restart != 'n');
			
			
		}while (restart == 'O' || restart == 'o');
		
	System.out.println("A bientôt les boloss!!!!!!!!!!!!!");
	
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
}
