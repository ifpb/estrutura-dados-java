/***
Dada uma lista encadeada que armazena números inteiros escreva uma função que transforma a lista dada em duas listas encadeadas: 
a primeira contendo os elementos cujo conteúdo é par e a segunda contendo os elementos com conteúdos ímpares. 
Sua função deve manipular somente os apontadores e não o conteúdo das células
 */
public class Q2 {

    public static void separarImparesPares(ListaEncadeada l1) {
        ListaEncadeada pares = new ListaEncadeada();
        ListaEncadeada impares = new ListaEncadeada();

        No atual = l1.cabeca;
        while(atual != null) {
            if ((int)(atual.carga) % 2 == 0) {
                pares.inserirNoFinal(atual);                
            } else {
                impares.inserirNoFinal(atual);
            }
            atual = atual.prox;
        }

        System.out.println("Números pares:");
        pares.imprimir();
        System.out.println("----");
        System.out.println("Números ímpares:");
        impares.imprimir();
        System.out.println("----");


    }
   
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNoInicio(50);
        lista.inserirNoInicio(10);
        lista.inserirNoFinal(21);
        lista.inserirNoFinal(13);
        lista.imprimir();
        System.out.println("----");

        Q2.separarImparesPares(lista);

    }


}