import java.util.Random;
import java.util.Scanner;

public class TrocaDeMensagens {

	public static void main(String[] args) {
		/*Scanner read = new Scanner(System.in);
		System.out.println("Qual Processo É Você? ");
		String processo = read.nextLine();
		Processo processoTransmissor = new Processo();
		processoTransmissor.nome = processo;
		
		System.out.println("Escreva Uma Mensagem: ");
		String mensagem = read.nextLine();
		
		System.out.println("Para Qual Processo Deseja Enviar A Mensagem? ");
		String processoEscolhido = read.nextLine();
		Processo processoReceptor = new Processo();
		processoReceptor.nome = processoEscolhido;

		TrocaDeMensagens trocaDeMensagens = new TrocaDeMensagens();
		if (trocaDeMensagens.trocaDeMensagem(processoReceptor, processoTransmissor, mensagem).isEmpty()) {
			System.out.println("Erro Na Troca De Mensagens!");
		} else {
			System.out.println("Troca De Mensagens Feita Com Sucesso!");
		}*/
		
	}

	public String trocaDeMensagem(Processo processoReceptor, Processo processoTransmissor, String mensagem) {
		processoReceptor.send(mensagem);
		return processoTransmissor.receive(mensagem);
	}

}
