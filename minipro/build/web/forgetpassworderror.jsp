<%-- 
    Document   : index
    Created on : Mar 26, 2023, 2:00:14 AM
    Author     : HoPeLaD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!DOCTYPE html>
<html>
  <head>
    <title>Login Page</title>
    <style>
      /* CSS styles go here */
      form {
        width: 410px;
        margin: 50px auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-shadow: 0 0 5px  #ff66a3;
        background-color: #e6e6ff;
      }

      label {
        display: block;
        margin-bottom: 10px;
        font-weight: bolder;
        font-size: 20px;
        font-size-adjust: none;
        font-style: inherit;
      }

      input[type="text"], input[type="password"] {
        width: 100%;
        width: 95%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
      }

      button[type="submit"] {
        display: block;
        width: 60%;
        margin: 0 auto;
        padding: 10px;
        border: none;
        border-radius: 5px;
        background-color: #0066cc;
        color: #fff;
        font-size: 16px;
        cursor: pointer;
      }

      .error-message {
        color: #ff0000;
        font-weight: bold;
        margin-bottom: 20px;
      }
    </style>
  </head>
  <body>
      <form action="forgetpassworderror" method="POST">
          <center><h1> Hey.  </h1></center>
          <center><p>we will send you your email and password after we identified your are one of our user!!</p></center>
          <center><h1>Please Provide Your Email : </h1></center>
          <label for="username">Email:</label>
      <input type="email" id="email" name="email" required><br>
      <br> <button type="submit"> Send </button> 
      <div class="error-message">
          <h2> Your Email is not found in our Database</h2>
      </div>
      <div class="form-group">
          <a href="index.jsp">Back To Home </a><br></div>
    </form>
  </body>
</html>
