package com.mygdx.game.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.game.providers.VocabularyProvider;

import java.util.ArrayList;

public class VocabularyBoard {
    private float x;
    private float y;
    private float minY;
    private float maxY;
    private float actualScrollY;
    private float maxWidthEnglishWord;
    private float maxWidthFrenchWord;
    private Vocabulary vocabulary;
    private ArrayList<Label> wordsToFind;
    private ArrayList<Label> wordsTranslated;

    public VocabularyBoard(Vocabulary vocabulary, float x, float y, float maxY) {
        maxWidthFrenchWord = maxWidthEnglishWord = 0;
        this.vocabulary = vocabulary;
        wordsToFind = new ArrayList<>();
        wordsTranslated = new ArrayList<>();
        this.x = x;
        this.minY = this.y = y;
        this.maxY = actualScrollY = maxY;
        createLabels();
        placeLabels(actualScrollY);
    }

    private void createLabels() {
        float width;
        int i = 0;
        for (SemanticWord w : vocabulary.getSemanticWords()) {
            wordsToFind.add(new Label(w.getValue(VocabularyProvider.getInstance().getLanguageWantToLearn()), Color.BLACK));
            wordsTranslated.add(new Label(w.found ? w.getValue(VocabularyProvider.getInstance().getLanguage1()) : "", Color.BLACK));
//            wordsTranslated.add(new Label(w.getValue(VocabularyProvider.getLanguage1()) , Color.BLACK));

            Label englishWord = wordsToFind.get(wordsToFind.size() - 1);
            width = englishWord.getWidth() + 30;
            maxWidthEnglishWord = maxWidthEnglishWord < width ? width : maxWidthEnglishWord;
        }
    }

    private void placeLabels(float scrollPosYFirstElem) {
        int i = wordsToFind.size();
        for (Label label : wordsToFind) {
            label.setPosition(x, scrollPosYFirstElem - i * label.getHeight() - i * 20);
            i--;
        }

        i = wordsToFind.size();;
        for (Label label : wordsTranslated) {
            label.setPosition(x + maxWidthEnglishWord, scrollPosYFirstElem - i * label.getHeight() - i * 20);
            i--;
        }
    }

    public void touchDragged(float x, float y) {
        //limit scroll top
        if ( wordsToFind.get(0).getPosition().y + y > minY )
            return;
        //limit scroll bottom
        if ( wordsToFind.get(wordsToFind.size() - 1).getPosition().y + y < maxY )
            return;

        actualScrollY+=y;
        placeLabels(actualScrollY);
    }

    public void draw(Batch batch) {
        for (Label label : wordsToFind) {
            label.draw(batch);
        }
        for (Label label : wordsTranslated) {
            label.draw(batch);
        }
    }
}
