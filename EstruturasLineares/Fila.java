public class Fila extends ListaEncadeada {

    public void inserir(Object valor) {
        this.inserirNoFinal(valor);
    }

    public void remover() {
        this.removerDoInicio();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.inserir(50);
        fila.inserir(20);
        fila.inserir(10);
        fila.inserir(40);
        fila.remover();
        fila.remover();
        fila.imprimir();
    }

}