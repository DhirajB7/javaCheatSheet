># COMMENTS
>```
>SINGLE LINE COMMENTS 
>//i am one line comment
>```
>```
>MULTI LINE COMMENTS 
>/*
>1 line
>2 line
>3 line
>*/
>```
>```
>>DOC TYPE COMMENTS 
>/**
>1 line @param
>2 line @return
>3 line 
>*/
>```

># DATA TYPES 
>> ### PRIMITIVE
>` boolean, char, byte, short, int, long, float, double`
>
>>### NON PRIMITIVE
>`String, Array`
>
>>### COLLECTIONS
>```
>LIST `ArrayList, LinkedList`
>SET INTERFACE `HashSet,LinkedHashSet,TreeSet`
>MAP INTERFACE`HashMap,LinkedHashMap,TreeMap`
>```

># BRANCHING
>>### IF ELSE 
>```
>  if(condition){
>  //code if condition is true
> }else{
> //code if condition is false
>  }
>```
>>
>### Ternary Operator
>`()? : ` 
>
>`Example`
>```
>  System.out.println((2==(1+1):"YES":"NO"));
>```
>>###  if-else-if ladder
>```
>  if(condition1){
 >//code to be executed if condition1 is true
  >}else  if(condition2){
  >//code to be executed if condition2 is true
  >}
  >else  if(condition3){
  >//code to be executed if condition3 is true
  >}
>  ...
>  else{
>  //code to be executed if all the conditions are false
> }
>```
>>### Nested if
>```
>if(condition){
>// code 1
> if(other condition){
>//code 2
>}
>}
>
>BETTER USE (If only code 2 to be run)
>if(condition && other condition){
>//code 2
>}
>```
>
>>### Switch
>```
>  switch(expression){
>  case value1:
>  //code to be executed;
>  break; //optional
>  case value2:
>  //code to be executed;
>  break; //optional
>  ......
>  default:
>  code to be executed if all cases are not matched;
> }
> ```

># LOOPS
>>### FOR LOOP
>```
> for ( int i = 0 ; i  <10;i++){
> System.out.println(i);
>}
>```
>
>>### WHILE LOOP
>```
>int i = 10;
> while( i<100){
> System.out.println(i);
> i++;
>}
>```
>>### OTHER THINGS
>```
>break; // terminates loop
>continue; // Skip current itr and starts with next itr
>```

>>### COLLECTIONS RELATED
>```
>WILL BE FILLED SOON
>```

>>### CODING CHALLENGE RELATED
>```
>ALGO DS decide
>avoid o(n^2) which are hidden like split(" ")[i] 
>Brute force implantation
>Proper time comp of inbuilt methods
>```
>```
> Do not use split(" ")[i] to iterate over a string---o(n^2)....
> Use like "Dhiraj".String.ValueOf(charAt(i));
> ```
>```
>Java Priority Queue is implemented using Heap Data Structures and Heap has O(log(n)) time complexity to insert and delete element.
>Offer() and add() methods are used to insert the element in the in the priority queue java program.
>Poll() and remove() is used to delete the element from the queue.
>Element retrieval methods i.e. peek() and element(), that are used to retrieve elements from the head of the queue is constant time i.e. O(1).
>contains(Object)method that is used to check if a particular element is present in the queue, have leaner time complexity i.e. O(n).
>```
