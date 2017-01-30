# Stopwatch tasks by Thitiwat Thongbor (5910546384)

I ran this from macbook pro (Retina, 15-inch, Mid 2015) and I got this result.

##Append 50,000 chars to String
Elapsed time 0.980294 sec

##Append 100,000 chars to String
Elapsed time 2.741679 sec

##Append 100,000 chars to StringBuilder
Elapsed time 0.002900 sec

##Sum array of double primitives with a Billion time.
Elapsed time 0.917755 sec

##Sum array of Double objects with a Billion time.
Elapsed time 4.064168 sec

##Sum array of BigDecimal with a Billion time.
Elapsed time 7.175902 sec


##Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
String is an object that contain arrays char inside, when the operator + is called , eg. result = result + char , the program will create object result and adding char to that object.
So when adding the char on over 50,000 chars , it will create 50,000+ char take more time than creating 50,000-.


##Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
On the StringBuilder, when the method "append" is called , it just add the char to the lastest char in the String instead of creating an new Object.

##Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
Of course, the double is the fastest.
Because double is a primitive type it is not an object, when adding the number it doesn't create the variable in the memory.
Otherwise, Double is an object , it would work in the same way as String.
	Double has some bug in case of memory, so BigDecimal has been introduce.
	Bigdecimal is the object in the same way as Double so it's slower than Double and double.

###primitive > object.
