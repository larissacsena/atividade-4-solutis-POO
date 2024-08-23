package model;

public abstract class AnimalTerrestreAB extends AnimalAB {

    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, String habitat, int idade, int quantidadePatas, double altura, double peso) {
        super(nome, tipoAnimal, habitat, idade, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    @Override
    public void moverse(String distancia) {
        System.out.println(nome + " andou " + distancia);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Quantidade de Patas: " + quantidadePatas + "\n";
    }


}
