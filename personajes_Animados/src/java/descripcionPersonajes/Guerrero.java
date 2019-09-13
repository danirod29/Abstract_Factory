/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descripcionPersonajes;

import descripcionArmadura.Armadura;
import descripcionArmadura.Placas;
import descripcionHabilidades.Habilidades;
import descripcionArmas.Arma;
import descripcionArmas.Espada;
import descripcionHabilidades.HabiGuerrero;

/**
 *
 * @author Estudiantes
 */
public class Guerrero implements ClasePersonaje{

    @Override
    public Arma asigArma() {
        return new Espada();
    }

    @Override
    public Habilidades asigHabilidades() {
        return new HabiGuerrero();
    }

    @Override
    public Armadura asigArmadura() {
        return new Placas();
    }

    @Override
    public String asigImagen() {
        return "img/Guerrero.jpg";
    }
    
}
