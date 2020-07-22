
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario albert = new Gerente();
		albert.setNome("Albert");
		albert.setCpf("222.222.222-22");
		albert.setSalario(2500);
		
		System.out.println(albert.getNome());
		System.out.println(albert.getBonificacao());
		
	}
}
