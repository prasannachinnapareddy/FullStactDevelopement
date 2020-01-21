class Parent
{
    constructor(a,b)
    {
        this.a=a;
        this.b=b;
    }
}
class Child extends Parent
{
    mul()
    {
        console.log('The Product is :' +(this.a*this.b));
    }
}
var obj=new Child(2,3);
obj.mul();