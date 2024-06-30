// Classe abstrata Forma2D
abstract class Forma2D {
    private String cor;

    public Forma2D() {
        this.cor = "branco";
    }

    public Forma2D(String cor) {
        this.cor = cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Cor: " + cor;
    }

    public abstract float calcularArea();
}
