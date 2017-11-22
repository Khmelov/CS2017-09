package by.it.sc02_morning.kurgan.lesson14;

public class Maz extends Car {
    Maz(int speed){
        super((speed <=80)? speed:80);
    }



    @Override
    void beep() {
        System.out.println(this+" сигналит: У-у-у-у!");
    }

    @Override
    public String toString (){
        return "Maz";
    }
}