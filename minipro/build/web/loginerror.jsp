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
        box-shadow: 0 0 5px  #d966ff;
        background-color: #dedeed;
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
      <form action="loginerror" method="POST">
          <center><h2 >Sign In</h2></center>
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" required>

      <label for="password">Password:</label>
      <input type="password" id="pass" name="pass" required>

      <button type="submit">Login</button>
      <div class="error-message">  <br>
          WRONG INPUT..!<br>
      </div>
      <div class="form-group">
          <a href="forgetpassword.jsp">Forget Password</a><br>
    </form>
  </body>
</html>
