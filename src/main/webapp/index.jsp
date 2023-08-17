<h1>AXIS</h1>
<div class="container">
  <div class="card">
    <h2>Welcome To ATM</h2>
    <form action="login" method="post">
      <label for="username">Account no.</label>
      <input type="text" name="username" placeholder="Enter your Account no.">

      <label for="password">Password</label>
      <input type="password" name="password" placeholder="Enter your pin">   
      <div class="jc">
        <%
          if(request.getAttribute("msg")!=null){out.println(request.getAttribute("msg"));}
        %>
      </div>   
      <button type="submit">Login</button>
    </form>
  </div>
</div>

<div class="bottom">
  <label>Bank Of People's Trust</label> 
</div>

<style>

@import url('https://fonts.googleapis.com/css2?family=Agdasima&family=Poppins&display=swap');
body {
    font-family: 'Poppins', sans-serif;
    margin: 0;
    padding: 0;
    background: linear-gradient(to bottom right, #70ffa7, #497ffc);
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
  }
  
  .container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100%;
  }
  
  .card {
    width: 350px;
    background-color: rgba(255, 255, 255, 0.3);
    border-radius: 18px;
    padding: 40px;
    backdrop-filter: blur(10px);
    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
  }
  
  .bottom{
     color: #fff;
     position: absolute;
     bottom: 15px;
     font-size: 20px;

  }
  
  .jc{
    text-align: center;
    color: #fff;
    margin-bottom: 5px;
        
  }

  h1{
    color: #fff;
    font-size: 1.5cm;
    text-align:left;
    position: absolute;
    top: 10px;
    
  }

  h2 {
    color: #fff;
    text-align: center;
    margin-bottom: 10px;

  }
  
  form {
    display: flex;
    flex-direction: column;
  }
  
  label {
    color: #fff;
    margin-bottom: 5px;
  }
  
  input {
    padding: 10px 15px;
    margin-bottom: 10px;
    border: none;
    border-radius: 5px;
    background-color: rgba(255, 255, 255, 0.8);
  }
  
  button {
    padding: 10px;
    background-color: #fff;
    color: #49defc;
    font-size: 17px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-top: 10px;
    
  }
  
  button:hover {
    background-color: #70c1ff;
  }
  
  @media (max-width: 480px) {
    .card {
      width: 100%;
      max-width: 350px;
    }
  }
  </style>