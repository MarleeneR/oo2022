import jdk.internal.icu.text.UnicodeSet;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class l6put2hed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("tekst.txt"));


       while (true) {
           String rida = br.readLine();

           //System.out.println(tykeldus);
           if (rida == null) {
               break;
           }
           if (rida.length() == 0) {
               continue;
           }

           rida = rida.replace(".", "");
           rida = rida.replace(",", "");
           rida = rida.replace("-", "");
           rida = rida.replace("?", "");
           rida = rida.replace("!", "");
           rida = rida.replace("\n", "");
           rida = rida.replace(":", "");
           List<String> tykeldus = Arrays.asList(rida.split(" "));
           //tykeldus.add(String.valueOf(rida.split(" ")));



           //List<String> s6nad = null;
        /*for (int i = 0; i < tykeldus.size(); i++) {
            if (tykeldus.get(i).length() > 1) {
                List<String> s6nad = Collections.singletonList(tykeldus.get(i));
                System.out.println(tykeldus.get(i).length());
                System.out.println(s6nad);
            }

        }*/
           //System.out.println(s6nad);


           List<String> l6put2hed = new ArrayList<String>();
           for (int i = 0; i < tykeldus.size(); i++) {
               int length = tykeldus.get(i).length();
               //System.out.println(length);
               //System.out.println(tykeldus.get(i));
               String viimane_t2ht = String.valueOf(tykeldus.get(i).charAt(length - 1));
               System.out.println(viimane_t2ht);
               l6put2hed.add(viimane_t2ht);

           }
           System.out.println(l6put2hed);

           for (int i = 0; i < tykeldus.size(); i++) {
               //System.out.println(l6put2hed.get(i));
               int length = tykeldus.get(i).length();
               PrintWriter pw = new PrintWriter(
                       new FileWriter( tykeldus.get(i).charAt(length - 1) + ".txt")
               );
               pw.println(tykeldus.get(i));
           }




           TreeMap<String,Integer> m1 = new TreeMap<>();
           for(int i : tykeldus)
           {
               if(m1.containsKey(i))
               {m1.put(i,m1.get(i)+1);}
               else  {m1.put(i,1);}
           };

           ArrayList<Integer> b = new ArrayList<>();
           m1.entrySet().stream()
                   .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).forEach(e -> {
                       for(int i=0;i<e.getValue();i++)
                           b.add(e.getKey());
                   });

           Arrays.stream(a).forEach(i -> System.out.print(i+ " "));
           System.out.println();
           b.stream().forEach(i -> System.out.print(i+ " "));

       }


           System.out.println(tykeldus);
       }

    }
}
