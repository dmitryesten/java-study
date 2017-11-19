'use strict';

const [tName, tCreate, tRefresh, tRemove, tCategory] = getValuesAddedTask;
let name = nameTask;
let create = tCreate;
let refresh = tRefresh;
let category = tCategory;


let getTimeCreate = () => {
    let date = new Date();
    return date.getHours() + ':' + date.getMinutes() + ':' + date.getSeconds();
};

let setTime = sel => {  
    document.getElementById(sel).innerText = getTimeCreate; 
}

function getValuesAddedTask(){
    let array = [];
    var list = document.getElementsByClassName("form-task__field");
    for (var i = 0; i < list.length; i++) {
        array.push(list[i].value);
    }
     
    return array;    
}

