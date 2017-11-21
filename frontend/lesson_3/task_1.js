'use strict';

const userData = ['Male', 'Ivan', 'Ivanov', 'Omsk', 'Russia', 19, 'Batman', 'Iron Man', 'Scrubs'];
//REVU Only lastName, name, age and films are needed
const [gender, name, lastName, city, country, age = "Unknown age", ...favoriteFilms] = userData;

let userName = name;
let userLastName = lastName;
let userAge = age;
let userFavoriteFilms = favoriteFilms;

console.log(userName, userLastName, userAge, userFavoriteFilms);


