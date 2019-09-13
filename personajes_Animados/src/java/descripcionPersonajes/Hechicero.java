/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descripcionPersonajes;

import descripcionArmadura.Armadura;
import descripcionArmadura.Tela;
import descripcionHabilidades.Habilidades;
import descripcionArmas.Arma;
import descripcionArmas.Baston;
import descripcionHabilidades.HabiHechicero;

/**
 *
 * @author Estudiantes
 */
public class Hechicero implements ClasePersonaje{

   @Override
    public Arma asigArma() {
        return new Baston();
    }

    @Override
    public Habilidades asigHabilidades() {
        return new HabiHechicero();
    }

    @Override
    public Armadura asigArmadura() {
        return new Tela();
    }

    @Override
    public String asigImagen() {
        return "img/Hechicero.jpg";
    }
    
}
