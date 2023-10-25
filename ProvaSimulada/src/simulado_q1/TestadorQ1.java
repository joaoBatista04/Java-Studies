package simulado_q1;

import java.util.Date;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		UserBase ub = new UserBase();
		User jp = ub.createUser("JP", false);
		jp.addTweet(new Tweet("Olá"));
		jp.addTweet(new Tweet("Olá!!!!!"));
		for (Tweet t : jp.getTweets())
		{
			System.out.println(t.getText());
		}

		ub.createUser("Fulano", true);
		System.out.println(ub.getPercentageVerifiedUsers());
		System.out.println(ub.averageTweetLength());


	}

}
