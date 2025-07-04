// JavaScript code here
//alert("Welcome to the java script ");
// console.log(123);
// console.log("Example");
// console.log("ok");
// var greeting="Helloee";
// console.log(greeting);
// console.log([1,2,3,4]);
// console.log({a:1,b:2,c:3});

//variables-var, let, const;
// var - ES6 or ES26 in morder we are not using var


// var name="Mani";
// //console.log(name);
// name ="Gourav";
// console.log(name);

// var greeting; //conditional reandering some data
// greeting="hiii";
// console.log(greeting);

//Rules and Convention of variables
//1.letters,numbers,_,$
// var $name="John";
// console.log($name);

// var firstName="Camelcassing";//camelcas
// console.log(firstName);

// var first_name="Underscore";//camelcas
// console.log(first_name);

// var FirstName="Pascal case";//Pascal Case
// console.log(FirstName);

// let firstName="letdemo";//camelcas
// console.log(firstName);

// const name="fixed";
// console.log(name);
// name="change";
//  console.log(name);//error

// const person={
//    name:"John"
// };
// console.log(person.name);
// person.name="Deksha";
// console.log(person.name);

// const numbers = [1, 2, 3, 4, 5];
// numbers.push(6, 7, 8);
// console.log(numbers);


//Data Types in java scripts

//Two types of Datatypes
/*Primitive DataTypes
stored directly in the locations the variables access stord in the stack
1.Number
2.String
3.Null
4.Undefined
5.Boolean
6.Symbol

refferenace data types
accessed by refference
stored by refference heap, and points to locations in memory
1.Array
2.Object
3.Literals
4.Functions
*/
   //String
/*const name = "Manikanta";
console.log(typeof name);
   //Number
  const age = 10.5666;
  console.log(typeof age); 
  //Boolean
const hasSiblings = true
console.log(typeof hasSiblings);
   //Null
  const abc = null;//we are storing the value of nothing
  console.log(typeof abc);
  //Undefined
  let x;
  console.log(typeof x);//if we dont initialise it with a value, then it is undefined
  //Symbol
  const sym = Symbol();
  console.log(typeof sym);


  //Reference Data types
  const hobbies =["movies", "cricket"];
  //object literals
  const person ={
   name:"om",
   age:18,
  };
  console.log(typeof person);
   //Dates
   const today = new Date();
   console.log(today);
   console.log(typeof today);
*/

 /*  //Type Conversions
   let val;
   //Number to string
   val = String(5556);

   //Boolean into string
   val = String(true);

   //Date to string
   val = String(new Date());

   //Array into string
   val = String([1,2,3,4,5])

   //toString()
   val=(5).toString();

   //String to number
   val = Number(5);

   //String to boolean
   val =Number(true);
   val =Number(false);
   val = Number(null);

   console.log(val);
   console.log(typeof val);
   console.log(val.toFixed(2));

   //Type Coehesion
   const val1="5";
   const val2=10;
   const sum = val1 + val2;
   console.log(sum);
   console.log(typeof sum);
*/

//-------------------------------------------------
//Object Literals
/*
const person ={
    firstname:"Omnateeta",
    age:19,
    email:"omnateeta@gmail.com",
    hobbies:["eat","dance","gym"],
    address:{
        street:"123 Main St",
        city:"New York",
        state:"NY",
    },
    getBirthYear: function () {
        return 2025-this.age;
    },
};
let val;
val=person.age;
val=person.firstname;
val=person.address;
val=person.hobbies;
val=person;
console.log(val.getBirthYear());
*/

//Array of objects
/*
const people = [{
    firstName:"Om",
    age:18,
},
{
    firstName:"Gourav",
    age:20,
},
{
    firstName:"bavya",
    age:20,
}
];
for(let i=0;i<people.length;i++)
{
    console.log(people[i].firstName);
}
*/

//Comparisonal and Condition
const id = 100;
/*
if(id==100)//assignment opearator
{
    console.log("Yes the number is 100");
}else{
    console.log("No the id is not 100");
}
*/
/*
if(id!=100)//assignment opearator
{
    console.log("Yes the number is 100");
}else{
    console.log("No the id is not 100");
}
    */
// if(id===100)//assignment opearator
// {
//     console.log("Yes the number is 100");
// }else{
//     console.log("No the id is not 100");
// }  

// if(id !=="undefined")
// {
//     console.log(id);
// }
// else{
//     console.log("No Id");
//     }   

// if(id > 100)
// {
//     console.log("Yes the number is greater than 100");
// }else if(id<100){
//     console.log("Yes the number is less than 100");
// }else{
//     console.log("Yes the number is equal to 100");
// }

//Logical opearotor

//const age = 19;
/*
if(age>0 && age<12)
{
    console.log("He is a child");
}else if(age >13 && age<19)
{
    console.log("He is a teenager");
}
else{
    console.log("He is an adult");
}
    */
// if(age>16|| age<65)
// {
//     console.log("He can  participate");
// }
// else{
//     console.log("He can not participate");
// }

//console.log( id ==100 ? "Yes, correct":"Not.correct");//Ternary opearator

//Loop in java script

//for Loop
// for(let i=0;i<10;i++){
//     console.log(i);
// }
/*
const names = ["ok","BK","LK","Pk"]
for(let i=0;i<names.length;i++)
{
    console.log(names[i]);
}
    */
//while Loop
//    let i = 10;
//    do{
//     i++;
//     console.log(i);
//    }while(i<10)

//const person = { name:"omn",age:"15"};
//for in loop
// for(x in person)
// {
//     console.log(person[x]);
// }

//functiona declaration and expression

//function declaration
// function greet(){
//     return 2006;
// }
// console.log(greet());
// function greet2(firstname){
//     return `hello ${firstname}`
// }
// console.log(greet2('Omnateeat'));

//Function expression

// const mul = function (a,b) {
//     return a*b;
// };
// console.log(mul(2,8));

//Immediatlt invokable function expression (IIFE)
/*
(function(name){
    console.log(name);
})("omn");

const  person = {
    getBirthYear:function (){
        return 2006;
    },
};
console.log(person.getBirthYear());
*/
//Switches - if more then 5 to 6 condition then not preffered to use if else if ladder
/*
const dayOfWeek = new Date().getDay();
let day;
switch (dayOfWeek) {
    case 0:
        console.log('Sunday');
        break;
    case 1:
        console.log('Monday');
        break;
    case 2:
        console.log('Tuesday');
        break;
    case 3:
        console.log('Wednesday');
        break;
    case 4:
        console.log('Thrsday');
        break;
    case 5:
        console.log('Friday');
        break;
    case 6:
        console.log('Saturday');
        break;
    case 7:
        console.log('Sunday');
        break;   
}
        */


//Local Scope and Global Scope
/*
const color = "blue";
function abc(){
    const color = "red";
    console.log(color);
}
abc();
*/

//Var vs let
/*
function start(){
    for(var i=0;i<5;i++)
    {
        if(true){
            let color = "blue";
          console.log(color);  
         }
    }
    
}
start();
*/
/*
var age = 25;
let age1 = 27;
// var -> functional scope
// let and const -->block scope 

*/



   