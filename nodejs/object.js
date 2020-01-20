
var roles={
    type:'admin',
    function()
    {
        console.log(this.type);
    }
}
var role1=Object.create(roles);
role1.function();
var role2=Object.create(roles);
role2.type="user";
role2.function();
var o1 = { a: 10 }; 
var o2 = { b: 20 }; 
var o3 = { c: 30 }; 
var obj = Object.assign(o1, o2, o3); 
console.log(obj);  
console.log(o3);

