public class ListaEncadeada {

    public No cabeca;
    public No cauda;

    public ListaEncadeada() {
    }

    public ListaEncadeada(No cabeca, No cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public void inserirNoInicio(Object valor) {
        No novo = new No(valor);
        if (this.cabeca == null && this.cauda == null) {
            // Lista vazia
            this.cabeca = this.cauda = novo;
        } else {
            novo.prox = this.cabeca;
            this.cabeca = novo;
        }
    }

    public void inserirNoFinal(Object valor) {
        No novo = new No(valor);
        if (this.cabeca == null && this.cauda == null) {
            // Lista vazia
            this.cabeca = this.cauda = novo;
        } else {
            this.cauda.prox = novo;
            this.cauda = novo;
        }
    }

    public void imprimir() {
        No atual = this.cabeca;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.prox;
        }
    }

    public void removerDoInicio() {
        if (this.cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }
        if (this.cabeca.equals(this.cauda)) {
            // Lista possui apenas um elemento
            this.cabeca = this.cauda = null;
        } else {
            this.cabeca = this.cabeca.prox;
        }
    }

    public void removerDoFinal() {
        if (this.cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }
        if (this.cabeca.equals(this.cauda)) {
            // Lista possui apenas um elemento
            this.cabeca = this.cauda = null;
        } else {
            No atual = this.cabeca;
            while (!atual.prox.equals(this.cauda)) {
                atual = atual.prox;
            }
            this.cauda = atual;
            atual.prox = null;
        }
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNoInicio(50);
        lista.inserirNoInicio(10);
        lista.inserirNoFinal(21);
        lista.inserirNoFinal(56);
        System.out.println("Elementos da lista: ");
        lista.imprimir();
        lista.removerDoInicio();
        lista.removerDoFinal();
        System.out.println("Elementos da lista depois da remoção: ");
        lista.imprimir();
    }

}