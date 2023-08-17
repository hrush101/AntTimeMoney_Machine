<h1>AXIS</h1>
<div class="container">
  <div class="card">

    <h2>Welcome To Menu</h2>
    <form action="menu" method="">
    <button class="button button1" type="submit" name="button" value="withdraw">Withdrawal</button>
    <button class="button button2" type="submit" name="button" value="deposit">Deposit</button>
    <button class="button button3" type="submit"name="button" value="check">Check balance</button>
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
  
    h1{
    color: #fff;
    font-size: 1.5cm;
    text-align:left;
    position: absolute;
    top: 10px;
    }

    .bottom{
     color: #fff;
     position: absolute;
     bottom: 15px;
     font-size: 20px;

    }
    
    .button {
      border: none;
      background-color: #fff;
      color: white;
      padding: 15px 32px;
      text-align: left;
      text-decoration: none;
      display: inline-block;
      font-size: 17px;
      margin: 10px 15px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
    
    .button1 {background-color: #44cfd4;} /* #4cacaf */
    .button2 {background-color: #4fcfd3;} /* #4cafad */
    .button3 {background-color: #51d6d4;} 
    
    h2 {
    color: #fff;
    text-align: center;
    margin-bottom: 20px;
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
      
      form {
        display: flex;
        flex-direction: column;
      }
    </style>