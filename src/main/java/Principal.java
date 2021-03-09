/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario Toshiba
 */
public class Principal {
    public static void main (String[]args)
    {
        Doctor ml=new Doctor("Juan",25,false);
        System.out.println("Nombre: "+ml.devuelveNombre());
        System.out.println("edad"+ml.devuelveEdad());
        if(ml.experiencia())
        {
            System.out.println("Tiene experiencia");
        }
        else
        {
            System.out.println("No tiene experiencia");
        }    
          
    }      
}
