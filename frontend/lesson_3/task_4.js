'use strict';

class Animale{
    constructor(name, color){
        this._name = name;
        this.color = color;
        this._energy = 0;
    }

    get getName() {
        return this._name;
    }
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
        if(numberEnergy > 100)
            console.log("Number's energy is excess!");
        else this._energy += numberEnergy;
    }

    say(message){
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
        if(super.getEnergy < 100)
            console.log("I want more");
        else if(super.getEnergy===100) console.log("I ate :) ");
    }

    say(message){
        return super.say(message);
    }

    catchMouse(){
        super.say("Bye,bye I came to catch mouses");
    }
    
}

class British extends Cat{
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

const s = new Pitbul('s', 'a');
console.log(s.guard());





