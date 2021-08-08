// A function to return square of parameter
square = x => x*x;

// Replica of map function : Operate every element of array with given function and returns new array
function map(x,fun){
	if(x.length == 0 )
  {
  	var ar = [];
    return ar;
    
  }
  
  var ar = map(x.slice(1),fun);
  ar.unshift(fun(x[0]));
  return ar;
}

console.log(map([1, 3, 5, 4, 2], square));

console.log(map([1, 4, 9, 16, 25], Math.sqrt));
