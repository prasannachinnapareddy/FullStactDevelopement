class Hello
{
    constructor(fname,lname,age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }
    fullname()
    {
        return this.fn+ '' +this.ln;
    }
}
let hello=new Hello('prasanna','SVVL',22);
console.log('Full Name is :' +hello.fullname());