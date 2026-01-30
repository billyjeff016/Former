/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author darre01
 */
public class Rektangel extends Form {

    private int bas;
    private int höjd;
    private boolean fylld;
    public Rektangel(int x, int y, int b, int h) {
        super(x, y);
        this.bas=b;
        this.höjd=h;
               color=new Color((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));
    }

    @Override
    public void draw(Graphics g) {
g.setColor(Color.BLUE);
g.setColor(color);
g.fillRect(xPos-(bas/2), yPos-(höjd/2), bas, höjd);
    }

    @Override
    public String WhatAmI() {
        return "Rektangel";
    }

    @Override
    public double getArea() {
       return bas*höjd;
    }
    
}
