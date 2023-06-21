<%-- 
    Document   : Inscription
    Created on : 15 juin 2023, 17:20:35
    Author     : Awa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
       <center>  
        <div style="width: 50%; height: 80%">
           
 <form action="../InscriptionServlet" method="POST" class="card center shadow p-3 mb-5 bg-white rounded w-75 m-6">
        
   
  <div class="form-group">
    <label for="exampleInputEmail1"style="float: left">Nom</label>
    <input type="text"  class="form-control" name="nom" aria-describedby="emailHelp" placeholder="Entrez votre nom">
  </div>
     <br>
     
     
      <div class="form-group">
    <label for="exampleInputEmail1" style="float: left">Prenom</label>
    <input type="text" class="form-control" name="prenom" aria-describedby="emailHelp" placeholder="Entrez votre prenom">
     </div>
        <br>
     
     
     
      <div class="form-group">
    <label for="exampleInputEmail1"style="float: left">Pseudo</label>
    <input type="text" class="form-control" name="pseudo" aria-describedby="emailHelp" placeholder="Entrez votre pseudo">
      </div>
     <br>
  
  
   <div class="form-group">
    <label for="exampleInputEmail1"style="float: left">Email</label>
    <input type="text" class="form-control" name="email" aria-describedby="emailHelp" placeholder="Entrez votre mail">
      </div>
     <br>
     
     
      
     
  <div class="form-group">
    <label for="exampleInputPassword1"style="float: left">Password</label>
    <input type="password" class="form-control" name="mtp" placeholder="Password">
  </div>
   <br>
     
     
      <div class="form-group">
    <label for="exampleInputEmail1"style="float: left">Confirmer votre mot de passe </label>
    <input type="password" class="form-control" name="confirmation" aria-describedby="emailHelp" placeholder="Confirmer votre mot de passe">
  </div>
  <br>
     
     
     
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1" style="float: left">Acceptez notre condition</label>
  </div>
   <br>
     
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    
   </div>   
   </center>

 
       
</body>
</html>
