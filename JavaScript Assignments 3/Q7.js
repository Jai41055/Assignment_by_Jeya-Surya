//Defining a object with 2 property using JSON parse
const person1 = JSON.parse('{"firstName" : "Ram", "lastName" : "Bahadur"}');

//Accessing a undefined properties
console.log("Middle Name : "+person1.middleName);

person1.middleName="Kumar";

//Accessing after defining properties
console.log("Middle Name : "+person1.middleName);

//This property can make the whole code break as it doesn't throw an exception or error when accessing a undefined property
