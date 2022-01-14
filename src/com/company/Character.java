package com.company;

import java.util.Objects;

public abstract class Character {
    private final Role role;
    public Character(Role role){
        this.role = role;
    }
    public Role GetRole(){return this.role;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character2 = (Character) o;
        return role == character2.GetRole();
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.role);
    }
    @Override
    public String toString(){
        return "Character +" + this.role.toString();
    }
}
