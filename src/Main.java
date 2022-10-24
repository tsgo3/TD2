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

        ToString<List<String>> convert    = (a -> {
            String c = "";
            for (String b : a){
                c += a.toString();
            }
            return c;
        });
    }
    public static int somme(int a, int b){
        return a + b;
    }
    }