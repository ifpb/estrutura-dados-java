public class ListaEncadeada {
    
    public No cabeca, cauda;

    public ListaEncadeada() {
    }

    public ListaEncadeada(No cabeca, No cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public void inserirNoInicio(Object valor) {
        No novo = new No(valor);
        if (this.cabeca == null) {
            this.cabeca = this.cauda = novo;
        } else {
            novo.prox = this.cabeca;
            this.cabeca = novo;
        }
    }

    public void inserirNoFinal(Object valor) {
        No novo = new No(valor);
        if (this.cabeca == null) {
            this.cabeca = this.cauda = novo;
        } else {
            this.cauda.prox = novo;
            this.cauda = novo;
        }
    }

    public void imprimir() {
        No atual = this.cabeca;
        while (atual != null) {
            System.out.println(atual.carga);
            atual = atual.prox;
        }
    }

    public void removerDoInicio() {
        if (this.cabeca == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (this.cabeca.equals(this.cauda)) {
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
            this.cabeca = this.cauda = null;
        } else {
            No atual = this.cabeca;
            while (atual.prox != this.cauda) {
                atual = atual.prox;
            }
            this.cauda = atual;
            atual.prox = null;
        }

    }

    public static void main(String[] args) {

        ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.inserirNoInicio(50);
        listaEncadeada.inserirNoInicio(10);
        listaEncadeada.inserirNoFinal(21);
        listaEncadeada.inserirNoFinal(56);
        System.out.println("Antes da remoção: ");
        listaEncadeada.imprimir();
        listaEncadeada.removerDoInicio();
        listaEncadeada.removerDoFinal();
        System.out.println("Depois da remoção: ");
        listaEncadeada.imprimir();

    }

}