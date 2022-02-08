
package testeaps;

import java.util.Scanner;

/**
 *
 * @author Verônica Oliveira
 */
public class TesteAps {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe nome do curso");
        String nome = ler.nextLine();
        
        System.out.println("Informe horário do curso");
        String horario = ler.nextLine();
        
        Curso curso = new Curso(nome, horario);
        
        System.out.println("Informe o professor");
        String nomeProfessor = ler.nextLine();
        
        curso.setProfessor(new Professor(nomeProfessor));
        
        for (int i = 0; i < 5; i++){
            System.out.println("------------------------");
            System.out.println("--- CADASTRAR ALUNOS ---");
            System.out.println("Informa nome do aluno:");
            Aluno aluno = new Aluno(ler.nextLine());
            curso.addAluno(aluno);
         }
        System.out.println("ALUNOS CADASTRADOS COM SUCESSO!!");
       
        int consulta = 0;
        for(int i = 1; i <= 5; i++){
            consulta++;  
            for (Aluno cad: curso.getAlunos()){
               
                if(consulta == cad.getMatricula()){
                    System.out.println("******INFORMAR NOTAS******");
                    System.out.println("");
                    System.out.println("NOME: " + cad.getNome());
                    System.out.println("MATRÍCULA: " + cad.getMatricula());
                    cad.lancarNotas();
                    System.out.println("##########################");
                    break;
                }
            }
        }
        for(Aluno cad: curso.getAlunos()){
            cad.exibirDados();
            System.out.println("###################");
        }
        
        System.out.println("==> Média geral da turma: " + curso.mediaTurma());
        
    }
}
