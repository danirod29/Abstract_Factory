/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descripcionArmas;

/**
 *
 * @author Estudiantes
 */
public class Arco extends Arma{
    
    @Override
    public String asignarArma(){
      return "Arco y flechas";
     }

    @Override
    public String asigImagen() {
        return "img/arco.png";
    }


}
