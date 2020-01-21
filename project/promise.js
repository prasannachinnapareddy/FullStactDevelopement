/*var asynFunction=function()
{
    return new Promise(function(resolve,reject)
    {
        console.log('Keep every promise you make and only make promises that you can kepp');
        setTimeout(reslove,5000);
    })
}
asynFunction()
.then(asynFunction)
.then(asynFunction)*/
const myPromise=new Promise((resolve,reject)=>{
    if(Math.random() *100<=90)
    {
        resolve('HEllo, Promise!');
    }
    reject(new Error('In 10% cases, I fail. Miserably.'));
});
const onResolved=(resolvedValue)=>console.log(resolvedValue);
const onRejected=(error)=>console.log(error);
myPromise.then(onResolved,onRejected);