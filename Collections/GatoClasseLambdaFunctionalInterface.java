import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class GatoClasseLambdaFunctionalInterface {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        meusGatos.sort(Comparator.comparing(new Function<Gato, String>() {
            @Override
            public String apply(Gato gato) {
                return gato.getNome();
            }
        }));
        System.out.println(meusGatos);
    }

}



