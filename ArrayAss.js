const soaps=[`santoor`,`life boy`,`mysore sandel`,`NO1`];
const arr = Array.isArray(soaps);
console.log(arr);

const include = soaps.includes(`santoor`);
console.log(include);

const include1 = soaps.includes(`santoor`,3);
console.log(include1);

const len = soaps.push(`lux`,`medimix`);
console.log(soaps);
console.log(len);

const str = soaps.pop();
console.log(soaps);
console.log(str);

const len1 = soaps.unshift(`rexona`,`dettol`);
console.log(len1);


const str1 = soaps.shift();
console.log(str1);

soaps.splice(1,2,`cinthol`,`dow`);
console.log(soaps);

const str3 = soaps.slice(2,4);
console.log(soaps);
console.log(str3);

const index = soaps.indexOf(`dow`,1)
console.log(index);


console.log(soaps.join(`-`));
console.log(`-----------------------------`);

let str4 = `hello world`;
str4 = str4.toUpperCase();
console.log(str4);

let str5 = `LOKESH`;
console.log(str5.toLowerCase());

console.log(str5.charAt(2));

console.log(str5.indexOf(`K`,1));

let str6 = ` lokesh kumar`;
console.log(str5.concat(str6));

console.log(str6.split(`h`,2));

console.log(str6.includes(`ke`,3));

console.log(str6.replace(`ke`,`kee`));

let str7 = `   lokesh    `;
console.log(str7.trim());

console.log(str7.search(`ku`));

console.log(str7.substr(0,6));
console.log(`========================`);

const bikes=[`pulser`,`royal enfield`,`R15`];
const arr1 = Array.isArray(bikes);
console.log(arr1);

const include2 = bikes.includes(`pulser`);
console.log(include2);

const include3 = bikes.includes(`R15`,1);
console.log(include3);

const size = bikes.push(`splender`,`unicorn`);
console.log(bikes);
console.log(size);

const word = bikes.pop();
console.log(word);
console.log(bikes);

const size1 = bikes.unshift(`cd100`,`rx100`);
console.log(size1);


const word1 = bikes.shift();
console.log(word1);

bikes.splice(1,2,`passion plus`,`passion pro`);
console.log(bikes);

const word3 = bikes.slice(2,4);
console.log(bikes);
console.log(word3);

const index1 = bikes.indexOf(`dow`,1)
console.log(index1);


console.log(bikes.join(`-`));
console.log(`-----------------------------`);

let word4= `jspiders qspiders`;
word4 = word4.toUpperCase();
console.log(word4);

let word5 = `TEST YANTRA`;
console.log(word.toLowerCase());

console.log(word5.charAt(2));

console.log(word5.indexOf(`K`,1));

let word6 = ` naveen kumar`;
console.log(word5.concat(word6));

console.log(word6.split(`h`,2));

console.log(word6.includes(`ke`,3));

console.log(word6.replace(`ke`,`kee`));

let word7 = `   Naveen    `;
console.log(word7.trim());

console.log(word7.search(`ku`));

console.log(word7.substr(0,6));
console.log(`========================`);



const items = [{
    name:`ear ring`,
    id:1,
    price:500
},
{
    name:`kajal`,
    id:2,
    price:1000
},
{
    name:`trimmer`,
    id:3,
    price:3000
},
{
    name:`setwet`,
    id:4,
    price:500
}
];
    
const items1 = items.map(function(item1,index){
       item1.price = item1.price + 300;
       return item1;  
  
});

console.log(items1);


/* items.map((value)=>{
    value.price = value.price + 30
    return value;
}) */



const items3 = items.filter(function(item,index){

    if(item.price>1000){
        return true
    }else{
        return false
    }
}
);

/* const items4 = items.filter((item)=>item.price>1000) */
console.log(items3);














