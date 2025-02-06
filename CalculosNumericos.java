package m1_18_Marta_Laveda_Box;


public class CalculosNumericos {
	
	

	public static void logaritmoNeperiano(double i) throws NumeroNegativoException{
		if (i<0) {
			throw new NumeroNegativoException("Número negativo, introduce un número positivo para poder calcular el logaritmo");
		}else {
		
		System.out.println(Math.log(i));
		}
	}


	public static void raizCuadrada(double j) throws NumeroNegativoException{
		if (j<0) {
			throw new NumeroNegativoException("Número negativo, introduce un número positivo para poder calcular la raíz cuadrada");
		}else {
		System.out.println(Math.sqrt(j));
		
		}
	}
}
