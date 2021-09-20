// import {sayHi} from './sayHi'

function fakeForm() {
    let root = document.getElementById('root');
    let fakeForm = document.createElement('div');
    fakeForm.id = "fakeForm";

    setLoginAndRegisterButtons(fakeForm);

    root.appendChild(fakeForm);
}

function navBar() {
    let root = document.getElementById('root');

    let navBar = document.createElement('div');
    navBar.id = "navBar";
    navBar.classList.add("w10");

    let homeLink = document.createElement('a');
    homeLink.id = "homeLink";
    homeLink.innerText = "Home";

    navBar.appendChild(homeLink);
    root.appendChild(navBar);
}

function setLoginAndRegisterButtons(parentNode) {
    let root = document.getElementById('root');

    let lrButtonBar = document.createElement('div');
    lrButtonBar.id = "lrButtonBar"

    let loginButton = document.createElement("button");
    loginButton.id = "loginButton";
    loginButton.innerText = "Login";

    let registerButton = document.createElement("button");
    registerButton.id = "registerButton";
    registerButton.innerText = "Register";

    lrButtonBar.appendChild(loginButton);
    lrButtonBar.appendChild(registerButton);
    parentNode.appendChild(lrButtonBar)
}

window.onload = function() {
    let root = document.getElementById('root');
    root.innerHTML = "";

    navBar();
    fakeForm();
    navBar()
};