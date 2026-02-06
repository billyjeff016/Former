/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author darre01
 */
public abstract class Form implements Serializable{
protected int xPos;
protected int yPos;
private boolean running;
protected Color color;

public Form(int x, int y){
    xPos=x;
    yPos=y;
    
}
public int getXpos(){
    return xPos;
}
public int getYpos(){
    return yPos;
}
public Point getPos(){
    return new Point(xPos, yPos);
}
public void setRunning(boolean run){
this.running = run;    
}
boolean Höger = false;
public void move(int x, int y){
    if (Höger) {
        xPos+=5;
        if (xPos>=350) {
            Höger = false;
        }
    }else{
        xPos-=5;
        if (xPos<=50) {
            xPos+=5;
            Höger = true;
        }
    }
}
public abstract void draw(Graphics g);
public abstract String WhatAmI();
public abstract double getArea();
}

