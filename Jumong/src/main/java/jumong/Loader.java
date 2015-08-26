///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package jumong;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author Elahe Jalalpoor
// */
//public class Loader {
//   InputStream input;
//   private Point[][] point;
//   private ArrayList inventory;
//   int x,y;
//   Jumong j;
//    public Loader() {
//        try {
//            input=new FileOuputStream("save.txt");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        this.point=j.getPoint();
//        this.inventory=j.getInventory();
//        this.x=Jumong.getX();
//        this.y=Jumong.getY();
//        
//        
//        
//        
//    }
//    
//    public void writeMyObject(Object obj) {
//       for (int i=0;i<23;i++)
//       {
//           for(int ja=0;ja<23;ja++)
//           {
//                try {
//                    output.write(point[i][ja].enemies.size());
//                } catch (IOException ex) {
//                    Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
//                }
//           }
//       }
//            try {
//                output.write('\n');
//            } catch (IOException ex) {
//                Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        try {
//            output.write(x);
//        } catch (IOException ex) {
//            Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            output.write(y);
//        } catch (IOException ex) {
//            Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       }
//       
//    
//}
