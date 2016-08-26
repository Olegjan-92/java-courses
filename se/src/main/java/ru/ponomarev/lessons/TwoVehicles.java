package ru.ponomarev.lessons;

/**
 * Created by oleg on 25.07.16.
 */
class Vehicle {
    int passagir; // колич пассажиров
    int volume; // объем бака
    int kpl; // километры к литрам
    Vehicle(int p, int v, int k){
        passagir = p;
        volume = v;
        kpl = k;
    }
    int range(){
       return volume*kpl;
    }
    double fuelneeded(int kilom){
        return (double) kilom/kpl;
    }
}
class AddMeth{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2,14,12);
        double liters;
        int dist = 3242;
        liters = minivan.fuelneeded(dist);
        System.out.println("Для того чтобы прохать "+dist+" километров, минивену потребуется "+liters+" литров топлива");
       // minivan.range();
        liters = sportcar.fuelneeded(dist);
        System.out.println("Для того чтобы прохать "+dist+" километров, минивену потребуется "+liters+" литров топлива");
        //sportcar.range();
    }
}
