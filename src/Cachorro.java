public class Cachorro extends Animal implements Internavel {

    private String raca;
    private boolean estaDoente;

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setDono(Dono dono) {
        if (dono!=null) {
            this.setDono(dono);
        }else{
            System.out.println("Não autrizado cachorro sem dono.");
        }
    }

    public Cachorro(TipoAnimalEnum tipoAnimal, String nome, int idade, Dono dono) {
        super(tipoAnimal, nome, idade, dono);
    }

    @Override
    public boolean estaDoente() {
        return this.estaDoente;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                "} " + super.toString();
    }
}
