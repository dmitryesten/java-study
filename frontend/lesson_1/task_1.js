'use strict';
var readlineSync = require('readline-sync');
printNameGame();


var row, col;
var userName = enterNamePlayer();
var matrix;
var statusElementMatrix = {
    simbolEmpty : ' ',
    simbolX : 'x',
    simbolO : 'o'
};

var User = {
    name : this.userName,
    simbol : statusElementMatrix.simbolX,
    set : function(x, y, matrix){
        var row = minus(x); 
        var col = minus(y);
            for(var i = 0; i < test.length; i++){
                for(var j = 0; j < test[i].length; j++){
                    if(i===row && j===col){
                        test[i][j]=statusElementMatrix.simbolX;
                    }
                }
            }
        return test; 
    }  
};

var PC = {
    name : 'PC',
    simbol : statusElementMatrix.simbolO
};


//row = getValue1();
//col = getValue2();
//console.log("set("+ row +";"+col+")" );
//matrix = set(row, col, matrix);
//console.log(print(matrix));

//start();

matrix = create2DArray();
//step1 
matrix = set(1, 1, matrix);
console.log(print(matrix));
console.log(checkSimbol(1, 1, matrix));
console.log("Ход PC:");
matrix = setPC(matrix);
console.log(print(matrix));


function start(){
    var stepUser;
    
    readlineSync.promptCLLoop({
        set: function(row, col) {
            checkException(row); checkException(col);
            matrix = create2DArray();
            //step1 
            matrix = set(row, col, matrix);
            console.log(print(matrix));
            console.log("Ход PC:");
            matrix = set(getRandomIndexArray(), getRandomIndexArray(), matrix);
            console.log(print(matrix));

        },
        ex: function() { return true; }
      });
      console.log('Exited');
};


function create2DArray(){
        return new Array(new Array(' ', ' ',' '), new Array(' ', ' ',' '),new Array(' ', ' ',' '));
};

function print(matrix){
    var str = '';
    for(var i = 0; i < matrix.length; i++){
        for(var j = 0; j < matrix[i].length; j++){
            str += matrix[i][j] + "_|";
        }
        str += "\r\n";
    } 
    return str; 
};

function printNameGame(){
    console.log("Tik-tok game");
};

function enterNamePlayer(){
    var userName = readlineSync.question('Enter your name: ');
     console.log('Hi ' + userName + '!' + 'your step is first');
     return userName;
};


function checkException(x){
    if(!(+x >= 1 && +x<= 3))
        throw new SyntaxError("Value is not correct");
    return x;
}


function set(x, y, test){
    var row = minus(x); 
    var col = minus(y);
        for(var i = 0; i < test.length; i++){
            for(var j = 0; j < test[i].length; j++){
                if(i===row && j===col){
                    test[i][j]=statusElementMatrix.simbolX;
                }
            }
        }
    return test; 
};

function setPC(test){
    var row = getRandomIndexArray();
    var col = getRandomIndexArray();
    for(var i = 0; i < test.length; i++){
        for(var j = 0; j < test[i].length; j++){
            if(i===row && j===col){
                test[i][j]=statusElementMatrix.simbolO;
            }
        }
    }
    return test; 
};



function checkSimbol(x, y, test){
    for(var i = 0; i < test.length; i++){
        for(var j = 0; j < test[i].length; j++){
            if(i===row && j===col && (statusElementMatrix.simbolX===test[i][j] || statusElementMatrix.simbolO===test[i][j])){   
                return true;
            }
        }
    }
   
};

function minus(value){
    return +value - 1;
};


function getRandomIndexArray(){
    return Math.floor(Math.random() * (2)) + 0;
};


function getArrayEmptyElements(array){
    return array.filter(' ');
};


function isWinner(array){};
