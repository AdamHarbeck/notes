console.log('Hello from ts-demo!');

// implicitely assigns myVar to a type String
let myVar = 'myVar';

// can't reassign a string to a boolean
// myVar = true;

console.log(myVar);

// explicitely declaring a type
let myNum: number = 5;

enum colors{
    BLUE, GREEN, PURPLE
}

let myEnum: string = colors[colors.PURPLE];

console.log(myEnum);

interface myInterface{
    myVar: string;
}

class myClass implements myInterface{
    myVar: string;
    private _myNumber: number;

    constructor(someNum:number){
        this._myNumber = someNum;
    }

    get myNum(){
        return this._myNumber;
    }
}