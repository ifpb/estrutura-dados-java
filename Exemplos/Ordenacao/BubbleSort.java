import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {

    public List<Integer> listaNumerosAleatorios(int qtd) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<qtd; i++) {
            int num = rand.nextInt(qtd*10);
            nums.add(num);
        }
        return nums;
    }

    public void bubbleSort(List<Integer> lista) {
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i=0; i < lista.size()-1; i++) {
                if (lista.get(i) > lista.get(i+1)) {
                    trocou = true;
                    int aux = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, aux);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> nums = bubbleSort.listaNumerosAleatorios(5);
        bubbleSort.bubbleSort(nums);
        System.out.println("nums = "+ nums);
    }


}