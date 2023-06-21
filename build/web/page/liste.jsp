<%-- 
    Document   : liste
    Created on : 15 juin 2023, 17:31:06
    Author     : Awa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <title>Page Accueil</title>
    </head>
    <body>
        
 <h1 style="text-align: center; color: blue; font-size: 50px">Bienvenue sur notre page ${inscription.nom} </h1> 
 <div style="width:100%">
  <img src= "">
  </div>
        
        

 <h2 style="text-align: center; background-color: buttonface">Liste des personnes déjà inscrit</h2>  
 <br>
        
        <table style="border: 5px"class="table table-bordered">
     <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Pseudo</th>
      <th scope="col">Email</th>
      </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>${inscription.nom}</td>
      <td>${inscription.prenom}</td>
      <td>${inscription.pseudo}</td>
       <td>${inscription.email}</td>
    </tr>
    
    
  </tbody>
</table>
    
    
     
            <br>
    <center>
            
            <div class = "log">
                <i class=" fa-solid fa-right-fron-bracket"> <a href="${pageContext.request.contextPath}/page/Deconnection.jsp">
        <button type="submit" class="btn btn-primary">Deconnection</button>
            </a>
        </i>
        </div>
        </center>

            
              </body>
</html>
