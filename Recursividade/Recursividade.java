public class Recursividade {

    // Exemplo 1: imprimir recursivamente todos os primeiros cinco números inteiros 
    public void imprimirNumeroRecursivo(int num) {
        if (num < 5) {
            System.out.println(num);
            imprimirNumeroRecursivo(num + 1);
        }
    }

    // Exemplo 2: imprimir recursivamente todos os primeiros cinco números inteiros (outra versão)
    public void imprimirNumeroRecursivo2(int num) {
        if (num < 5) {
            imprimirNumeroRecursivo(num + 1);
            System.out.println(num);
        }
    }

    // Exemplo 3: somar todos os números inteiros entre `m` e `n`     
    public int soma(int m, int n) {
        if (m == n) 
            return m;
        else
            return m+soma(m+1, n);
    }

    // Exemplo 4: Fibonacci recursivo
    public int fibRec(int n) {
        if (n <= 1)
            return n;
        else
            return fibRec(n-1) + fibRec(n-2);
    }

    // Exemplo 5: Fibonacci iterativo
    public int fibIte(int n) {
        int fib = 1;
        int i = 1;
        int anterior = 0;
        while (i < n) {
            int temp = fib;
            fib = fib + anterior;
            anterior = temp;
            i++;
        }
        return fib;
    }

    public static void main(String[] args) {

        Recursividade r = new Recursividade();
        System.out.println("Exemplo 1: imprimir recursivamente todos os primeiros cinco números inteiros: ");
        r.imprimirNumeroRecursivo(0);

        System.out.println("Exemplo 2: imprimir recursivamente todos os primeiros cinco números inteiros (outra versão): ");
        r.imprimirNumeroRecursivo2(0);

        System.out.println("Exemplo 3: somar todos os números inteiros entre `m` e `n`:");
        System.out.println(r.soma(1, 5));

        System.out.println("Exemplo 4: Fibonacci recursivo");
        System.out.println(r.fibRec(5));

        System.out.println("Exemplo 5: Fibonacci iterativo");
        System.out.println(r.fibIte(5));
    }


}