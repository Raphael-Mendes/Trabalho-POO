import java.util.Scanner;

public class professor extends usuario{
    Scanner s = new Scanner(System.in);
    public void criarQuestao(){
        String textoQuestao = s.nextLine();
        String idQuestao = s.nextLine();
        questao.adicionarNoBanco(textoQuestao, idQuestao);
    }
}
