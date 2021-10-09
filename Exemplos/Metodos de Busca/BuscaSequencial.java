public class BuscaSequencial {

    public int buscaSequencialIterativa(int chave, int[] vetor) {
        for (int i=0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                return i; //item encontrado, é retornado
            }
            if (vetor[i] > chave) {
                return -1; //item não encontrado
            }
        }
        return -1;
    }

    public int buscaSequencialRecursiva(int chave, int[] vetor) {
        return buscaSequencialRecursiva(chave, vetor, 0);
    }

    public int buscaSequencialRecursiva(int chave, int[] vetor, int i) {
        if (i >= vetor.length || vetor[i] > chave) {
            return -1;
        }
        if (vetor[i] == chave) {
            return i;
        }
        return buscaSequencialRecursiva(chave, vetor, i+1);
    }

    public static void main(String[] args) {
        BuscaSequencial b = new BuscaSequencial();
        int[] vetorOrdenado = new int[]{1, 2, 5, 7, 9, 11, 12, 18, 19, 21};
        System.out.println("Busca sequencial iterativa");
        System.out.println(b.buscaSequencialIterativa(9, vetorOrdenado));
        System.out.println(b.buscaSequencialIterativa(10, vetorOrdenado));
        System.out.println(b.buscaSequencialIterativa(13, vetorOrdenado));
        System.out.println(b.buscaSequencialIterativa(18, vetorOrdenado));

        System.out.println("Busca sequencial recursiva");
        System.out.println(b.buscaSequencialRecursiva(9, vetorOrdenado));
        System.out.println(b.buscaSequencialRecursiva(10, vetorOrdenado));
        System.out.println(b.buscaSequencialRecursiva(13, vetorOrdenado));
        System.out.println(b.buscaSequencialRecursiva(18, vetorOrdenado));
    }

}