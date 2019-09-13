/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descripcionArmadura;

/**
 *
 * @author Estudiantes
 */
public class Cuero extends Armadura{           
                    
    public String asigArmadura(){
        return "Cuero nivel de armadura medio";
    }

    @Override
    public String asigImagen() {
        return "img/cuero.png";
    }
    
}
