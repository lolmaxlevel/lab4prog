package com.company.characters;

import com.company.Character;
import com.company.Role;

public class Haps extends Character {
    public Haps(Role role) {
        super(role);
    }

    public boolean CheckIfEveryoneIsListening() {
        if (!Viewers.IsListeningHaps() && !Correspondents.IsListeningHaps())
            System.out.println(this.GetRole() + " замечает что его никто не слушает");
        else
            System.out.println(this.GetRole() + " замечает что его все таки кто то слушает");
        return((!Viewers.IsListeningHaps() && !Correspondents.IsListeningHaps()));
    }
    public void blink(Policeman x0, Staff x1, Operator x2, Correspondents x3, Viewers x4){
        System.out.println(this.GetRole() + " подмигивает полицейским");
        x0.StartFight(x1, x2, x3, x4);
    }
    }
