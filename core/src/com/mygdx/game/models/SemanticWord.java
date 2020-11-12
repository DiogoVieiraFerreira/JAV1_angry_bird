package com.mygdx.game.models;

import com.mygdx.game.enums.Language;

import java.util.HashMap;

public class SemanticWord {
    HashMap<Language, String> values;
    public boolean allocated; // pig as the word?
    public boolean found; // word already founded?

    public  SemanticWord()
    {
        values = new HashMap<>();
        allocated = false;
        found = false;
    }

    public void addTranslation (Language language, String value ){
        values.put(language, value);
    }

    public String getValue(Language language) {
        return values.get(language);
    }
}
