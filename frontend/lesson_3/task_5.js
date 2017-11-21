'use strict';
const readline = require('readline');

let set = new Set();

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter number: ', (number) => {
    //REVU use Number.isNaN()  instead
    if (number != +number){
        rl.close(); throw new Error("Chars aren't valide");
    }
    else{
        set.add(number);
        rl.question('Enter number: ', (number) => {
            if (number != +number){
                //REVU log error message and stop the programm correctly
                rl.close(); throw new Error("Chars aren't valide");
            }
            else{
            set.add(number);
            rl.question('Enter number: ', (number) => {
                if (number != +number){
                    rl.close(); throw new Error("Chars aren't valide");
                }
                else{
                set.add(number);
                rl.question('Enter number: ', (number) => {
                    if (number != +number){
                        rl.close(); throw new Error("Chars aren't valide");
                    }
                    else{
                    set.add(number);
                    rl.question('Enter number: ', (number) => {
                        if (number != +number){
                            rl.close(); throw new Error("Chars aren't valide");
                        }
                        else{
                        set.add(number);
                        rl.question('Enter number: ', (number) => {
                            if (number != +number){
                                rl.close(); throw new Error("Chars aren't valide");
                            }
                            else{
                            set.add(number);
                            rl.question('Enter number: ', (number) => {
                                if (number != +number){
                                    rl.close(); throw new Error("Chars aren't valide");
                                }
                                else{
                                set.add(number);
                                rl.question('Enter number: ', (number) => {
                                    if (number != +number){
                                        rl.close(); throw new Error("Chars aren't valide");
                                    }
                                    else{
                                    set.add(number);
                                    rl.question('Enter number: ', (number) => {
                                        if (number != +number){
                                            rl.close(); throw new Error("Chars aren't valide");
                                        }
                                        else{
                                        set.add(number);
                                        rl.question('Enter number: ', (number) => {
                                            if (number != +number){
                                                rl.close(); throw new Error("Chars aren't valide");
                                            }
                                            else{
                                            set.add(number);
                                                maxValue(set);
                                            rl.close();
                                            }
                                        });
                                        }
                                    });
                                    }
                                });
                                }
                            });
                            }
                        });
                        }
                    });
                    }
                });
                }
            });
            }
        });
        }
    });


function maxValue(set){
    //REVU Math.max(...set)
    let array = [];
    for (let v of set) {
        array.push(v)
    }
    console.log("Max element: "+Math.max(...array));
};

//let recursiveAsyncReadLine = function() {
//   rl.question('Command: ', function (answer) {
//        if (answer !== +answer) //we need some base case, for recursion
//            return rl.close(); //closing RL and returning from function.
//        set.add(answer);
//            console.log('Got it!"');
//        recursiveAsyncReadLine(); //Calling this function again to ask new question
//    });

//};
//recursiveAsyncReadLine();