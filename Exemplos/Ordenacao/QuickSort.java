import java.util.*;
import java.util.stream.*;
import java.util.Collections;

/**
Source: https://joaoarthurbm.github.io/eda/posts/quick-sort/

 */
public class QuickSort {

    public List<Integer> listaNumerosAleatorios(int qtd) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<qtd; i++) {
            int num = rand.nextInt(qtd*10);
            nums.add(num);
        }
        return nums;
    }

    public List<Integer> quickSort(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista;
        }
        int pivo = lista.get(0);
        List<Integer> iguais = lista.stream().filter( x -> x == pivo).collect(Collectors.toList());
        List<Integer> menores = lista.stream().filter( x -> x < pivo).collect(Collectors.toList());
        List<Integer> maiores = lista.stream().filter(x -> x > pivo).collect(Collectors.toList());
        
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        List<Integer> nums = quickSort.listaNumerosAleatorios(20);
        quickSort.quickSort(nums);
        System.out.println("nums = "+ nums);
    }


}