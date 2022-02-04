import java.util.Arrays;

public class Ordenar{
    public static void main(String[] args) {
        int[] ordena = new int[]{9,5,7,2,0,10,3,8};

        int aux = 0;

        for (int i = 0; i < ordena.length; i++)
            for (int j = 0; j < ordena.length; j++) {
                // se quiser de trocar de ordem é só trocar < por >
                if (ordena[i] < ordena[j])
                {
                    aux = ordena[i];
                    ordena[i] = ordena[j];
                    ordena[j] = aux;

                }
            }






         //System.out.println("vetor original: " + Arrays.toString(ordena));
        System.out.println("Vetor ordenado: " + Arrays.toString(ordena));
        //System.out.println(ordena[0]+1);
    }
}
