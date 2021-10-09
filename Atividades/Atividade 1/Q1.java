/***
Implemente uma lista encadeada seguindo os 
exemplos passados anteriormente (criando a classes Nó e ListaEncadeada) e faça um programa que junte duas listas, dando origem a uma única lista com a terceira apontando seu primeiro elemento.
 */
public class Q1 {

    public static ListaEncadeada juntaListas(ListaEncadeada l1, ListaEncadeada l2) {
        l1.cauda.prox = l2.cabeca;
        return l1;
    }
   
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNoInicio(50);
        lista.inserirNoInicio(10);
        lista.inserirNoFinal(21);
        lista.inserirNoFinal(56);
        lista.imprimir();
        System.out.println("----");

        ListaEncadeada lista2 = new ListaEncadeada();
        lista2.inserirNoInicio(55);
        lista2.inserirNoInicio(15);
        lista2.inserirNoFinal(25);
        lista2.inserirNoFinal(51);
        lista2.imprimir();

        System.out.println("----");

        ListaEncadeada juncao = Q1.juntaListas(lista, lista2);
        juncao.imprimir();

    }


}