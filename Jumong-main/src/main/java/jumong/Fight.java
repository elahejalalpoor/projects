/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jumong;

import Map.Item;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Elahe Jalalpoor
 */
public class Fight extends JFrame implements MouseListener,ItemListener,ActionListener{
    Jumong j;
    Pfight panel;
    JFrame frame;
    JButton sa,ba,fa;
    JList s
    ;
    int select;
    JButton ok;
    public String sal[] ={"smallArrow","bigArrow","fireArrow"};
    private Point p;
    public Fight(Jumong j)
    {
        super("Live Battle");
        ok=new JButton("ok");
         s=new JList(sal);
        panel=new Pfight(j);
        add(panel);
        this.j=j;
        setVisible(false);
        setSize(600,600);
        setLocation(100,80);
        panel.repaint();
        addMouseListener(this);
        ok.addActionListener(this);
        doit();
        setVisible(true);
        
    }
    private void doit()
    {
        for(int x= j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size()-1;x>=0;x--)
        {
            Enemy e=(Enemy) j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.get(x);
            e.setX(x);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        p = e.getPoint();
        int x= j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size();
        if(x==1)
        {
            if(p.x>200 && p.x<300 && p.y>80 && p.y<180)
            {
            frame=new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(200,120);
            frame.setLocation(400,120);
            select=0;
            frame.add(s);
            frame.add(ok);
            frame.setVisible(true);
            }
        }
        if(x==2)
        {
            if(p.x>100 && p.x<200 && p.y>80 && p.y<180)
            {
            frame=new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(200,120);
            frame.setLocation(400,120);
            frame.add(s);
            select=1;
            frame.add(ok);
            frame.setVisible(true);
            }
            if(p.x>200 && p.x<300 && p.y>80 && p.y<180)
            {
            frame=new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(200,120);
            frame.setLocation(400,120);
            frame.add(s);
            select=0;
            frame.add(ok);
            frame.setVisible(true);
            }
        }
        if(x==3)
        {
            if((p.x>100 && p.x<200 && p.y>80 && p.y<180) )
            {
            frame=new JFrame();
            frame.setLayout(new FlowLayout());           
            frame.setSize(200,120);
            frame.setLocation(400,120);
            frame.add(s);
            frame.add(ok);
            select=1;
            frame.setVisible(true);
            }
            else if((p.x>100 && p.x<200 && p.y>180 && p.y<280))
            {
            frame=new JFrame();
            frame.setLayout(new FlowLayout());           
            frame.setSize(200,140);
            frame.setLocation(400,120);
            frame.add(s);
            frame.add(ok);
            select=2;
            frame.setVisible(true);
            }
            else if((p.x>200 && p.x<300 && p.y>80 && p.y<180))
            {
            frame=new JFrame();
            frame.setLayout(new FlowLayout());           
            frame.setSize(200,140);
            frame.setLocation(400,120);
            frame.add(s);
            frame.add(ok);
            select=0;
            frame.setVisible(true);
            }
            
            }
        }
       
   
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok)
        {
            int num=0;
            if(s.getSelectedIndex()==0)
            {
                for(int index=j.getInventory().size()-1;index>=0;index--)
                {
                    Item i=(Item) j.getInventory().get(index);
                    if(i.s.equals("smallArrow"))
                    {
                        for(int x= j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size()-1;x>=0;x--)
                        {
                        Enemy ee=(Enemy) j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.get(x);
                        if(ee.getX()==select)
                        {
                            j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.remove(x);
                            break;
                        }
                        }
                        j.getInventory().remove(index);
                        panel.repaint();
                        num++;
                        doit();
                        break;
                    }
                }
                if(num==0)
                {
                    JOptionPane.showMessageDialog(null,"you don't have smallArrow in your inventory! :(");
                }
            }
            if(s.getSelectedIndex()==1)
            {
                for(int index=j.getInventory().size()-1;index>=0;index--)
                {
                    Item i=(Item) j.getInventory().get(index);
                    if(i.s.equals("bigArrow"))
                    {
                        i.use(j);
                        num++;
                        j.getInventory().remove(index);
                        panel.repaint();
                        doit();
                        break;
                    }
                }
                if(num==0)
                {
                    JOptionPane.showMessageDialog(null,"you don't have bigArrow in your inventory! :(");
                }
            }
            if(s.getSelectedIndex()==2)
            {
                for(int index=j.getInventory().size()-1;index>=0;index--)
                {
                    Item i=(Item) j.getInventory().get(index);
                    if(i.s.equals("fireArrow"))
                    {
                        for(int x= j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size()-1;x>=0;x--)
                        {
                        Enemy ee=(Enemy) j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.get(x);
                        if(ee.getX()==select)
                        {
                            j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.remove(x);
                        }
                        }
                         if(Jumong.getX()>0 && Jumong.getX()<22 && Jumong.getY()>0 && Jumong.getY()<22)
            {
            j.getPoint()[Jumong.getX()+1][Jumong.getY()].setIswall(false);

            j.getPoint()[Jumong.getX()-1][Jumong.getY()].setIswall(false);

            j.getPoint()[Jumong.getX()][Jumong.getY()-1].setIswall(false);

            j.getPoint()[Jumong.getX()][Jumong.getY()+1].setIswall(false);
            }
                        num++;
                        j.getInventory().remove(index);
                        panel.repaint();
                        doit();
                        break;
                    }
                }
                if(num==0)
                {
                    JOptionPane.showMessageDialog(null,"you don't have fireArrow in your inventory! :(");
                }
            }
            frame.dispose();
        }
    }
    
}
