import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class liitmine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("liitmine.txt")
        );

        PrintWriter pw = new PrintWriter(
                new FileWriter("liitmise_tulemus.txt")
        );

        String rida = br.readLine();
        System.out.println("Liidame numbrid: " + rida);
        pw.println("Liitsime numbrid: " + rida);
        pw.println();

        List<String> tykeldus = Arrays.asList(rida.split(" "));



        // failist loetud stringid numbriteks
        List<Integer> numbrid = new ArrayList<Integer>();
        for (int i = 0; i < tykeldus.size(); i++) {
            numbrid.add(Integer.valueOf(tykeldus.get(i)));
        }


        // numbrite liitmine
        int sum = 0;
        int sumDigits = 0;
        for (int i = 0; i < numbrid.size(); i++) {
            System.out.println(numbrid.get(i));
            sum += numbrid.get(i);

            pw.println(numbrid.get(i));
        }


        System.out.println("---------");
        System.out.println(sum);
        pw.println("-------");
        pw.println(sum);

        pw.close();



    }


}
