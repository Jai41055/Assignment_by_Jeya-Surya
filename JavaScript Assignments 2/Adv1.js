// A function to check a number is even or odd
isEven = x => x%2 == 0 ? true : false;

// replica of find function with recursion
// return the element which satisfies the condition
// if no element satify returns -1
function find(x,fun){
	if(x.length == 0 )
  {
  	return -1;
  }
  if(fun(x[0]))
  	return x[0];
  else{
  	return find(x.slice(1),fun);
  }  
}
console.log(find([1, 3, 5, 4, 2], isEven));
