<%-- 
    Document   : index
    Created on : 31-ago-2019, 20:57:29
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pestaña de inicio</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/estilos_1.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <!-- formulario personaje--->
        <form>
            <h1><center> R E A L I S M </center></h1>
        </form>
        
        <form action="listaPersonajes.jsp" method="get">
            
            <input type="text" placeholder="Ingrese el nombre del personaje" name="nombre" required="">
            <input type="submit" value="Continuar" id="botton">
            
        </form>
       
    </body>
</html>
