/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import java.awt.*;
/**
 *
 * @author Arciniegas
 */
public class Nodo {
    private int x,y;
    private String nombre;
    public static final int d= 60;
    
    public Nodo(int x, int y, String nombre){
        this.x=x;
        this.y=y;
        this.nombre = nombre;
    }

    Nodo(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Pintar(Graphics g){
        g.drawOval(this.x -d/2, this.y - d/2,d,d);
        g.drawString(nombre, x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
