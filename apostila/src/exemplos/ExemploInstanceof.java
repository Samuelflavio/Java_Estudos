package exemplos;

public class ExemploInstanceof {
	
	instanceof
	ExemploInstanceof obj = new String("Teste");
	if (obj instaceof String)
		System.out.println("verdadeiro");
	
	new
	Hello hello = new Hello();
	
	/* Proedencias de operadores */
	. [] ()
	* / %
	+ -
	
	/* Exemplo */
	/*Com a procedencia definida pelo java*/
	int c = 4/2+4;
	/*Neste caso, primeiro ocorrerá a divisão e após a soma.*/
	
	/*Com a precedência definida pelo desenvolvedor*/
	int a = 4/(2+4);
	/*Já neste caso, primeiro ocorrerá a soma e depois a divisão*/

}
