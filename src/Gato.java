public class Gato extends Animal implements Internavel{

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
            System.out.println("Não autrizado gato sem dono.");
        }
    }

    public Gato(TipoAnimalEnum tipoAnimal, String nome, int idade, Dono dono) {
        super(tipoAnimal, nome, idade, dono);
    }

    @Override
    public boolean estaDoente() {
        return this.estaDoente;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raca='" + raca + '\'' +
                "} " + super.toString();
    }
}


