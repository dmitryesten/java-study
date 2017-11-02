var readlineSync = require('readline-sync');
console.log("Tik-tok play");
console.log("Tik-tok "+"play "+ " ");

var userName;
var matrix = new Array(3);
var statusElementMatrix = {
    e : ' ',
    x : 'x',
    o : 'o'
};

//userName = readlineSync.question('Enter your name: ');
  //  console.log('Hi ' + userName + '!');

matrix = createArray();
    console.log(print(matrix));
    matrix = set(1, 2);
    console.log(matrix);



function start(){
    var stepUser;
    readlineSync.promptLoop(function(input, input2) {
      console.log('-- You said "' + input + '" '+ input2+' sad');
      return input === 'q';
    });
    console.log('It\'s exited from loop.'); };


function createArray (){
    for(var i = 0; i < 3; i++){
        matrix[i] = new Array(3);
        for(var j = 0; j < 3; j++)
            matrix[i] = statusElementMatrix.e;
    }
        return matrix; };

function print(matrix){
    for(var i = 0; i < matrix.length; i++)
            console.log(matrix);    };

function set(x, y){
    if(!(+x >= 1 && +x <= 3) && !(+y >= 1 && +y <= 3))
            throw new SyntaxError("Параметр 'x'or'y' некорректны");
    
    for(var i = 0; i < matrix.length; i++){
        for(var j = 0; j < matrix[i].length; j++){
                matrix[i][j] = statusElementMatrix.x;
        }
    }

    return matrix;
};
