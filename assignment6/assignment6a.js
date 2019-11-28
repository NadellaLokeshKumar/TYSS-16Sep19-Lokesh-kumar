function functionPass(){
    let a = document.getElementById("input");
    if(a.type === "password")
    a.type = "text"
    else
    a.type = "password"
}

