/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arciniegas
 */
public class Lienzo extends JPanel implements MouseListener {

    private Vector<Nodo> vectorNodos;
    private Vector<Enlace> vectorEnlaces;
    private Point p1, p2;

    public Lienzo() {
        this.vectorNodos = new Vector<>();
        this.vectorEnlaces = new Vector<>();
        this.addMouseListener(this);
    }

    public void Paint(Graphics g) {
        for (Nodo nodos : vectorNodos) {
        }
        for(Enlace enlace : vectorEnlaces){
            enlace.Pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton()==MouseEvent.BUTTON1){
            String nombre = JOptionPane.showInputDialog("Ingrese nombre nodo: ");
            this.vectorNodos.add(new Nodo(me.getX(), me.getY(), nombre));
            repaint();
        }
        if(me.getButton()== MouseEvent.BUTTON3){
            for(Nodo nodo : vectorNodos){
                if(new Rectangle(nodo.getX() - Nodo.d/2, nodo.getY() - Nodo.d/2, Nodo.d, Nodo.d).contains(me.getPoint())){
                    if(p1==null)
                        p1=new Point(nodo.getX(), nodo.getY());
                    else{
                        p2 = new Point(nodo.getX(), nodo.getY());
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre nodo: ");
                        this.vectorEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y, nombre));
                        repaint();
                        p1 = null;
                        p2=null;
                    }
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

}
