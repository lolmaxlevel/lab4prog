package com.company.entity;

import com.company.Place;
import com.company.characters.Factory_owner;

public class newspaper {
    static String name = "Газета";
    public void postanarticle() {
        System.out.println("во всех газетах появилось сообщение о прибытии в лунный город Давилон космического путешественника");
    }

    ;

    public void takephoto(Place place) {
        try {
            System.out.println("фотограф сделал фотографию незнайки " + place.toString());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Произошла ошибка перевода");
        }
    }

    ;

    public void takephotowithzarya() {
        System.out.println("фотограф сфотографирофал незнайку с с рекламным плакатом, который призывал лунных жителей покупать коврижки конфетной фабрики \"Заря\"");
    }

    ;
    public void postphotos(){
        System.out.println(name + " напечатала все сделанные фотографии");
    }
}

