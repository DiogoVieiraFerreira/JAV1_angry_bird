package com.mygdx.game.models;

import com.badlogic.gdx.math.Vector2;

public abstract class TextualObject extends PhysicalObject {
    protected SemanticWord word;

    public TextualObject(String picname, Vector2 position, float width, float height) {
        super( picname, position, width, height);
        setOrigin(position.x, position.y);
    }

    public void setWord(SemanticWord word) {
        this.word = word;
    }

    public SemanticWord getWord() {
        return word;
    }
}
