import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnimalRepository {

    private static List<Animal> animaisCadastrados = new ArrayList<>();

    private static int sequence = 1;

    public void cadastra(Animal animal){
        setId(animal);

            animaisCadastrados.add(animal);
        if (Objects.nonNull(animal) && Objects.nonNull(animal.getDono())) {
            animaisCadastrados.add(animal);
        } else {
            System.err.println("Animal não pode ser nulo e/ou sem Dono!");
        }
    }

    private void setId(Animal animal) {
        animal.setId(sequence);
        animal.getDono().setId(sequence);
        animal.getDono().getEndereco().setId(sequence);
        sequence ++;
    }
    public void mostrar(){
        System.out.println("__________________________________________");
        System.out.println("|            Animais cadastrados          |");
        System.out.println("|_________________________________________|");
        for (Animal animal: animaisCadastrados) {
            System.out.println(animal);
        }

        if (animaisCadastrados.isEmpty()){
            System.out.println("__________________________________________");
            System.out.println("|       Nenhum animal foi cadastrado     |");
            System.out.println("__________________________________________");
        }
    }

    public void limpaCadastro(){
        System.out.println("__________________________________________");
        System.out.println("|           Limpando cadastro(s)         |");
        System.out.println("__________________________________________");

        this.animaisCadastrados.clear();
    }


}
