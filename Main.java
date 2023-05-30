public class Main {
    public static void main(String[] args) {
        VectorInt vi = new VectorInt(5);
        vi.random(0, 5);
        System.out.println(vi);
        System.out.println("Minimo: " + vi.getMinimo());
        System.out.println("Maximo: " + vi.getMaximo());
        System.out.println("Media: " + vi.getMedia());
        System.out.println("Mediana: " + vi.getMediana());
        System.out.println("Moda: " + vi.getModa());
        System.out.println();
        VectorInt vi2 = new VectorInt(3);
        vi2.random(-20, 20);
        System.out.println(vi2);
        System.out.println("¿Es igual? " + vi.esIgual(vi2.getVector()));
        System.out.println("¿Es mayor? " + vi.esMayor(vi2.getVector()));
        System.out.println("¿Es menor? " + vi.esMenor(vi2.getVector()));
    }
}
