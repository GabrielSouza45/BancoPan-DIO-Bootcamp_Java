package ListasCirculares;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular();
        minhaListaCircular.add("C0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);



        minhaListaCircular.add("C1");
        minhaListaCircular.add("C2");
        minhaListaCircular.add("C3");
        minhaListaCircular.add("C4");
        minhaListaCircular.add("C5");
        minhaListaCircular.add("C6");
        minhaListaCircular.add("C7");

        System.out.println(minhaListaCircular);
//        System.out.println(minhaListaCircular.get(0));
//        System.out.println(minhaListaCircular.get(1));
//        System.out.println(minhaListaCircular.get(2));
//        System.out.println(minhaListaCircular.get(3));
//        System.out.println(minhaListaCircular.get(4));
//        System.out.println(minhaListaCircular.get(5));
//        System.out.println(minhaListaCircular.get(6));
//        System.out.println(minhaListaCircular.get(7));
//        System.out.println(minhaListaCircular.get(8));
//        System.out.println(minhaListaCircular.get(9));
//        System.out.println(minhaListaCircular.get(10));

        for (int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
