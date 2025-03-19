package Lessons.lesson13.enumExample;

public enum Country {
    CANADA("CAD"),
    POLAND("PLN"),
    GERMANY("EUR"),
    ZIMBABVE;

    String currency;

    Country(){ // неявний конструктор для Zimbabve
    }
    Country(String currency){
        this.currency = currency;
    } // явний конструктор для Canada, Poland, Germany

}
