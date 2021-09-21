import bcrypt from "bcrypt";

export function lrButtons(parentNode) {
    let root = document.getElementById('root');

    let lrButtonBar = document.createElement('div');
    lrButtonBar.id = "lrButtonBar"

    let loginButton = document.createElement("button");
    loginButton.id = "loginButton";
    loginButton.onclick = loginClick;
    loginButton.innerText = "Login";

    let registerButton = document.createElement("button");
    registerButton.id = "registerButton";
    registerButton.onclick = registerClick;
    registerButton.innerText = "Register";

    lrButtonBar.appendChild(loginButton);
    lrButtonBar.appendChild(registerButton);
    parentNode.appendChild(lrButtonBar)
}

function loginClick() {
    console.log("Login clicked");
    let user = document.getElementById("username").value;
    console.log(user);
    bcrypt.hash(user, 12, (err, hash) => {
        if (err) {
            console.error(err);
            return;
        }
        console.log(hash);
    })
}

function registerClick() {
    console.log("Register clicked");
}