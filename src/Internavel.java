public interface Internavel {


    default void metodo(){
        System.out.println("Chamando o metodo default");
    }

    boolean estaDoente();
}
