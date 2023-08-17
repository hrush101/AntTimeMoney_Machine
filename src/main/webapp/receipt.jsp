<%
String date=request.getParameter("date");
String acc_no=request.getParameter("acc_no");
String amt=request.getParameter("amt");
String type=request.getParameter("type");
%> 

<h1>AXIS</h1>

<form action="rclog" method="post">    
    <button class="logbutton logbutton1" type="submit" name="log" value="out">Logout</button>    
</form>

<title>Bank Statement Receipt</title>
</head>
<body>
  <div class="receipt">
    <div class="header">
      <h2>Bank Statement Receipt</h2>
      <img src="hands.png" alt="PNG Icon" width="30" height="30" >
      <p>Thank you for Banking with AXIS</p>
    </div>
    <div class="info">
      <strong>Date:</strong> ${date}<br><br>
      <strong>Account Number:</strong> ${acc_no}<br><br>
      <strong>Transaction Type:</strong> ${type}<br><br>
      <strong>Amount:</strong> ${amt}
    </div>
    <div class="details">
      <p>This is to confirm that a ${type} of ${amt} was successfully made to your account on ${date}</p>
      <p>If you have any questions, please contact our customer support.</p>
    </div>
  </div>
</body>
</html>

<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 20px;
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
    top: 18px;
  }
  
  .logbutton{

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
      border-radius: 8px;
      cursor: pointer;
      position:absolute;
      right: 20px;
      top: 25px;
    }
    .logbutton1{background-color: #45d7d5;}
    
  .receipt {
    background-color: #f5f5f5;
    border: 1px solid #ccc;
    border-radius: 5px;
    padding: 20px;
    max-width: 400px;
    margin: 0 auto;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
  }
  .header {
    text-align: center;
    margin-bottom: 20px;
  }
  .header h2 {
    color:  #4ad0e8; /* #4ad0e8 ,#4cc0be */
    margin: 0;
  }
  .info {
    margin-bottom: 10px;
  }
  .info strong {
    display: inline-block;
    width: 120px;
  }
  .details {
    margin-top: 20px;
    border-top: 1px solid #ccc;
    padding-top: 10px;
  }
</style>