/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelts;

import descripcionArmadura.Armadura;
import descripcionArmas.Arma;
import descripcionHabilidades.Habilidades;
import descripcionPersonajes.Arquero;
import descripcionPersonajes.ClasePersonaje;
import descripcionPersonajes.Guerrero;
import descripcionPersonajes.Hechicero;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "crearPersonaje", urlPatterns = {"/crearPersonaje"})
public class crearPersonaje extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String Imagenes []= new String [3]; 
        ClasePersonaje miPersona = null;
        Arma miArma = null;
        Habilidades misHabilidades = null;
        Armadura miArmadura = null;
      
        String nombre = "";
        
        
        if("Guerrero".equals(request.getParameter("Guerrero"))){
                miPersona = new Guerrero();
                miArma = miPersona.asigArma();
                misHabilidades = miPersona.asigHabilidades();
                miArmadura = miPersona.asigArmadura();
                
              
        }else if("Arquero".equals(request.getParameter("Arquero"))){
                miPersona = new Arquero();
                miArma = miPersona.asigArma();
                misHabilidades = miPersona.asigHabilidades();
                miArmadura = miPersona.asigArmadura();
              
             
        }else if("Hechicero".equals(request.getParameter("Hechicero"))){
                miPersona = new Hechicero();
                miArma = miPersona.asigArma();
                misHabilidades = miPersona.asigHabilidades();
                miArmadura = miPersona.asigArmadura();
                            
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet crearPersonaje</title>"); 
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos_3.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<form>");
            out.println("<h1>" + nombre + "</1>");
            
            
            out.println("<table >");
            
            out.println("<tr >");
            
            out.println("<td >");
            out.println("<img src="+miPersona.asigImagen()+" width=\"330px\" height=\"540px\" posi=\"center\">");
            out.println("</td >");
           
            
            
            
            out.println("<td>");
            out.println("<table >");
            
            out.println("<tr >");
            
            
            out.println("<td >");
            out.println("<img src="+miArma.asigImagen()+" width=\"40px\" height=\"40px\" posi=\"center\">");
            out.println("</td >");
            
            out.println("<td >");
            out.println("<h2>Arma : " + miArma.asignarArma() + "</h2>");
            out.println("</td >");
            
            out.println("</tr >");
            
            
             out.println("<tr >");
            
            
            out.println("<td >");
            out.println("<img src="+miArmadura.asigImagen()+" width=\"40px\" height=\"40px\" posi=\"center\">");
            out.println("</td >");
            
            out.println("<td >");
            out.println("<h2>Armadura : " + miArmadura.asigArmadura() + "</h2>");
            out.println("</td >");
            
            out.println("</tr >");        
            
   //
             out.println("<tr >");
            
            
            out.println("<td >");
            out.println("<img src="+misHabilidades.asigImagen()+" width=\"40px\" height=\"40px\" posi=\"center\">");
            out.println("</td >");
            
            out.println("<td >");
            out.println("<h2> " + misHabilidades.asigHabilidades() + "</h2>");
            out.println("</td >");
            
            out.println("</tr >");        
            
            
            out.println("</table >");
            out.println("</td >");
            out.println("</tr >");
            
            out.println("</table >");
            
            
            
            
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
