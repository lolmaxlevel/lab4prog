package com.company.characters;

import com.company.Character;
import com.company.Place;
import com.company.Role;

import static com.company.Place.NotInTown;


public class Dunno extends Character {

    public Dunno(Role role) {
        super(role);
    }
    public Place place = NotInTown;

    public void moveto(Place place){
        this.place = place;
    }
}
