package com.company;
public class MovablePoint extends Point{
    private float xSeep = 0.0f;
    private float ySeep = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSeep, float ySeep) {
        this.xSeep = xSeep;
        this.ySeep = ySeep;
    }

    public MovablePoint(float xSeep, float ySeep, float x, float y) {
        super(x, y);
        this.xSeep = xSeep;
        this.ySeep = ySeep;
    }

    public float getxSeep() {
        return xSeep;
    }

    public void setxSeep(float xSeep) {
        this.xSeep = xSeep;
    }

    public float getySeep() {
        return ySeep;
    }

    public void setySeep(float ySeep) {
        this.ySeep = ySeep;
    }

    public float[] getSeep(float xSeep, float ySeep) {
        float[] array = {xSeep,ySeep};
        return array;
    }

    public void setSeep(float xSeep, float ySeep) {
        this.xSeep = xSeep;
        this.ySeep = ySeep;
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                + "x = " + getX()
                + ", y = " + getY()
                + ", xSeep = " + xSeep
                + ", ySeep=" + ySeep
                + '}';
    }

    public MovablePoint move(){
        super.setX(super.getX()+ xSeep);
        super.setY(super.getY()+ ySeep);
        return this;
    }
}
