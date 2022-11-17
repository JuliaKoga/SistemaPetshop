public class Passaro extends Animal{


    public void setDono(Dono dono) {
        if (dono!=null) {
            this.setDono(dono);
        }else{
            System.out.println("Não autrizado gato sem dono.");
        }
    }

    public Passaro(TipoAnimalEnum tipoAnimal, String nome, int idade, Dono dono) {
        super(tipoAnimal, nome, idade, dono);
    }

    @Override
    public String toString() {
        return "Passaro" + super.toString();
    }
}
