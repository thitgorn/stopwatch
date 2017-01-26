# Stopwatch tasks by Thitiwat Thongbor (5910546384)

I ran this from macbook pro (Retina, 15-inch, Mid 2015) and I got this result.

Append 50,000 chars to String
final string length = 50000
Elapsed time 0.980294 sec

Append 100,000 chars to String
final string length = 100000
Elapsed time 2.741679 sec

Append 100,000 chars to StringBuilder
final string length = 100000
Elapsed time 0.002900 sec

Sum array of double primitives with count=1,000,000,000
sum = 2.500005E14
Elapsed time 0.917755 sec

Sum array of Double objects with count=1,000,000,000
sum = 2.500005E14
Elapsed time 4.064168 sec

Sum array of BigDecimal with count=1,000,000,000
sum = 250000500000000
Elapsed time 7.175902 sec


//TODO Explain later when I have time.
##Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars?
##Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
##Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
