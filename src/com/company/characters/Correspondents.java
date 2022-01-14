package com.company.characters;

import com.company.Character;
import com.company.Interfaces.CanLeave;
import com.company.Interfaces.NotHaps;
import com.company.Role;

public class Correspondents extends Character implements NotHaps, CanLeave {
    public static boolean listning = false;
    public Correspondents(Role role) {
        super(role);
    }

    @Override
    public void leave() {
        System.out.println(this.GetRole() + " убегают из комнаты");
        this.dodgetheblow();
    }
    public void dodgetheblow(){
        System.out.println(this.GetRole() + " старательно уворачиваются от ударов");
    }
    public static boolean IsListeningHaps() {
        return listning;
    }

    @Override
    public void ListeningHaps() {
        listning = true;
    }

    @Override
    public void NotListeningHaps() {
        listning = true;
    }
}
