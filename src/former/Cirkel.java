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
public class Cirkel extends Form {
    private int radie;
    private boolean fylld;

    public Cirkel(int x, int y, int r) {
        
        super(x, y);
        
        this.radie=r;
        color=new Color((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));
    }

    @Override
    public void draw(Graphics g) {
       g.setColor(Color.GREEN);
       g.setColor(color);
       g.fillOval(xPos-(radie/2), yPos-(radie/2), radie, radie);
    }

    @Override
    public String WhatAmI() {
    return "Cirkel";   
    }

    @Override
    public double getArea() {
return radie*radie*Math.PI;
    }

}
