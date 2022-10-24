import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Paire<T,U> {
    public T fst;
    public U snd;

    public Paire(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", fst.toString(), snd.toString());
    }

    Predicate<Paire<Integer, Double>> ttp = t -> t.fst < 100;
    Predicate<Paire<Integer, Double>> ttg = t -> t.fst > 200;
    Predicate<Paire<Integer, Double>> ti = ttp.or(ttg);
    Predicate<Paire<Integer, Double>> tc = Predicate.not(ti);
    Predicate<Paire<Integer, Double>> pl = t -> t.snd > 150.0;
    Predicate<Paire<Integer, Double>> pc = Predicate.not(pl);

    Predicate<Paire<Integer, Double>> aa = pc.and(tc);

    List<T> fp(List<Predicate<T>> ps, List<T> es) {
        Predicate<T> b = c -> true;
        List<T> a = new ArrayList<>();

        for (Predicate<T> c:ps) {
            b = b.and(c);
        }

        for(T e:es){
            if(b.test(e)){
                a.add(e);
            }
        }
        return a;
    }
}
