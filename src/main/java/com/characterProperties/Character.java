package com.characterProperties;

import java.util.Hashtable;


public class Character {
    
    public int health = 10;
    int key;


    
    
    public int getKey()
    {
        return key;
    }

    Hashtable<String,Integer> abilities = new Hashtable<String,Integer>();

    public void initiateAbilities()
    {
        abilities.put("Attack 1", 2);
        abilities.put("Attack 2", 3);
        abilities.put("Attack 3", 2);
        abilities.put("Defense 1", 1);
    }
}
