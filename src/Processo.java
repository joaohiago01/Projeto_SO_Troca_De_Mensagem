
public class Processo {

	public String nome;
	
	public void send(String mensagem) {
		System.out.println("Foi Enviada Uma Mensagem Ao Processo " + this.nome + ".");
	}

	public String receive (String mensagem) {
		System.out.println("O Processo " + this.nome + " Enviou Uma Mensagem.\nLendo Mensagem...\nMensagem: " + mensagem);
		return "Processo " + this.nome + " Sua Mensagem Foi Lida Com Sucesso";
	}
	
	public void produtor () {
		
		while (true) {
			
		}
	}
}
