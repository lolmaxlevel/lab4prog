package com.company;

import com.company.Interfaces.Advertised;
import com.company.characters.*;
import com.company.entity.newspaper;

public class Main {

    public static void main(String[] args) throws PriceException {
        Haps haps = new Haps(Role.HAPS);
        Correspondents correspondents = new Correspondents(Role.CORRESPONDENTS);
        Operator operator = new Operator(Role.OPERATOR);
        Policeman policeman = new Policeman(Role.POLICEMAN);
        Staff staff = new Staff(Role.STAFF);
        Viewers viewers = new Viewers(Role.VIEWERS);
        Factory_owner owner = new Factory_owner(Role.VIEWERS);
        Dunno dunno = new Dunno(Role.Dunno);
        newspaper newspaper = new newspaper();
        Advertised shpritz = new Advertised(){
            int price = 4;
            @Override
            public void get_popularity() {
                System.out.println("Все узнали про услуги Шприца");
            }

            @Override
            public void Rise_price(int m) throws PriceException {
                if (m > 0)
                {
                    price = price*m;
                }else {
                    throw new PriceException("По сюжету Шприц может только увеличивать цену");
                }
                System.out.println("Шприц увеличил цену на свои услуги в "+ m + " раза");
                System.out.println("Денежки потекли рекой");
            }
            };

        if (haps.CheckIfEveryoneIsListening()){
            haps.blink(policeman, staff, operator, correspondents, viewers);
        };
        dunno.moveto(Place.InTown);
        newspaper.postanarticle();
        newspaper.takephoto(dunno.place);
        dunno.moveto(Place.InTheCar);
        newspaper.takephoto(dunno.place);
        dunno.moveto(Place.NearTheCar);
        newspaper.takephoto(dunno.place);
        dunno.moveto(Place.InTheHotel);
        newspaper.takephoto(dunno.place);
        dunno.moveto(Place.AtShpritz);
        newspaper.takephoto(dunno.place);
        dunno.moveto(Place.Zarya);
        newspaper.takephoto(dunno.place);
        newspaper.postphotos();
        owner.get_popularity();
        shpritz.get_popularity();
        shpritz.Rise_price(2);
    }
}
