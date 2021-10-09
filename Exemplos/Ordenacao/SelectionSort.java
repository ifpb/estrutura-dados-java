import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SelectionSort {

    public List<Integer> listaNumerosAleatorios(int qtd) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<qtd; i++) {
            int num = rand.nextInt(qtd*10);
            nums.add(num);
        }
        return nums;
    }

    public void selectionSort(List<Integer> lista) {
        for (int i=0; i<lista.size(); i++) {
            int posMenor = i;
            int menor = lista.get(i);
            for (int j=i+1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(i)) {
                    menor = lista.get(j);
                    posMenor = j;
                }
            }
            lista.set(posMenor, lista.get(i));
            lista.set(i, menor);
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> nums = selectionSort.listaNumerosAleatorios(5);
        selectionSort.selectionSort(nums);
        System.out.println("nums = "+ nums);
    }


}