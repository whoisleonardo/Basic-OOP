import java.util.Scanner;

public class Aluno {
    private String nome;
    private String curso;
    private String periodo;
    private String turno;

    public static Scanner leitor = new Scanner(System.in);

    //Crie um objeto "a1" do tipo Aluno utilizando o construtor parametrizado
    public Aluno(String nome, String curso, String periodo, String turno){
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.turno = turno;
    }

    //Crie um objeto "a2" do tipo Aluno utilizando o construtor padrão.
    public Aluno (){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
                            
        String dados= "Nome do aluno: " + nome + "\n" +
                        "Curso: " + curso + "\n" +
                        "Periodo: " + periodo + "\n" +
                        "Turno: " + turno + "\n";
        return dados;
    }

}
