package com.company.characters;

import com.company.Character;
import com.company.Interfaces.NotHaps;
import com.company.Role;

public class Viewers extends Character implements NotHaps {
    public static boolean listening = false;
    public Viewers(Role role) {
        super(role);
    }

    public static boolean IsListeningHaps() {
        return listening;
    }

    @Override
    public void ListeningHaps() {
        listening = true;
    }

    @Override
    public void NotListeningHaps() {
        listening = false;
    }
    public void Trigger(){
        System.out.println(GetRole() + " наблюдают побоище");
    }
}
