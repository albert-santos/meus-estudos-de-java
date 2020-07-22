
public class TestaBanco {
	public static void main(String[] args) {
		Cliente albert = new Cliente();
		albert.nome = "Albert Santos";
		albert.cpf = "222.222.222-22";
		albert.profissao = "programador";
		
		Conta contaDoAlbert = new Conta();
		contaDoAlbert.deposita(100);
		
		contaDoAlbert.titular = albert;
		System.out.println(contaDoAlbert.titular.nome);
	}
}
