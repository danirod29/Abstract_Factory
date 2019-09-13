<%-- 
    Document   : listaPersonajes
    Created on : 31-ago-2019, 20:58:24
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estilos_2.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
         <div>
            <form>
                    <h1> Seleccione el personaje</h1>
            </form>
         </div>     
        <div>
            <% int numPersonajes = 3; %>
            <% String[] personajes = new String[numPersonajes];%>
            <% personajes[0] = "Arquero";%>
            <% personajes[1] = "Guerrero";%>
            <% personajes[2] = "Hechicero";%>
            <%--String[] tipoPersonaje = new String[numPersonajes-1]; --%>       
            <table>
                <% int z =0 ;%>
                <% int i=1;%>
                <% while(i<=1){%>
                <tr>
                    <% int j=1;%>
                    <% while(j<=3){%>
                    <td>                 
                        <form action="crearPersonaje" method="get">
                            <center>
                                <img src="img/<%=personajes[z]%>.jpg" width="330px" height="540px" posi="center">
                            </center>
                            <input type="submit" value="<%= personajes[z]%>" name="<%= personajes[z]%>" id="botton">                       
                        </form> 
                        <% z++;%>    
                    </td> 
                    <% j++;%>
                        <% }%> 
                </tr>
                <% i++;%>
                    <% }%>
            </table>
        </div>
    </body>
</html>
