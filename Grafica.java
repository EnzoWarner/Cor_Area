// Classe Grafica
class Grafica {

    private void show(Forma2D figura) {
        System.out.println(figura.toString());
        System.out.println("Área: " + figura.calcularArea());
    }

    public static void main(String[] args) {
        Grafica grafica = new Grafica();

        // Instanciando e utilizando um Circulo
        Circulo circulo = new Circulo("vermelho", 2.5f);
        grafica.show(circulo);

        // Instanciando e utilizando um Retangulo
        Retangulo retangulo = new Retangulo("azul", 4.0f, 3.0f);
        grafica.show(retangulo);
    }
}