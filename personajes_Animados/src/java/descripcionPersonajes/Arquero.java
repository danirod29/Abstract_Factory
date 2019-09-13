/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descripcionPersonajes;

import descripcionArmadura.Armadura;
import descripcionArmadura.Cuero;
import descripcionHabilidades.HabiArquero;
import descripcionHabilidades.Habilidades;
import descripcionArmas.Arco;
import descripcionArmas.Arma;

/**
 *
 * @author Estudiantes
 */
public class Arquero implements ClasePersonaje{

    
    @Override
    public Arma asigArma() {
        return new Arco();
    }

    @Override
    public Habilidades asigHabilidades() {
        return new HabiArquero();
    }

    @Override
    public Armadura asigArmadura() {
        return new Cuero();
    }

    @Override
    public String asigImagen() {
        return "img/Arquero.jpg";
    }
    
    

    
    
}
