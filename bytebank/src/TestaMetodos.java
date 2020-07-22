
public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoAlbert = new Conta();
		contaDoAlbert.saldo = 100;
		contaDoAlbert.deposita(50);
		
		System.out.println(contaDoAlbert.saldo);
		boolean conseguiuRetirar = contaDoAlbert.saca(20);
		System.out.println(contaDoAlbert.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoAlbert)) {
			System.out.println("Transferência realizada com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoAlbert.saldo);
	}
}
