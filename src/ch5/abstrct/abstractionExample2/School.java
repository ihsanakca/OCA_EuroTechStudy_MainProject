package ch5.abstrct.abstractionExample2;

public abstract class School {

    public School(String name){
        System.out.println("Adımı bileceksiniz");
    }



    public final String mudur = "Aslı Kaymaz";

    public abstract String dersProgrami();
    public abstract int ogrenciSayisi();

    public void temizlikKurallari(){
        System.out.println("Temizlik kuralları");
    }

    public static void dersKurallari(){
        System.out.println("Temizlik kuralları");
    }

}
