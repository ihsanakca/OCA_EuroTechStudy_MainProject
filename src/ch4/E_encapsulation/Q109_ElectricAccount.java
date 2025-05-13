package ch4.E_encapsulation;

public class Q109_ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;
    //line1
    public void addKWh(double kWh){
        this.kWh+=kWh;
        this.bill=this.kWh*this.rate;}

}
