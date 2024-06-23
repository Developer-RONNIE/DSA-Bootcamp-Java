### Algorithm 
- Step 1: Start
- Step 2: Input year
- Step 3: go to Step 5
- Step 4: If (year%4 == 0 AND year%100! = 0) OR (year%400 == 0) then go to Step 4 else
- Step 5:  Print "Leap year"  ( if true )
- Step 6: Print "Not a leap year"   ( if false )
- Step 7: Stop




### Explaination
We generalize that a year has 365 days (It takes the earth 365 days to revolve around the sun) but in reality it takes the earth approximately 365.2425 days to revolve around the sun.

As you noticed, there is an extra 0.2425 of a day taken to revolve around the sun, so, to compensate that extra 0.2425 we add an extra day every fourth year and we call it the leap year. But even that is not accurate because that would be over compensating it. 0.2425 x 4 = 0.97 which is not equal to 1 full day.

This means that every 400 years should exactly have 97 leap years and not 100. To adjust this over compensation we make sure that all the century years should be divisible by 400 to be leap years making the tally of total number of leap years in 400 years = 97.