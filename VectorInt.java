import java.util.Arrays;

public class VectorInt implements IMinMax, IEstadisticas{
    
    //Atributos
    int[] vector = {1, 2, 2, 3, 6, 6, 6, 6, 7, 9, 9, 9};

    //Constructor
    public VectorInt(int longitud) {

    }

    //Setters
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    //Getters
    public int[] getVector() {
        return vector;
    }

    //Metodos
    public String toString() {
        return "";
    }

    public void random(int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * (max - min) + min);
        }
    }

    @Override
    public int getMinimo() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMaximo() {

        return 0;
    }

    @Override
    public double getMedia() {
        int media = 0;

        for (int i = 0; i < vector.length - 1; i++) {
            media += vector[i];
        }
        
        media /= vector.length;
        return media;
    }

    @Override
    public double getMediana() {
        Arrays.sort(vector);

        int xNumMax = 1;
        int numTmp = vector[0];
        int numMax = numTmp;
        int xNumTmp = 0;

        for (int i = 1; i < vector.length; i++) {
            if (numMax == vector[i]) {
                xNumMax++;
            } else {
                numTmp = vector[i];
                xNumTmp++;

                if (xNumMax < xNumTmp) {
                    xNumMax = xNumTmp;
                    numMax = vector[i];
                    xNumTmp = 0;
                }
            }
        }
        return numMax;
    }

    @Override
    public int getModa() {
        // TODO Auto-generated method stub
        return 0;
    }
}
