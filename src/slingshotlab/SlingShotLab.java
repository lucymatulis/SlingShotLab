/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slingshotlab;

/**
 *
 * @author Lucy
 */
      import java.lang.Math;
public class SlingShotLab {

     
    /**
     * @param args the command line arguments
     */
    
    double ypos;
    
   // static double v2;
     
      
    
    public static void main(String[] args) {
        double v1=20;
        double p = 1.23;
        double Cd = 0.4;
        double A = 0.00426;
        double ay=9.8;
        
    
        
        //double air;
       //air = (0.5*Cd*A*p*(Math.pow(v1,2)));
        //System.out.println(air);
       
        double v2x = 0;
        double t = 0;
        double vp=14;
        while (t<10){
            double air = (0.5*Cd*A*p*(Math.pow(vp,2)));
            t+=0.1;
             v2x = 14-(air/0.143)*t;
             System.out.println(v2x);
             vp=v2x;
        }
        double v2y = 0;
        System.out.println("__________");
        
        double ty=0;
                while (ty<10){
            
            ty+=0.1;
             v2y = 16-ay*ty;
             System.out.println(v2y);
            //vp=v2x;
        }
        
        double xpos = 0;  
        double time = 0;
        
       /* while(xpos<=40){
            time=+1;
            xpos = v1*time;
            System.out.println(xpos);
        }*/
        
       
    }
   /* public void getSpeed(double v1){
        double v2;
        double t = 0;
        while (t<120){
            t++;
             v2 = 14+(air/0.143)*t;
             System.out.println(v2);
        }
    }*/
}
