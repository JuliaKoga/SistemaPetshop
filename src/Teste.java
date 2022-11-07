public class Teste {
    public static void main(String[] args) {

        CadastroCao cadastroCao = new CadastroCao();

        Endereco endereco1 = new Endereco("Rua X", 1111,"Bairro X", "00000-000","SP");
        Endereco endereco2 = new Endereco("Rua Y", 2222,"Bairro Y", "11111-111","RJ");
        Endereco endereco3 = new Endereco("Rua Z", 3333,"Bairro Z", "33333-333","MG");
        Dono joao = new Dono("João","joao01@hotmail.com","000000000-00",endereco1);
        Dono maria = new Dono("Maria","maria02@hotmail.com","111111111-11", endereco2);
        Dono luis = new Dono("Luis","luis03@gmail.com","333333333-33",endereco3);
        Cachorro toby = new Cachorro("Toby","vira lata",12,joao);
        Cachorro lua = new Cachorro("Lua","pischer",3,maria);
        Cachorro mel = new Cachorro("Mel","golden",1,luis);


        cadastroCao.cadastrar(mel);
        cadastroCao.cadastrar(toby);
        cadastroCao.cadastrar(lua);
        cadastroCao.mostrar();
    }
}
