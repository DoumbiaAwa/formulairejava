<%-- 
    Document   : Deconnection
    Created on : 16 juin 2023, 10:42:13
    Author     : Awa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        
        <fieldset>
            
            <h1 style="text-align: center; color: blue">Connection</h1>
            <center>
                 <form action="../DeconnectionServlet" method="POST">
                  <div style="width: 50%; border: 4px ">
        
           
             <div class="form-group">
    <label for="exampleInputEmail1"style="float: left">Pseudo</label>
    <input type="text" class="form-control" name="pseudo" aria-describedby="emailHelp" placeholder="Entrez votre pseudo">
      </div>
     <br>
  
  
  <div class="form-group">
    <label for="exampleInputPassword1"style="float: left">Password</label>
    <input type="password" class="form-control" name="mtp" placeholder="Password">
  </div>
     <br>
     </div>
     
                   <div class = "lOg">
                <i class=" fa-solid fa-right-fron-bracket"> <a href="${pageContext.request.contextPath}/page/liste.jsp">
      <button type="submit" class="btn btn-primary">Connection</button>
            </a>
        </i>
        </div>
      </form>
      </center> 
             
             
             
          
    </body>
</html>
