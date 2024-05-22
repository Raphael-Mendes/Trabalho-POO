public class usuario {
    private String nome;
    private String idade;
    private String matricula;

    public void pegarQuestao(){}; // por meio de random, pegar alguma questão e fazer verificaçao se já não está no histórico do aluno
    public void responderQuestao(){}; // ao final, adicionar questao no historico do aluno

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
