package Lessons.mentorlessons.lesson1;

/*
в) Порахувати кількість ніг у кожного із наборів із розрахунку, що гуска має 2 ноги, а вівця чотири
Доповнити висновок на консоль:
“В хатинці є 1 гуска та 4 вівці. Кількість ніг = 18”
     “В хатинці є 2 гуски та 3 вівці. Кількість ніг = 16”
*/

public class Animals3 {

    public static void main(String[] args) {

        int ship = 4;
        int duckLeg = 2;
        int shipLeg = 4;
        for (int i = 1; i < 5; i++) {
            String oneDuck = "гуску";
            String oneShip = "вівцю";
            if (i > 1) {
                oneDuck = "гуски";
            }
            if (ship > 1) {
                oneShip = "вівці";
            }
            System.out.println("У хатинці маємо " + i + " " + oneDuck + " " + ship + " " + oneShip + ". Кількість ніг = " + (duckLeg * i) + (shipLeg * ship));
            ship--;
        }

        }
    }
