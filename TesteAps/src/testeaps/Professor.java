
package testeaps;

/**
 *
 * @author Verônica Oliveira
 */
public class Professor {
    //Atributos
    private String nome;
    private String departamento;
    private String email;
    
    //Construtor
    public Professor (String nome){
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }
    
    //Métodos
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
