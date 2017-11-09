var readlineSync = require('readline-sync');
console.log("Hello World");


while (true) {
    input = readlineSync.prompt();
    console.log('-- You said "' + input + '"');
    if (input === 'bye') {
      break;
    }
};



/*
var test = new Array(new Array(' 1', ' 2',' 3'), new Array(' 4', ' 5',' 6'),new Array(' 7', ' 8',' 9'));
var test2 = create();

var str = '';

for(var i = 0; i < test.length; i++){
    for(var j = 0; j < test[i].length; j++){
        str += test[i][j] + ", ";
    }
    str += "\r\n";
}
console.log(str);


for(var i = 0; i < test.length; i++){
    for(var j = 0; j < test[i].length; j++){
        if(i===1 && j===1){
            test[i][j]='R';
        }
    }
}
for(var i = 0; i < test.length; i++){
    for(var j = 0; j < test[i].length; j++){
        str += test[i][j] + ", ";
    }
    str += "\r\n";
}
console.log(str);


function print(table){
    for(var i = 0; i < 3; i++)
        console.log(table ) };

function create(){
    return new Array(new Array(3), new Array(3),new Array(3));
}*/