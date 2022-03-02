package aprendendo;

public class IfElse {
	public static void main(String[]Args) {
		int NotaPortugues = 0;
		int NotaMatematica = 5;
		int NotaCiencias = 5;
		int NotaHistoria = 5;
		int NotaArtes = 7;
		int NotaFinal = (NotaPortugues + NotaMatematica + NotaCiencias + NotaHistoria + NotaArtes);
		int Recuperacao = 5;
		
		if(NotaFinal>= 20) {
			System.out.println("Aprovado");
		}
		else if(NotaFinal + Recuperacao>= 20) {
			System.out.print("Aprovado com recuperação!");
		}
		else {
			System.out.print("Reprovado");
		}
		
		
		
		
	}

}
