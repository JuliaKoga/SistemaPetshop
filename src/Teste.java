public class Teste {
    public static void main(String[] args) {

        AnimalRepository cadastro = new AnimalRepository();
        Internacoes internacoes = new Internacoes();

        Endereco endereco1 = new Endereco("Rua X", 1111,"Bairro X", "00000-000","SP");
        Endereco endereco2 = new Endereco("Rua Y", 2222,"Bairro Y", "11111-111","RJ");
        Endereco endereco3 = new Endereco("Rua Z", 3333,"Bairro Z", "33333-333","MG");
        Dono joao = new Dono("João","joao01@hotmail.com","000000000-00",endereco1);
        Dono maria = new Dono("Maria","maria02@hotmail.com","111111111-11", endereco2);
        Dono luis = new Dono("Luis","luis03@gmail.com","333333333-33",endereco3);
        Cachorro toby = new Cachorro(TipoAnimalEnum.CACHORRO,"Toby",5,joao);
        Cachorro lua = new Cachorro(TipoAnimalEnum.CACHORRO,"Lua",9,maria);
        Cachorro mel = new Cachorro(TipoAnimalEnum.CACHORRO,"Mel",1,luis);
        Gato pacoca = new Gato(TipoAnimalEnum.GATO,"Pacoca",3,maria);
        Passaro lala = new Passaro(TipoAnimalEnum.PASSARO, "Lala",2,luis);


        cadastro.cadastra(mel);
        cadastro.cadastra(toby);
        cadastro.cadastra(lua);
        cadastro.cadastra(pacoca);
        cadastro.cadastra(lala);
        cadastro.mostrar();

        internacoes.internar(lua);
        internacoes.internar(pacoca);
        internacoes.mostraInternados();

    }
}
