public abstract class Animal {

        private int id = 0;
        private TipoAnimalEnum tipoAnimal;
        private String nome;
        private int idade;
        private Dono dono;




    public void setNome(String nome) {
            this.nome = nome;
        }


        public void setIdade(int idade) {

                this.idade = idade;
        }

        public void setDono(Dono dono) {
            this.dono = dono;
        }

        public void setTipoAnimal(TipoAnimalEnum tipoAnimal) {
            this.tipoAnimal = tipoAnimal;
        }


        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public Dono getDono() {
            return dono;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
        this.id = id;
        }

    public TipoAnimalEnum getTipoAnimal() {
            return tipoAnimal;
        }


    public Animal(TipoAnimalEnum tipoAnimal, String nome, int idade,Dono dono) {
        this.tipoAnimal=tipoAnimal;
        this.nome=nome;
        this.idade=idade;
        this.dono=dono;
    }


    @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", tipoAnimal=" + tipoAnimal +
                    ", nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", dono=" + dono +
                    '}';
        }

}
