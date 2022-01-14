package com.company.characters;

import com.company.Character;
import com.company.Interfaces.NotHaps;
import com.company.Role;

public class Staff extends Character implements NotHaps {
    public static boolean listning = false;
    public Staff(Role role) {
        super(role);
    }

    public void takeequipment() {
        System.out.println(this.GetRole() + " вытаскивают за дверь свои трансформаторы, реостаты, прожекторы и прочую аппаратуру");
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
        listning = false;
    }
}
