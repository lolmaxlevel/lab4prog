package com.company.characters;

import com.company.Character;
import com.company.Role;

public class Policeman extends Character {

    public Policeman(Role role) {
        super(role);
    }
    public void StartFight(Staff x1, Operator x2, Correspondents x3, Viewers x4){
        System.out.println(this.GetRole() + " начинают работать своими дубинками");
        x4.Trigger();
        x1.takeequipment();
        x2.leave();
        x3.leave();
    }
}
