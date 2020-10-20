package toto.tarolo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fordulo
{
    int ev,het,forduloAHeten;
    LocalDate datum;
    List<Talalat>talalatok;
    List<Eredmeny>eredmenyek;
    public Fordulo()
    {

    }
    public List<Talalat> getTalalatok()
    {
        talalatok=new ArrayList<>();
        return talalatok;
    }
    public void setTalalatok(List<Talalat> talalatok)
    {
        this.talalatok=talalatok;
    }
    public int getEv() {
        return ev;
    }

    public List<Eredmeny> getEredmenyek() {
        return eredmenyek;
    }


    public void setEredmenyek(List<Eredmeny> eredmenyek) {
        this.eredmenyek = eredmenyek;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHet() {
        return het;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public int getForduloAHeten() {
        return forduloAHeten;
    }

    public void setForduloAHeten(int forduloAHeten) {
        this.forduloAHeten = forduloAHeten;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
