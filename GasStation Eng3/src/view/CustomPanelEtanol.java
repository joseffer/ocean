/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class CustomPanelEtanol extends JPanel{
    private int progress = 0;
    public void updateProgress(int progressValue){
        progress = progressValue;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_OFF); erro ao compilar
        g2.translate(this.getWidth()/2, this.getHeight()/2);
        g2.rotate(Math.toRadians(270));
        Arc2D.Float arc =  new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle = new Ellipse2D.Float(0,0,60,60);
        arc.setFrameFromCenter(new Point(0,0), new Point(70,70));
        circle.setFrameFromCenter(new Point(0,0), new Point(60,60));
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress*3.6); //isso é utilizado por causa da circunferencia, 360/100
        g2.setColor(new Color(232,81,74));
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(circle);
        g2.fill(circle);
        g2.setColor(new Color(36,47,65));
        g2.rotate(Math.toRadians(90));
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        FontMetrics fm = g2.getFontMetrics();
        java.awt.geom.Rectangle2D r = fm.getStringBounds(progress+"%", g);
        int x = (0-(int)r.getWidth())/2;
         int y = (0-(int)r.getHeight())/2+ fm.getAscent();
        g2.drawString( progress+"%",x,y);
        
        
    }
    
}
