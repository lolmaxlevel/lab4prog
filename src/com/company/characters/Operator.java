package com.company.characters;

import com.company.Character;
import com.company.Interfaces.CanLeave;
import com.company.Role;

public class Operator extends Character implements CanLeave {
    public Operator(Role role) {
        super(role);
    }

    @Override
    public void leave() {
        System.out.println(this.GetRole() + " выехал верхом на телекамере");
    }
}
