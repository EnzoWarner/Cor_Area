// Classe Retangulo, subclasse de Forma2D
class Retangulo extends Forma2D {
    private float base;
    private float altura;

    public Retangulo() {
        super();
        this.base = 1.0f;
        this.altura = 1.0f;
    }

    public Retangulo(String cor, float base, float altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Altura: " + altura;
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }
}
