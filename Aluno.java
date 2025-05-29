package HashTable;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private String email;

    public Aluno(String matricula, String nome, String curso, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    
}
