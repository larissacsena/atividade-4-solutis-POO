package model;

/*Criar uma classe abstrata AnimalAB que implementa a interface AnimalIF e
define os métodos abstrados assinado na interface.*/

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalAB() {
    }

    public AnimalAB(String nome, String tipoAnimal, String habitat, int idade, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void comer(String alimento) {
        System.out.println(nome + " comeu " + alimento);
    }

    @Override
    public abstract void moverse(String distancia);

    @Override
    public void dormir(String qtdHoras) {
        System.out.println(nome + " dormiu " + qtdHoras);
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Tipo: " + tipoAnimal + "\n" +
                "Idade: " + idade + "\n" +
                "Habitat: " + habitat + "\n" +
                "Altura: " + altura + " metros\n" +
                "Peso: " + peso + " kg";
    }

}
