public class CadastroCao {

    private static Cachorro[] cachorrosCadastrados = new Cachorro[10];

    private static int i = 0;

    public static void cadastrar (Cachorro cachorro){
        if(cachorro!=null){
            cachorrosCadastrados[i] = cachorro;
            i++;
        }else{
            System.err.println("Valor não deve ser nulo.");
        }
    }

    public static void mostrar (){
        for(Cachorro cachorros : cachorrosCadastrados ) {
            System.out.println(cachorros);
        }
    }

}
