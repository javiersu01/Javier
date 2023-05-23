
public class Ejemplo {

		public static void main(String[] args) {
			
			int numero1=15;
			int numero2=0;
			try {
			int solucion=numero1/numero2;
			System.out.println(solucion);		
			}
			catch (ArithmeticException e) {
				System.out.println("no puedo dividir por cerp");
			}
			catch (Exception e) {
				System.out.println("Algo pasa, pero no se decirte");
			}
}}
