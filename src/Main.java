import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,2,4,2,5,6,82,1,2);
        int [] A = new int[list.size()];
        int [] B = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            A[i] = list.get(i);
        }
        int j, top = 0;
        boolean repetido;
        for (int i = 0; i<list.size(); i++){
            repetido = false;
            j = 0;
            while (!repetido && (j<top)){
                if(A[i] == B[j]){
                    repetido = true;
                }
                j++;
            }
            if(!repetido){
                B[top] = A[i];
                top++;
            }
        }
        for (int i = 0; i<top; i++){
            System.out.println(B[i]);
        }
        /*int contador = 0;
        boolean existencia =  false;
        for (Integer n: list) {
            for (int i=0;i<list.size();i++){
                if(contador!=i){
                    if(n==list.get(i)){
                        existencia = true;
                        break;
                    }
                }
            }
            if(existencia== false){
                listSinNumerosRepetidos.add(n);
            }
            contador++;

        }
        for (Integer v:listSinNumerosRepetidos) {
            System.out.println(v);
        }*/
    }
}