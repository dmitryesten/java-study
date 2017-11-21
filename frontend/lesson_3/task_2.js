'use strict';

//REVU wrong formatting
const userProfile = {
  gender: 'Male',
  firstName: 'Ivan',
  lastName: 'Ivanov',
  location: {
    city: 'Omsk',
    country: 'Russia' },
  age: 19,
  films: ['Batman', 'Iron Man', 'Scrubs']
};

//REVU wrong formatting
//REVU Expected variables names are name, secondName, age, films, city
const { firstName : userName, 
        lastName : userSurname, 
        age : userAge = "Unknown Age", 
        city : userCity = "Unknown City", 
        films : userFavoriteFilms = [] } = userProfile;

console.log(userName, userSurname, userAge, userCity, userFavoriteFilms);