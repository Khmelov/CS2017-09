package by.it.sc02_morning.safronov.lesson14;

    public class Mercedes extends Car{
        public Mercedes (int speed) {
            super((speed>200)?200:speed);
        }

        @Override   public void beep(){
            System.out.println(this+" сигналит: Фа-фа!");
        }

        @Override   public String toString(){
            return "Mercedes";
        }

    }


