public class Cachorro {

    private String nome;
    private String raca;
    private int idade;
    private int id;
    private Dono dono;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dono getDono() {
        return dono;
    }
    public void setDono(Dono dono) {
        if (dono!=null) {
            this.dono = dono;
        }else{
            System.out.println("Não autrizado cachorro sem dono.");
        }
    }

    public Cachorro(String nome, String raca, int idade, Dono dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +", id='"
                + id +'\''+", dono='"+ getDono() +'\''+
                '}';
    }

}
