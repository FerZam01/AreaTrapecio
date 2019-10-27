/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author ferna
 */
@Named(value = "ctrlCalculo")
@RequestScoped
public class CtrlCalculo {

    /**
     * Creates a new instance of CtrlCalculo
     */
    private double baseMenor;
    private double baseMayor;
    private double altura;
    private double area;
    
    public void calculaArea(){
        area = ((getBaseMayor() + getBaseMenor()) / 2)* getAltura();
        final String mensaje = "La Area es  "+ String.valueOf(area);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensaje));
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
