/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2herencia;
import com.kiezmi.controllers.MasterCtr;
/**
 *
 * @author Usuario
 */
public class Electrodomestico {

    protected int precio;
    protected int peso;
    protected String color;
    protected char consumoEnergetico;

    public Electrodomestico(int precio, int peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Electrodomestico() {
    }

}
public enum consumoElectrico{


}
