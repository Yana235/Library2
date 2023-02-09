import generic.GenericList;

public class TestMain {
    public static void main(String[]args){
        Books b = new Books("Yan ","Robin Hood ",4534554 ,23 ,
                 1," Sonrisas ",24 , Color.BLANCYNEGRO);

        GenericList lista = new GenericList();

        lista.add(b);
        lista.search(b);
        System.out.println(b);

    }
}
