var array=new Array(10)
for(let i=0;i<array.length;i++)
{
    array[i]=Math.floor(Math.random()*100)
    console.log(array[i])
}
let div=array.filter((x)=>x%2==0 && x%5==0)
let inc=array.map((x)=>parseInt(x*1.1))
console.log("After filtering elements are :" +div)
console.log("After mapping elements are :"+inc)