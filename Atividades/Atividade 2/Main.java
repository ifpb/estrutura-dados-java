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

    private final static String COMMA_DELIMITER = ";";

    private static List<List<String>> records;

    /** 
    Lê cada linha do arquivo CSV
     */
    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

    public static List<Integer> buscaSequencial(String chave) {
        List<Integer> resultados = new ArrayList();
        // Começa em 1 para excluir o cabeçalho
        for (int i=1; i < records.size(); i++) {
            if (records.get(i).get(1).toLowerCase().contains(chave.toLowerCase())) {
                resultados.add(i);
                // return i; //item encontrado
            } else if (records.get(i).get(1).toLowerCase().compareTo(chave.toLowerCase()) > 0) {
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

        // Carrega CSV na lista de records
        records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("./dns_br.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
        
        // Ordena lista por ordem alfabetica
        Collections.sort(records, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(1).toLowerCase().compareTo(o2.get(1).toLowerCase());
            }
        });

        List<Integer> resultados = buscaSequencial("TELEFONICA");
        if (resultados.size() > 0) {
            System.out.println("Registro encontrado! ");
            for(int resultado : resultados) {
                System.out.println(records.get(resultado).get(1) + "=" + records.get(resultado).get(0));
            }
        }

        resultados = buscaSequencial("claro");
        if (resultados.size() > 0) {
            System.out.println("Registro encontrado! ");
            for(int resultado : resultados) {
                System.out.println(records.get(resultado).get(1) + "=" + records.get(resultado).get(0));
            }
        }


    }


}