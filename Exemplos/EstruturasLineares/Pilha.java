public class Pilha extends ListaEncadeada {

    public void inserir(Object valor) {
        this.inserirNoInicio(valor);
    }

    public void remover() {
        this.removerDoInicio();
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.inserir(50);
        pilha.inserir(10);
        pilha.inserir(40);
        pilha.remover();
        pilha.imprimir();
    }

}