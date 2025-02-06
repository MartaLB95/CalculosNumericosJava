package m1_18_Marta_Laveda_Box;

import java.util.Scanner;

public class Application {
	
static Scanner entrada=new Scanner (System.in);	
static double i;
static double j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Logaritmo neperiano

	boolean numeroPositivo;
		
			do {
				numeroPositivo=true;
				System.out.println("Introduce un valor para calcular su logaritmo neperiano");
				i=entrada.nextDouble();
				
				try{
					CalculosNumericos.logaritmoNeperiano(i);
				
					}catch (NumeroNegativoException o) {
						numeroPositivo=false;}
				
			}while(!numeroPositivo);
		
		//Raíz cuadrada

			boolean numeroPositivoRaiz;
				
			do {
				numeroPositivoRaiz=true;
				System.out.println("Introduce un valor para calcular su raíz cuadrada");
				j=entrada.nextDouble();
				
				try{
					CalculosNumericos.raizCuadrada(j);
				}catch (NumeroNegativoException e) {
					numeroPositivoRaiz=false;}
				
			}while(!numeroPositivoRaiz);
		
		}
	}

