'use strict';

class Animale{
    constructor(name, color){
        this._name = name;
        this.color = color;
        this._energy = 0;
    }

    //REVU getter name should mach the property name
    get getName() {
        return this._name;
    }
    //REVU setter name should mach the property name
    //REVY Why are you using [this._name] instead of this._name. Do you expect destructuring here?
    set setName(valueName) {
        [this._name] = valueName;
    }

    get getColor() {
        return this.color;
    }
    set setColor(valueColor) {
        [this.color] = valueColor;
    }

    get getEnergy() {
        return this._energy;
    }
    
    eat(numberEnergy){
        //100 is max value of this._energy, not the max value of food energy
        if(numberEnergy > 100)
            console.log("Number's energy is excess!");
        else this._energy += numberEnergy;
    }

    say(message){
        //REVU this method should display message
        return this._name + " say: " +message;
    }
}

const animale = new Animale("Cats", "silver-tabby");
animale.eat(40)
console.log("Give meal "+animale.getEnergy);
console.log("Something calling..."+animale.say("Mya, Mya!")); 


class Cat extends Animale{
    constructor(name, color){
        super(name, color);
        this._energy = 50;
    }

    eat(numberEnergy){
        super.eat(numberEnergy);
        //REVU whн not this.getEnergy ?
        if(super.getEnergy < 100)
            console.log("I want more");
        else if(super.getEnergy===100) console.log("I ate :) ");
    }

    say(message){
        //It should add Meow to the each message
        return super.say(message);
    }

    catchMouse(){
        super.say("Bye,bye I came to catch mouses");
    }
    
}

class British extends Cat{
    //REVU constructor is useless
    constructor(name, color){
        super(name, color);
    }
    catchMouse(){
        super.say("Im very very lazy");
    }
}

console.log("-------CATS----------");
const musia = new Cat("Musia");
console.log(musia.say('Mya #%@!'));
musia.eat(50);
console.log(musia.getEnergy + " "+ musia.catchMouse());

const british = new British("Lord", "red-gold");
console.log(british.catchMouse());

console.log("-------DOGS----------");

class Dog extends Animale{
    constructor(name, color){
        super(name, color);
        this._energy = 75;
    }
    
    eat(numberEnergy){
        super.eat(numberEnergy);
        if(super.getEnergy < 100)
            console.log("Im hungry, but I thakful you of something");
        else if(super.getEnergy===100) console.log("I ate :) ");
    }

    say(message){
        return super.say(message);
    }

    guard(){
        super.say("You are protected");
    }
    
}

class Pitbul extends Dog{
    constructor(name, color){
        super(name, color);
    }
    guard(){
        return super.say("You are protected like never before");
    }
}

//REVU s is a bad name for variable
const s = new Pitbul('s', 'a');
console.log(s.guard());





