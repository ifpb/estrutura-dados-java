import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class InsertionSort {

    public List<Integer> listaNumerosAleatorios(int qtd) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<qtd; i++) {
            int num = rand.nextInt(qtd*10);
            nums.add(num);
        }
        return nums;
    }

    public void insertionSort(List<Integer> lista) {
        for (int i=0; i<lista.size(); i++) {
            int chave = lista.get(i);
            int j = i - 1;
            while(j >= 0 && chave < lista.get(j)) {
                lista.set(j+1, lista.get(j));
                j--;
            }
            lista.set(j+1, chave);
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        List<Integer> nums = insertionSort.listaNumerosAleatorios(5);
        insertionSort.insertionSort(nums);
        System.out.println("nums = "+ nums);
    }


}