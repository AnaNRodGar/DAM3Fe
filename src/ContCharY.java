
import java.io.IOException;
import java.util.Scanner;
public class ContCharY {
		
	public static void main(String[] args) throws IOException {
			
		System.out.println("Por favor, introduzca carácteres siendo 0 para parar de introducir: ");
			boolean repetir = true;
			Scanner teclado = new Scanner(System.in);
			
			int ContY = 0;
			
			while (repetir){
			char c = (char) System.in.read();
			int asc_c = (int) c;
			
			if (asc_c == 89 || asc_c == 121){
				ContY++;
				}
			if (asc_c == 48){
				System.out.print("Ha introducido el carácter 'Y' " +ContY +" veces.");
				repetir = false;
			}
			}
			teclado.close();	
			//prueba de ETS
			//cambio para la prueba de ETS
			}
		}
