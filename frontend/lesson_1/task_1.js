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

matrix = create2DArray();

//row = getValue1();
//col = getValue2();
//console.log("set("+ row +";"+col+")" );
matrix = set(row, col, matrix);
console.log(print(matrix));

//start();


function start(){
    var stepUser;
    readlineSync.promptCLLoop({
        set: function(row, col) {
            checkException(row); checkException(col);
        },
        exit: function() { return true; }
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

function getValue1(){
    var value = readlineSync.question('Enter number row: ');
    if(!(+value >= 1 && +value<= 3))
        throw new SyntaxError("Параметр некорректный");
    return parseInt(value);
};

function checkException(x){
    if(!(+x >= 1 && +x<= 3))
        throw new SyntaxError("Параметр некорректный");
    return x;
}


function set(x, y, test){
    var row = minus(x); var col = minus(y);
    if(checkSimbol(row,col, test)===false)
        throw new SyntaxError("Поле уже занято");
    else{
        for(var i = 0; i < test.length; i++){
            for(var j = 0; j < test[i].length; j++){
                if(i===row && j===col){
                    test[i][j]=statusElementMatrix.simbolX;
                }
            }
        }
    }
    return test; 
};

function checkSimbol(x, y, test){
    if(statusElementMatrix.simbolX===test[x][y] || statusElementMatrix.simbolO===test[x][y])    
     return false;
    else true;
}

function minus(value){
    return +value - 1;
}

function isWinner(array){

}
