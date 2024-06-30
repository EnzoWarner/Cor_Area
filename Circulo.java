// Classe Circulo, subclasse de Forma2D
class Circulo extends Forma2D {
    private float raio;

    public Circulo() {
        super();
        this.raio = 1.0f;
    }

    public Circulo(String cor, float raio) {
        super(cor);
        this.raio = raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raio: " + raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }
}
