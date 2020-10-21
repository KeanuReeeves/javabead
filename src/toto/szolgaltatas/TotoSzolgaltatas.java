package toto.szolgaltatas;

import toto.tarolo.Eredmeny;
import toto.tarolo.Fordulo;
import toto.tarolo.Talalat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TotoSzolgaltatas extends Fordulo
{

     public TotoSzolgaltatas()
     {
            beOlvas();
     }
     private void beOlvas()  {
         try {
             FileReader fr=new FileReader("toto.csv");
             BufferedReader br=new BufferedReader(fr);
             String sor =br.readLine();
             while (sor!=null)
             {

                 String[] st=sor.split(";");
                 this.setEv(Integer.parseInt(st[0]));
                 this.setHet(Integer.parseInt(st[1]));
                 this.setForduloAHeten(Integer.parseInt(st[2]));
                 if(st[3].equals(""))
                 {
                     if (Integer.parseInt(st[2])==1)
                     {
                         this.setDatum(LocalDate.ofYearDay(Integer.parseInt(st[0]),(Integer.parseInt(st[1])*7-6)));
                     }
                     else if(Integer.parseInt(st[2])==2)
                     {
                         this.setDatum(LocalDate.ofYearDay(Integer.parseInt(st[0]),(Integer.parseInt(st[1])*7-5)));
                     }
                 }
                 else {
                     this.setDatum(LocalDate.of(Integer.parseInt(st[3].substring(0,4)), Integer.parseInt(st[3].substring(5,7)), Integer.parseInt(st[3].substring(8,10))));
                 }
                 List<Talalat> talalatok=new ArrayList<>();
                 String[] st2=st[5].split(" ");
                 talalatok.add(new Talalat(14,Integer.parseInt(st[4]),Integer.parseInt(st2[0])));
                 st2=st[7].split(" ");
                 talalatok.add(new Talalat(13,Integer.parseInt(st[6]),Integer.parseInt(st2[0])));
                 st2=st[9].split(" ");
                 talalatok.add(new Talalat(12,Integer.parseInt(st[8]),Integer.parseInt(st2[0])));
                 st2=st[11].split(" ");
                 talalatok.add(new Talalat(11,Integer.parseInt(st[10]),Integer.parseInt(st2[0])));
                 st2=st[13].split(" ");
                 talalatok.add(new Talalat(10,Integer.parseInt(st[12]),Integer.parseInt(st2[0])));
                 this.setTalalatok(talalatok);
                 List<String> eredmeny=new ArrayList<>();
                 for (int i=14;i<st.length;i++)
                 {
                     eredmeny.add(st[i]);
                 }
                 List<Eredmeny> eredmenyek=new ArrayList<>();
                 for (String s:eredmeny)
                 {
                     switch (s)
                     {
                         case "X":eredmenyek.add(Eredmeny.X);break;
                         case "1":eredmenyek.add(Eredmeny._1);break;
                         case "2":eredmenyek.add(Eredmeny._2);break;
                     }
                 }
                 this.setEredmenyek(eredmenyek);

             }
         }
         catch (FileNotFoundException ex)
         {
             System.out.println("hiba a fájl olvasása közben");
         }
         catch (IOException ex)
         {

         }

     }


}
