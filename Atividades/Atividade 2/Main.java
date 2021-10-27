import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class Main {

    private final static String SEPARADOR = ";";

    private static List<List<String>> registros;

    /** 
    Lê cada linha do arquivo CSV
     */
    private static List<String> recuperaLinhaDoArquivo(String line) {
        List<String> linhas = new ArrayList<String>();
        try (Scanner scanner = new Scanner(line)) {
            scanner.useDelimiter(SEPARADOR);
            while (scanner.hasNext()) {
                linhas.add(scanner.next());
            }
        }
        return linhas;
    }

    /** 
    Executa o método de busca sequencial 
    @param chave - palavra a ser usada como entrada da busca
    @return lista com a posição de cada elemento encontrado 
            - caso nenhum seja encontrado, será retornada uma lista vazia.
     */
    public static List<Integer> buscaSequencial(String chave) {
        List<Integer> resultados = new ArrayList();
        // Começa em 1 para excluir o cabeçalho
        for (int i=1; i < registros.size(); i++) {
            // o método contains serve para verificar se o item passado por parâmetro é parte da palavra em questão
            // o método toLowerCase serve para converter todas as letras da palavra em minúsculas
            // O uso do toLowerCase é necessário em ambos os lados para ignorar diferenças entre maiúsculas e minusculas na comparação
            if (registros.get(i).get(1).toLowerCase().contains(chave.toLowerCase())) {
                resultados.add(i);
                // return i; //item encontrado
            } else if (registros.get(i).get(1).toLowerCase().compareTo(chave.toLowerCase()) > 0) {
                return resultados; //item não encontrado - retorna estado atual
            }
        }
        
        return resultados;
    }

    public static List<Integer> buscaSequencialRecursiva(String chave) {
        List<Integer> resultados = new ArrayList();
        // TODO - implementar
        return resultados;
    }

    public static List<Integer> buscaBinaria(String chave) {
        List<Integer> resultados = new ArrayList();
        // TODO - implementar
        return resultados;
    }

    public static List<Integer> buscaBinariaRecursiva(String chave) {
        List<Integer> resultados = new ArrayList();
        // TODO - implementar
        return resultados;
    }
    

    public static void main(String[] args) throws Exception {

        // Carrega linhas do arquivo CSV 
        registros = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("./dns_br.csv"));) {
            while (scanner.hasNextLine()) {
                registros.add(recuperaLinhaDoArquivo(scanner.nextLine()));
            }
        }
        
        // Ordena registros por ordem alfabetica
        // No arquivo CSV temos o seguinte formato: "200.167.191.114;CLARO S.A."
        //   em que a posição 0 é o IP e a posição 1 é o nome 
        // A lista contendo o que foi carregado do arquivo é então ordenada alfabeticamente pelo nome do servidor
        Collections.sort(registros, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(1).toLowerCase().compareTo(o2.get(1).toLowerCase());
            }
        });

        /*
            O método de busca retorna uma lista contendo os índices (posições) dos elementos encontrados
            Para acessar cada elemento encontrado, basta percorrer cada linha obtida como resultado e acessar a posição correspondente
                ex.: linhas.get(resultado)
         */
        List<Integer> resultados = buscaSequencial("CENTROSULNET");
        if (resultados.size() > 0) {
            System.out.println("Registro encontrado! ");
            for(int resultado : resultados) {
                System.out.println(registros.get(resultado).get(1) + "=" + registros.get(resultado).get(0));
            }
        }

        resultados = buscaSequencial("claro");
        if (resultados.size() > 0) {
            System.out.println("Registro encontrado! ");
            for(int resultado : resultados) {
                System.out.println(registros.get(resultado).get(1) + "=" + registros.get(resultado).get(0));
            }
        }


    }


}