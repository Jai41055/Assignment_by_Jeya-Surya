class Rectangle{
	constructor(width,height)
  {
  	this.width=width;
    this.height=height;
    this.hieght=height*10;
  }
  getArea()
  {
  	return this.width*this.height;
  }
}
const rec1=new Rectangle(4,5);
//wrong data feild is called in the question
console.log(rec1.hieght);
// the data feild having height is height not hieght
console.log(rec1.height);
console.log(rec1.getArea());
