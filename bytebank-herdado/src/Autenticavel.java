//Contrato autenticável
	//Quem assinar esse contrato, precisa implementar
		//método senha
		//método autentica

public abstract interface  Autenticavel{
	
	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);

}