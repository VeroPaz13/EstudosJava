
package testeaps;

import java.util.Scanner;

/**
 *
 * @author Verônica Oliveira
 */
public class Aluno {
    Scanner ler = new Scanner (System.in);
    //Atributos
    private String nome;
    private int matricula;
    private static int auxMatricula = 1;
    private float nota1, nota2, nota3, nota4;
    
    //Construtor
    
    public Aluno(String nome){
        this.nome = nome; 
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
        this.matricula = gerarMatricula();
    }
    
    //Métodos

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getNota3() {
        return nota3;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    public float getNota4() {
        return nota4;
    }
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }
    private static int gerarMatricula(){
       
        return auxMatricula++;
    }
    
    public void exibirDados(){
        float media = calcularMedia(getNota1(), getNota2(), getNota3(), getNota4());
        
        System.out.println("MATRÍCULA: " + getMatricula());
        System.out.println("NOME: " + getNome());
        System.out.println("MÉDIA: " + media);

        if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("REPROVADO");
        }
                
    }
    
    public void lancarNotas(){
        System.out.println("Informe Nota 1:");
        setNota1 (ler.nextFloat());
        System.out.println("Informe Nota 2:");
        setNota2 (ler.nextFloat());
        System.out.println("Informe Nota 3:");
        setNota3 (ler.nextFloat());
        System.out.println("Informe Nota 4:");
        setNota4 (ler.nextFloat());
        System.out.println("==> Notas lançadas com sucesso!");
    
    }
    
    private float calcularMedia (float nota1, float nota2, float nota3, float nota4){
       float media = ((nota1 + nota2 + nota3 + nota4)/4);
       
       return media;
    }
    
}
    
   