'use strict';

//ex.1
console.log("---------Exercise_1---------");
//REVU empty array is acceptable as a default value
function print(array = [0,1,2,3], separator = '-'){
    //REVU Array.prototype.join
    let elementsArray =" ";
    for (var index = 0; index < array.length; index++){
        if(index===(array.length-1))
             elementsArray+=array[index];
        else elementsArray += array[index] + separator;
    }
    return elementsArray;
};

console.log(print());
console.log(print([1, 2, 3]));
console.log(print([1, 2, 3], ','));

//ex.2
console.log("---------Exercise_2---------");
function printMessage(message, date = getTimeCall()){
    let result;
    try {
        //REVU if (!message) { ... }
        if(message===null || message===undefined)
            throw new SyntaxError("");
        else result = message;
    } catch (error) {
        //REVU Do you really need try-catch here?
        throw new SyntaxError("You didn't note message in method printMessage()"+ error);
    }
    return '['+date+']'+result;
};

let getTimeCall = () => {
  let date = new Date();
  return date.getHours() + ':' + date.getMinutes() + ':' + date.getSeconds();
};

//REVU printMessage("test message") and printMessage("test message", new Date()) should return the same message format
console.log(printMessage("test message"));

//ex.3
console.log("---------Exercise_3----------");
function exclude(array=[], ...del){
    //REVU Use Array.prototype.filter + Array.prototype.includes instead
    for (let index = 0; index < del.length; index++) {
        for (let jndex = 0; jndex < array.length; jndex++) {
            if(array[jndex]===del[index])
                delete array[jndex];
        }   
    }
    return array.filter(value => value!==undefined);
};
console.log(exclude([0,1,2,3],1,2));

//Ex.4
console.log("---------Exercise_4----------");
const user = {
    name: 'Ivan',
    age: 18
};
function printUser({name = 'unknown', age : years = "unknown"} = {}) {
	console.log(name, years);
}
printUser(user);
printUser({ name: 'Ivan' });
printUser({ age: 19 });
printUser({});
printUser();