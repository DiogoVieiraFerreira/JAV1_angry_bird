package com.mygdx.game.models;

import com.badlogic.gdx.math.Vector2;

public abstract class MovingObject extends PhysicalObject {

    public Vector2 speed;

    public final static float GRAVITY = -9.81f; // Gravity, for objects that fall
    protected boolean frozen = false; // Allows to temporarily freeze the movement

    public MovingObject(String picname, Vector2 position, int width, int height, Vector2 speed) {
        super(picname, position, width, height);
        this.speed = speed;
    }


    public void move(float deltaTime)
    {
        translate(speed.x*deltaTime, speed.y*deltaTime);
    }
    // the accelerate method implements the speed change, which depends on the physics of the derived object, reason why it is abstract here
    public abstract void accelerate(float dt);

    public void freeze() {
        frozen = !frozen;
    }

    public boolean isFrozen() {
        return frozen;
    }

}
