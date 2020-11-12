package com.mygdx.game.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;

import java.util.ArrayList;

public class Vocabulary {
    String vocName;
    ArrayList<SemanticWord> words;

    public Vocabulary(String vocName){
        this.vocName = vocName;
        words = new ArrayList<>();
    }

    public ArrayList<SemanticWord> getWords() {
        Gdx.app.log("PIGGY", String.valueOf(words.size()));
        return words;
    }

    public SemanticWord findWord(SemanticWord wordToFind)
    {
        for (SemanticWord word : words)
            if (word == wordToFind)
                return word;
        return null;
    }

    public void  addSemanticWord(SemanticWord word){
        words.add(word);
    }
    public  SemanticWord pickRandomWord(){
        return  words.get(MathUtils.random(0,words.size()-1));
    }
    public SemanticWord pickUnFoundRandomWord(){
        SemanticWord word;
        do {
            word = words.get(MathUtils.random(0,words.size()-1));
        } while (word.found);
        return word;
    }
    public int countUnFoundWords(){
        int i = 0;
        for (SemanticWord word : words) {
            if(word.found == false)
                i++;
        }
        return i;
    }

    public void unAllocateWord() {
        for(SemanticWord w: words){
            w.allocated = false;
        }
    }
}
