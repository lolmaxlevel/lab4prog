package com.company.characters;

import com.company.Character;
import com.company.Interfaces.Advertised;
import com.company.PriceException;
import com.company.Role;

public class Factory_owner extends Character implements Advertised {


    public Factory_owner(Role role) {
        super(role);
    }

    @Override
    public void get_popularity() {
        Rise_price(2);
        System.out.println("Владелец фабрики заработал большие деньги");
    }

    @Override
    public void Rise_price(int m) throws PriceException {
        Factory.extend_prod(m);
    }

    static class Factory{
        private static int prod = 10;
        public static void extend_prod(int x){
            prod = prod*x;
            System.out.println("Фабрика увеличила произовдство коврижек в " + x + " раза");
        }
    }
}
