console.log('Hello from ts-demo!');
// implicitely assigns myVar to a type String
let myVar = 'myVar';
// can't reassign a string to a boolean
// myVar = true;
console.log(myVar);
// explicitely declaring a type
let myNum = 5;
var colors;
(function (colors) {
    colors[colors["BLUE"] = 0] = "BLUE";
    colors[colors["GREEN"] = 1] = "GREEN";
    colors[colors["PURPLE"] = 2] = "PURPLE";
})(colors || (colors = {}));
let myEnum = colors[colors.PURPLE];
console.log(myEnum);
class myClass {
    constructor(someNum) {
        this._myNumber = someNum;
    }
    get myNum() {
        return this._myNumber;
    }
}
