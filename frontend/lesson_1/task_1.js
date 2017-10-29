var readlineSync = require('readline-sync');
console.log("Игра крестики нолики");
console.log("Игра "+"крестики "+"нолики");

var userName;
var matrix = [];
var statusElementMatrix = {
    e : '#',
    x : 'x',
    o : 'o'
};

userName = readlineSync.question('Enter your name: ');
    console.log('Hi ' + userName + '!');




matrix = createArray(3, 3);
console.log("\r\n");
console.log(print(matrix));


function createArray (row, col){
    for(var i = 0; i < row; i++){
        matrix[i] = new Array(3);
        for(var j = 0; j < col; j++)
            matrix[i] = statusElementMatrix.e;
    }
    return matrix;    
};

function print(matrix){
    for(var i = 0; i < matrix.length; i++)
            console.log(matrix);
};
