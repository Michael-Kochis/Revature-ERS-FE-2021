// import {sayHi} from './sayHi'

function fakeForm() {
    let root = document.getElementById('root');
    let fakeForm = document.createElement('div');
    fakeForm.id = "fakeForm";

    setTextField("username", fakeForm);
    setPassField(fakeForm);
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

function setPassField(parentNode) {
    let passLabel = document.createElement('label');
    passLabel.innerText = "password"

    let passField = document.createElement('input');
    passField.type = "password";
    passField.id = "password";
    passField.defaultValue = "password";

    parentNode.appendChild(passLabel);
    parentNode.appendChild(passField);
}

function setTextField(name, parentNode) {
    let textLabel = document.createElement('label');
    textLabel.innerText = name;

    let textField = document.createElement('input');
    textField.type = "text";
    textField.id = name;
    textField.defaultValue = name;

    parentNode.appendChild(textLabel);
    parentNode.appendChild(textField);
}

window.onload = function() {
    let root = document.getElementById('root');
    root.innerHTML = "";

    navBar();
    fakeForm();
    navBar()
};