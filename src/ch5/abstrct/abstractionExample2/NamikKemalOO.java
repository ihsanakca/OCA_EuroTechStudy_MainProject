package ch5.abstrct.abstractionExample2;

public class NamikKemalOO extends School{

    private NamikKemalOO(){
      super("name");
    }

    public  String dersProgrami(){
        return "ders programı";
    }

    @Override
    public int ogrenciSayisi() {
        return 202;
    }

    public void tanitma(){
        System.out.println(mudur);
    }

    public static void main(String[] args) {
        NamikKemalOO okul = new NamikKemalOO();

    }

    public static void dersKurallari(){
        System.out.println("Temizlik kuralları");
    }


}
