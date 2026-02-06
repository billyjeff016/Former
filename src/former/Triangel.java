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
public class Triangel extends Form {

    private int bas;
    private int höjd;
    private boolean fylld;
    public Triangel(int x, int y, int b, int h) {
        super(x, y);
        this.bas=b;
        this.höjd=h;
               color=new Color((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));
    }

    
    @Override
    public void draw(Graphics g) {
        move(0,0);
      int[]x={xPos-(bas/2), xPos + bas/2, xPos};
      int[]y={yPos+(höjd/2), yPos+(höjd/2), yPos-(höjd/2)};
      g.setColor(Color.YELLOW);
      g.setColor(color);
      g.fillPolygon(x, y, 3);
    }

    @Override
    public String WhatAmI() {
return "Triangel";
    }

    @Override
    public double getArea() {
      return (bas*höjd)/2.0;
    }
    
}
