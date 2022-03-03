##HELLO!
#String Formatting

##Format specifier
** %c ** for char
** %f ** float and double
** %d ** int
** %b ** byte
** %s ** String
#flags: +0- : + will display the + in front of the data, - left justify,
width: Minimum amount of characters to display within data
precision point: for floating point values: how many decimal places after the point are going to be displayed.
##precision point: for string literals: Maximum amount of characters that you want to display: if data is bgigger, data is going to be truncated.
#Syntax:
"%(flag)(width)(.precision)specifier"
##Example:
("The total is $ %.2f ", 3.4) --> The total is $ 3.40
printf()
System.out.printf("The total is $ %.2f ", 3.4);
 --> The total is $ 3.40
#format()
String message =  String.format("The total is $ %.2f ", 3.4);
System.out.println( message );
--> The total is $ 3.40