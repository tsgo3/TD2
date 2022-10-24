import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Somme<Integer> ajoutentier = (a, b) -> a+b;
        Somme<Double> ajoutdouble = (a, b) -> a + b;
        Somme<Long> ajoutlong = (a, b) -> a+b;
        Somme<String> ajoutstring = (a, b) -> a+b;

        Somme<Integer> ajoutentier2 = Main::somme;

        System.out.println(ajoutentier.somme(9,8));
        System.out.println(ajoutdouble.somme(123.5,2.45));
        System.out.println(ajoutlong.somme(12l,35436l));
        System.out.println(ajoutstring.somme("alors","non"));
        System.out.println(ajoutentier2.somme(45,36));

        Paire<Integer, Double> a = new Paire<>(150, 95.0);
        Paire<Integer, Double> b = new Paire<>(300, 95.0);
        Paire<Integer, Double> c = new Paire<>(95, 95.0);
        Paire<Integer, Double> d = new Paire<>(150, 300.0);

        System.out.println(a.ttp);
        System.out.println(a.ttg);
        System.out.println(a.ti);
        System.out.println(a.tc);
        System.out.println(a.pl);
        System.out.println(a.pc);
        System.out.println(a.aa);

        System.out.println(b.ttp);
        System.out.println(b.ttg);
        System.out.println(b.ti);
        System.out.println(b.tc);
        System.out.println(b.pl);
        System.out.println(b.pc);
        System.out.println(b.aa);


        System.out.println(c.ttp);
        System.out.println(c.ttg);
        System.out.println(c.ti);
        System.out.println(c.tc);
        System.out.println(c.pl);
        System.out.println(c.pc);
        System.out.println(c.aa);


        System.out.println(d.ttg);
        System.out.println(d.ti);
        System.out.println(d.tc);
        System.out.println(d.pl);
        System.out.println(d.pc);
        System.out.println(d.aa);



    }
    public static int somme(int a, int b){
        return a + b;
    }
    }