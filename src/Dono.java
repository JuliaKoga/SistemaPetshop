public class Dono {

    private String nome;
    private String email;
    private String cpf;
    private static int id = 1;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public static int getId() {
        return id;
    }
    public static void setId(){
        id++;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Dono(String nome, String email, String cpf, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = getEndereco();
        this.id++;
    }

    @Override
    public String toString() {
        return "Dono{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id='"+ id + '\''+", endereço='"
                + getEndereco() + '\''+
                '}';
    }
}
