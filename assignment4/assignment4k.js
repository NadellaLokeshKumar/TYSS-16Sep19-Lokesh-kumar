console.log(`Map and Filter Method`);
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

