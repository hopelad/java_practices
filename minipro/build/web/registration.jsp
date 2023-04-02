<!DOCTYPE html>
<html>
  <head>
    <title>Registration Form</title>
    <style>
      /* CSS styling */
      body {
        background-color: #f2f2f2;
        font-family: Arial, sans-serif;
      }

      .container {
        background-color: white;
        max-width: 500px;
        margin: 20px auto;
        padding: 20px;
        border-radius: 10px;
        box-shadow:10px;
      }

      h1 {
        text-align: center;
        margin-bottom: 30px;
        color: #333;
      }

      label {
        display: block;
        margin-bottom: 10px;
        color: #333;
      }
    
      input[type="text"],
     
      select {
        display: block;
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border-radius: 5px;
        border: none;
        background-color: #f2f2f2;
        font-size: 16px;
        color: #333;
      }

      input[type="submit"] {
        background-color: #333;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        margin-top: 20px;
      }

      input[type="submit"]:hover {
        background-color: greenyellow;
      }
                
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Registration Form</h1>
      <form acrion="regitration" method="POST">
        <label for="name">Enrollment Num:</label>
        <input type="text" id="num" name="num" required>

        <label for="firstname">First Name :</label>
        <input type="text" id="firstname" name="firstname" required>

        <label for="fathername">Father Name :</label>
        <input type="text" id="fathername" name="fathename" required>
           
        <label for="lastname">Last Name :</label>
        <input type="text" id="lastname" name="lastname" required>

        <label for="semister"> SEMESTER :</label>
        <select id="semester" name="Semester">
          <option value="_-_">- -</option>
          <option value="one">One</option>
          <option value="two">Two</option>
          <option value="tree">Three</option>
          <option value="four">Four</option>
          <option value="five">Five</option>
          <option value="Six">Six</option>
          <option value="seven">Seven</option>
          <option value="eight">Eight</option>  
        </select>
                 <label for="gender" required > Gender :</label>
                 <input type="radio" id="Male"name="gender" value="Male"> Male <br>
                 <input type="radio" id="Female"name="gender" value="Female"> Female <br>
                 <input type="radio" id="Other"name="gender" value="other" > Other <br>
                
                <label for="subject" required > Interested Subject:</label>
                <input type="checkbox" id="AJT"name="subject" value="AJT"/>AJT<br>
                <input type="checkbox" id="COA"name="subject" value="COA"/>COA<br>
                <input type="checkbox" id="CN"name="subject" value="CN"/>CN <br>
                <input type="checkbox" id="DM"name="subject" value="DM"/>DM <br>
              
                <label for="email">Email :</label>
                <input type="email" id="email" name="email" required>
                   
        <input type="submit" value="Register">
      </form>
    </div>
  </body>
</html>