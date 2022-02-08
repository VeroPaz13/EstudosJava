
package testeaps;

import java.util.ArrayList;

/**
 *
 * @author Verônica Oliveira
 */
public class Curso {
    //Atributos
    private String nome;
    private String horario;
    private Professor professor;
    private ArrayList<Aluno> alunos;
     
    //Construtor
    public Curso (String nome, String horario){
        this.nome = nome;
        this.horario = horario;
    }

   //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void addAluno(Aluno aluno){
        if (this.alunos == null){
            this.alunos = new ArrayList<>();
        }
        
        this.alunos.add(aluno);
    }
    
    public float mediaTurma(){
        float media = 0;
        
        for(Aluno aluno: this.alunos){
            media += (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4()) / 4;
        }
        
        media = media / this.alunos.size();
        
        return media;
    }
}
