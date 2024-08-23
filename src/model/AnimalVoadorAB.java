package model;

public abstract class AnimalVoadorAB extends AnimalAB {

    protected int quantidadeAsas;
    protected double envergaduraAsa;
    protected int quantidadePatas;

    public AnimalVoadorAB(String nome, String tipoAnimal, String habitat, int idade, int quantidadePatas, int quantidadeAsas, double envergaduraAsa, double altura, double peso) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public double getQuantidadePatas() {
        return quantidadePatas;
    }


    @Override
    public void moverse(String distancia) {
        System.out.println(nome + " voou " + distancia);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Quantidade de Asas: " + quantidadeAsas + "\n" +
                "Envergadura das Asas: " + envergaduraAsa + "\n" +
                "Quantidade de Patas: " + quantidadePatas + "\n";
    }
}
