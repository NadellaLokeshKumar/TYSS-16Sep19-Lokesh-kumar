function enable(){
   let username = document.getElementById(`hide`).value;
let password = document.getElementById(`lokesh`).value;
let login = document.getElementById(`log`);
if(username.length>5 && password.length>6)
login.disabled = false;
else
login.disabled=true;
}

