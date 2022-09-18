package Lessons.mentorlessons.lesson1;

/*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */

public class Animals2 {

    public static void main(String[] args) {

        int ship = 4;
        for (int i = 1; i < 5; i++) {
            String oneDuck = "гуску";
            String oneShip = "вівцю";
            if (i > 1) {
                oneDuck = "гуски";
            }
            if (ship > 1) {
                oneShip = "вівці";
            }
            System.out.println("У хатинці маємо " + i + " " + oneDuck + " " + ship-- + " " + oneShip);

            }
        }
    }
