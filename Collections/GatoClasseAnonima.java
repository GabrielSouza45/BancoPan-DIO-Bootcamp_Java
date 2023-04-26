import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GatoClasseAnonima {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        meusGatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        });
        System.out.println(meusGatos);
    }

}



