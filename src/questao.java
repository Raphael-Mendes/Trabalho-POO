import java.util.ArrayList;

public class questao {
    private String texto;
    private String id;
    static ArrayList<questao> bancoQuestao = new ArrayList<>();


    public static void adicionarNoBanco(String texto, String id){
        bancoQuestao.add(new questao(texto, id));
    }
    public questao(String texto, String id) {
        this.texto = texto;
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setId(String id) {
        this.id = id;
    }
}
