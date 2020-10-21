package toto;

import toto.szolgaltatas.TotoSzolgaltatas;

public class alk {
    private static void LegnagyobbNyeremeny(TotoSzolgaltatas sz) {
        int max=0;
        for (var item:sz.getTalalatok())
        {
            if (item.getNyeremeny()>max)
            {
                max=item.getNyeremeny();
            }
        }
        System.out.println(max+" Ft volt a legnagyobb nyeremény.");
    }
    public static void main(String[] args) {
        TotoSzolgaltatas szolgaltatas=new TotoSzolgaltatas();
        LegnagyobbNyeremeny(szolgaltatas);
    }
}
