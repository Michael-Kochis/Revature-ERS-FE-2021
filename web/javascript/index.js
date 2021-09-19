// import {sayHi} from './sayHi'

function sayHi(user) {
    return ("Hello " + user);
}

window.onload = function() {
    let root = document.getElementById('root');
    root.innerHTML = sayHi('World!');

    let loginButton = document.createElement("button");
    loginButton.innerText = "Login";

    let registerButton = document.createElement("button");
    registerButton.innerText = "Register";

    root.appendChild(loginButton);
    root.appendChild(registerButton);
};