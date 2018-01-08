'use strict';

let mapCategories = new Map();
let newLi = document.createElement('li');
let selectedOptionText;
const addButton = document.getElementById('add-task');
const categoryTagSelect = document.getElementById('categories');

document.addEventListener("DOMContentLoaded", function(event) {
    console.log("DOM fully loaded and parsed");
    createOptions(mapCategories);
});

function createOptions(mapCategories){
  mapCategories = setMapCategories(mapCategories);
  for (var [key, value] of mapCategories) {
    var tagOption = document.createElement("option");
    tagOption.appendChild(document.createTextNode(value));
    tagOption.setAttribute("value", key);
    categoryTagSelect.appendChild(tagOption);
  }
};

function getTimeCreate () {
    let date = new Date();
    return date.getFullYear()+'-'+date.getMonth()+'-'+date.getDay()+' '+date.getHours()+':'+date.getMinutes();
};

let setTime = sel => {  
    document.getElementById(sel).innerText = getTimeCreate; 
};


/*
Get array parameters 
of new task (name's task, date, date, date, category's task)
*/
function getValuesAddedTask(){
    let array = [];
    var list = document.getElementsByClassName("form-task__field");
    for (var i = 0; i < list.length; i++) {
        array.push(list[i].value);
    }
    return array;    
};

function newTaskUser(){
    let newLi =  document.createElement("li");
    newLi.className = "infcard-task";
    var textnode = document.createTextNode("Water");
    newLi.appendChild(textnode);

    var list = document.getElementById("ltask");
    list.insertBefore(newLi, list.childNodes[0]);
};

function removeTaskUser(){


};

addButton.addEventListener('click', function(e){
    document.getElementById('date-create').value = getTimeCreate();
    selectedOptionText = getTextCurrentOption(categoryTagSelect);
    
    //newTaskUser();
});


function getTextCurrentOption(categorySelect){
  let textOption;

  if (categorySelect.selectedIndex != -1){
    textOption = categorySelect.options[categorySelect.selectedIndex].text;
  }
  return textOption;
};

function setMapCategories(mapCategories){
    mapCategories.set(1, "Study");
    mapCategories.set(2, "Home");
    mapCategories.set(3, "Job");

    return mapCategories;
};



