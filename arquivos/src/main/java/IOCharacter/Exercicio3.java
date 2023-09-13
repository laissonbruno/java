package IOCharacter;

import java.io.*;

public class Exercicio3 {
    public static void copiarArquivo() throws IOException {
        File f = new File("D:\\Desenvolvimento\\Cursos\\Dio\\Cursos\\Formação Java Developer\\Parte 1\\arquivos\\recomendacoes.txt");
        String nameFile = f.getName();

//        Reader r = new FileReader(nameFile);
//        BufferedReader br = new BufferedReader(r);

        BufferedReader br = new BufferedReader(new FileReader(nameFile));
        String line = br.readLine();
        String nameFileCopy = nameFile.substring(0, nameFile.indexOf(".")).concat("-copy.txt");

        File fcopy = new File(nameFileCopy);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while(!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho '%d' bytes.\n", fcopy.getName(), fcopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        addInfoArquivo(fcopy.getName());

        pw.printf("Ok! Tudo certo. Tamanho do arquivo '%d' bytes.", fcopy.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void addInfoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
