/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesor;

import java.util.List;
import persona.Persona;

/**
 *
 * @author jmllamasg
 */
public class Profesor extends Persona {

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @return the prestamos
     */
    public List <Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @param prestamos the prestamos to set
     */
    public void setPrestamos(List <Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    private String Nombre;
    private int edad;
    private List <Prestamo> prestamos;
    
    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }
    
    
    public void printTodaLaInformacion() {
        DatosPersona();
        for (Prestamo p: getPrestamos()) {
            System.out.println(p);
        }
    }

    public void DatosPersona() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + getNumeroDeTelefono());
    }

    private static class Prestamo {

        public Prestamo() {
        }
    }
    
}
