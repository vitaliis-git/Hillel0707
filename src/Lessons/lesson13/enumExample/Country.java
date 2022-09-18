package Lessons.lesson13.enumExample;

public enum Country {
    CANADA("CAD"),
    POLAND("PLN"),
    GERMANY("EUR"),
    ZIMBABVE;

    String currency;

    Country(){

    }

    Country(String currency){
        this.currency = currency;
    }

}
