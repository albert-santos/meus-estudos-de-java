//Contrato autentic�vel
	//Quem assinar esse contrato, precisa implementar
		//m�todo senha
		//m�todo autentica

public abstract interface  Autenticavel{
	
	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);

}