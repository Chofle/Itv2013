/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itv2013;

/**
 *
 * @author DAW
 */
public class EmisionesContaminantes {
    private double gases;
    private double ruido;
    private double limitVelocidad;
    
    public EmisionesContaminantes(){
        
    }
    
    public EmisionesContaminantes(double gases, double ruido, double limitVelocidad){
        this.gases = gases;
        this.ruido = ruido;
        this.limitVelocidad = limitVelocidad;
    }
    
    public double getGases(){
        return gases;
    }
    
    public void setGases(double gases){
        this.gases = gases;
    }
    
    public double getRuido(){
        return ruido;
    }
    
    public void setRuido(double ruido){
        this.ruido = ruido;
    }
    
    public double getLimitVelocidad(){
        return limitVelocidad;
    }
    public void setLimitVelocidad(double limitVelocidad){
        this.limitVelocidad = limitVelocidad;
    }
}
