package com.company;

public enum Place {
    NotInTown("Не в городе"),
    InTown("В городе"),
    InTheCar( "Вылезая из машины"),
    NearTheCar("Возле машины"),
    InTheHotel("В гостинице"),
    AtShpritz( "у Шприца"),
    Zarya("с рекламным плакатом, который призывал лунных жителей покупать коврижки конфетной фабрики \"Заря\"");

    private final String Translate;
    Place(String translate) {
        Translate = translate;
    }

    @Override
    public String toString(){
        return Translate;
    }
}
