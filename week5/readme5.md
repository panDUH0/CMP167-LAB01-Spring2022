#Loops:It is a block of code that repeats itself. Counted or Definite loop, and indefinite loops
#Iteration: a repetition, one complete cycle
# While Loop
## Syntax:
while (Condition){
if you have multiple statements you need curley brackets.
}

## semantics:
- Evaluate the condition
-If condition is true: Execute inner statement and repeat step 1
-If condition is false: End the Loop

## Sentinel Value
- Sentinel Value is a value the while loop is always keeping an eye for, if the Sentinel     Value is given then at the next iteration the loop will end

## Example
while (n != -1) {
 statements
 n = input
 }
## true
- it will run forever until there is a breaking condition inside

## Example
 while( true) {
 Statements
 if(condition){
 break;
 }
   }

## flag
- a boolean variable that will is first set to true, and there is a condition inside the loop that will change the value this flag

## Example
while(flag){
     statements
if(condition){
flag = false;
  }
}
## Incrementing 
- this while loop has a condition that will that will change as the variable inside(counter) will change every iteration
##Example
while(n < 1000) {
statements

n++;// n = + 1, or n +=1, to increase by 5 n+=5
}

# Do While Loop
- This loop will at least repeat once without checking the condition.

##Syntax:
do {
statements
   } while(condition);

# Semantics:
- Execute inner statements
- check the while condition
- if condition is true, go to step 1
- if condition is false, end the loop


# For Loop
## Syntax:
for (starts; stop; step) {// only need curley brackets if multiple statements
    statements
}

start: initialization code, assignment code, a variable, etc...
stop: condition, if condition is false, the Loop will stop
step: incrementing code

## Semantics
- 1. run start code once
- 2. check stop condition
- 3. if condition is true execute inner statements, and then go to step code.
- 4. if condition is false end the loop.
## Example using accumulator pattern
int sum = 0;
for (int i = 1; i <= 10; i++) {
sum = sum + i;// or sum += i
}
// 1 + 2 = 3 + 3 = 6 + 4 = 10 + 5 = 15 + 6 = 21 + 7 = 28 + 8 = 36 + 9 = 45 + 10 = 55
# For Each Loop

String [] names = {"Maria", "Azis", "Galin"};
for (String tempName : names ) {
System.out.println(tempName);
}