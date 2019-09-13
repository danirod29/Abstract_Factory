/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descripcionPersonajes;

import descripcionArmadura.Armadura;
import descripcionHabilidades.Habilidades;
import descripcionArmas.Arma;

/**
 *
 * @author Estudiantes
 */
public interface ClasePersonaje {
    
    
    
    Arma asigArma();
    
    Habilidades asigHabilidades();
    
    Armadura asigArmadura();
    
    String asigImagen();

    
    
    
    
    
}
