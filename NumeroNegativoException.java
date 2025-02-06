package m1_18_Marta_Laveda_Box;

public class NumeroNegativoException extends Exception{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public NumeroNegativoException(String nombreError) {
	super(nombreError);
	System.out.println("Has introducido un número negativo, prueba de nuevo.");
}

}
