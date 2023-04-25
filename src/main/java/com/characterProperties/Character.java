package com.characterProperties;

import java.util.Hashtable;


public class Character {
    
    int health = 10;
    int key;


    
    
    public int getKey()
    {
        return key;
    }

    Hashtable<String,String> abilities = new Hashtable<String,String>();

    public void initiateAbilities()
    {
        abilities.put("Attack 1", "Light Attack");
        abilities.put("Attack 2", "Heavy Attack");
        abilities.put("Attack 3", "Special Attack");
        abilities.put("Defense 1", "Block");
    }
}
