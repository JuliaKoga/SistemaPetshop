public class CadastroCao {

    private Cachorro[] cachorrosCadastrados = new Cachorro[10];

    private static int i = 0;

    public void cadastrar (Cachorro cachorro){
        if(cachorro!=null){
            cachorrosCadastrados[i] = cachorro;
            i++;
        }else{
            System.err.println("Valor não deve ser nulo.");
        }
    }

    public void mostrar (){
        for(Cachorro cachorros : cachorrosCadastrados ) {
            System.out.println(cachorros);
        }
    }

}
