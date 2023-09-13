package IOCharacter;

import java.io.*;

public class Exercicio1 {
    public static void tecprint() throws IOException {
//        InputStream is = System.in;
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
//        String line = br.readLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

//        OutputStream os = System.out;
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!line.isEmpty());
        bw.flush();

        br.close();
        bw.close();


    }

    public static void main(String[] args) throws IOException {
        tecprint();
    }
}
