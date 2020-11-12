package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.enums.ScreenName;
import com.mygdx.game.screens.EndScreen;
import com.mygdx.game.screens.GameScreen;
import com.mygdx.game.screens.PauseScreen;
import com.mygdx.game.screens.ScoreScreen;
import com.mygdx.game.screens.WelcomeScreen;

import java.util.HashMap;
import java.util.Stack;

public class AngryBird extends Game {

    private static AngryBird instance;
    private Stack<ApplicationAdapter> stackScreens;
    private HashMap<ScreenName, ApplicationAdapter> screens;


    public static AngryBird getInstance() {
        return instance == null ? instance = new AngryBird() : instance;
    }

    private AngryBird() {
        screens = new HashMap<>();
        stackScreens = new Stack<>();

        screens.put(ScreenName.Welcome, new WelcomeScreen());
        screens.put(ScreenName.Game, new GameScreen());
        screens.put(ScreenName.Pause, new PauseScreen());
        screens.put(ScreenName.Score, new ScoreScreen((GameScreen) screens.get(ScreenName.Game)));
        screens.put(ScreenName.End, new EndScreen());
    }

    public void push(ScreenName screenName) {
        ApplicationAdapter screen = screens.get(screenName);
        screen.create();
        stackScreens.push(screen);
        Gdx.input.setInputProcessor((InputProcessor) stackScreens.peek());
    }

    public void pop() {
        stackScreens.pop();
        Gdx.input.setInputProcessor((InputProcessor) stackScreens.peek());
    }

    public void goToStart(){
        for (int i = stackScreens.size()-1; i > 0 ; i--) {
            pop();
        }
    }
    @Override
    public void create() {
        push(ScreenName.Welcome);
    }

    @Override
    public void render() {
        stackScreens.peek().render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
