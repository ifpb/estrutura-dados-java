import java.lang.Math;

public class BuscaBinaria {

    public int buscaBinariaIterativa(int[] vetor, int chave) {
    
        int primeiro = 0;
        int ultimo = vetor.length - 1;

        while (primeiro <= ultimo) {
            int meio = (primeiro + ultimo) / 2;
            if (vetor[meio] == chave) {
                return meio;
            }
            if (chave < vetor[meio]) {
                ultimo = meio - 1;
            } else {
                primeiro = meio + 1;
            }
        }
        return -1; // item não encontrado
    }

    public int buscaBinariaRecursiva(int[] vetor, int chave) {
        return buscaBinariaRecursiva(vetor, chave, 0, vetor.length-1);
    }

    public int buscaBinariaRecursiva(int[] vetor, int chave, int primeiro, int ultimo) {
        int meio = (primeiro + ultimo) / 2;
        
        if (vetor[meio] == chave)
            return meio;

        if (meio == 0 || primeiro == ultimo) 
            return -1;

        if (chave < vetor[meio])
            return buscaBinariaRecursiva(vetor, chave, primeiro, meio);
        else
            return buscaBinariaRecursiva(vetor, chave, meio+1, ultimo);

    }

    public static void main(String[] args) {
        int[] vetorOrdenado = new int[]{1, 2, 5, 7, 9, 11, 12, 18, 19, 21};
        
        BuscaBinaria b = new BuscaBinaria();
        System.out.println("Busca Binária Iterativa");
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 2));
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 9));
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 13));
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 15));

        System.out.println("Busca Binária Recursiva");
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 2));
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 9));
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 13));
        System.out.println(b.buscaBinariaIterativa(vetorOrdenado, 15));

    }

} 