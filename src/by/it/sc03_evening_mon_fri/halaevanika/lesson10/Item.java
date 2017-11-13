package by.it.sc03_evening_mon_fri.halaevanika.lesson10;
/*
вспомогательный класс.
событие у аудитории(два поля: начало и конец)

Обратите внимание на метод compareTo
*/
class Item implements Comparable<Item> {
        int cost;
        int weight;

        Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo(Item o) {
            //тут может быть ваш компаратор


<<<<<<< 8d974753983f131b431fb2e273ffcad427355c48
            return 0;
=======
            if ((double) (this.cost) / this.weight > (double) (o.cost) / o.weight) {
                return -1;
            } else {
                return 1;
            }
>>>>>>> Lesson 10
        }
    }
