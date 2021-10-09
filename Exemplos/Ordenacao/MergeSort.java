import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class MergeSort {

    public List<Integer> listaNumerosAleatorios(int qtd) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<qtd; i++) {
            int num = rand.nextInt(qtd*10);
            nums.add(num);
        }
        return nums;
    }

    public void merge(List<Integer> esquerda, List<Integer> direita, List<Integer> lista) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < esquerda.size() && j < direita.size()) {
            if (esquerda.get(i) <= direita.get(j)) {
                lista.set(k, esquerda.get(i));
                i++;
                k++;
            } else {
                lista.set(k, direita.get(j));
                j++;
                k++;
            }
        }
        while (i < esquerda.size()) {
            lista.set(k, esquerda.get(i));
            i++;
            k++;
        }
        while (j < direita.size()) {
            lista.set(k, direita.get(j));
            j++;
            k++;
        }
    }

    public List<Integer> sliceList(List<Integer> lista, int start, int end) {
        Integer[] slice = new Integer[end - start];
        for (int i=0; i < slice.length; i++) {
            slice[i] = lista.get(start+i);
        }
        return Arrays.asList(slice);
    }

    public void mergeSort(List<Integer> lista) {
        if (lista.size() < 2) {
            return;
        }
        int meio = (int)(lista.size() / 2);
        List<Integer> esquerda = sliceList(lista, 0, meio);
        List<Integer> direita = sliceList(lista, meio, lista.size());
        mergeSort(esquerda);
        mergeSort(direita);
        merge(esquerda, direita, lista);
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        List<Integer> nums = mergeSort.listaNumerosAleatorios(20);
        mergeSort.mergeSort(nums);
        System.out.println("nums = "+ nums);
    }


}