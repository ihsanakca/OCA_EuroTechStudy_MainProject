package ch5.abstrct.abstractionExample;

public abstract class School {

    public static String name;

    public abstract void dersProgrami();
    protected abstract int agrenciSayisi();
    public final void temizlik(){
        System.out.println("temizlik kuralları");
    }

    public School(){
        System.out.println("İlçe Milli Eğitim");
    };
}
