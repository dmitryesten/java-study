'use strict';

let mapCategories = new Map();
mapCategories.set(1, "Study");
mapCategories.set(2, "Home");
mapCategories.set(3, "Job");

let newTaskLi = document.createElement('li');
let selectedOptionText;
const addButton = document.getElementById('add-task');
const categoryTagSelect = document.getElementById('categories');

document.addEventListener("DOMContentLoaded", function(event) {
    console.log("DOM fully loaded and parsed");

   createOptions(mapCategories);
   
  });

function createOptions(){
    for (var [key, value] of mapCategories) {
        var oOption = document.createElement("option");
        oOption.appendChild(document.createTextNode(value));
        oOption.setAttribute("value", key);
        categoryTagSelect.appendChild(oOption);
    }
}

function getTimeCreate () {
    let date = new Date();
    return date.getFullYear()+'-'+date.getMonth()+'-'+date.getDay()+' '+date.getHours()+':'+date.getMinutes();
};

let setTime = sel => {  
    document.getElementById(sel).innerText = getTimeCreate; 
}

//Get array parameters of new task (name's task, date, date, date, category's task)
function getValuesAddedTask(){
    let array = [];
    var list = document.getElementsByClassName("form-task__field");
    for (var i = 0; i < list.length; i++) {
        array.push(list[i].value);
    }
    return array;    
}

addButton.addEventListener('click', function(e){
    document.getElementById('date-create').value = getTimeCreate();
    selectedOptionText = getTextCurrentOption(categoryTagSelect);

    let listTask = document.getElementById('ltask');
    newTaskLi.innerHTML = Math.random();
    listTask.insertBefore(newTaskLi, listTask.firstChild);
    newTaskLi.innerHTML = Math.random();
    listTask.insertBefore(newTaskLi, listTask.firstChild);
  
});


function getTextCurrentOption(categorySelect){
    let textOption;
    if ( categorySelect.selectedIndex != -1){
      textOption = categorySelect.options[categorySelect.selectedIndex].text;
    }
    return textOption;
};



