package aprendendo;

public class Banco {
public static void main(String[]Args) {
	int saldo = 0;
	int deposito = 150;
	int cobranca = 50;
	
	if (saldo + deposito>=150) {
		System.out.println("pendencia de 50 paga com sucesso!");
	}
	else {
		System.out.println("Realizar pagamento de cobrança?");
	}
}
}
