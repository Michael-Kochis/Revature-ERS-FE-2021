// import {sayHi} from './sayHi'

function sayHi(user) {
    return ("Hello " + user);
}

window.onload = function() {

    let root = document.getElementById('root');
    root.innerHTML = sayHi('World!');
};