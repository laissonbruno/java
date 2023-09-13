package IOCharacter;

import java.io.*;
import java.util.Scanner;

public class Exercicio2 {
    public static void readTecDoc() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = sc.nextLine();
        } while(!(line.equalsIgnoreCase("fim")));
        bw.flush();

        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());

        pw.close();
        sc.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        readTecDoc();
    }
}
