### Defination: 
- HCF : is the Highest Common Factor of any 2 or more number, 
- LCM : is the Least Common Multiple of any 2 or more numbers, 

### Psuedo Code 
- Step 1: Start: The program begins.
- Step 2: Input : Takes the inputs 
- Step 3: Set a temporary value to HCF 
- Step 4: Set Counter: The counter (i) is set to 1.
- Step 5:  for Loop: The program enters a for loop that continues until i is less than or equal to 10.
- Step 6: Calculate: The program calculates the result of ( num1 % i==0 AND num2 % i==0 )
- Step 7: Set HCF: the value of result i is set to HCF 
- Step 8: Print Result: The program prints the result of the HCF
- Step 9: Calculate LCM: The program calculates LCM value by the mathematical rule of finding the LCM via HCF, LCM = (num1*num2)/HCF
- Step 10: Print Result: The program prints the result of the LCM
- Step 11: Stop : The program terminates


### Explanation 

#### HCF (Highest Common Factor)
let's suppose we have two numbers, 75 & 90 
- factors of 75 are: 1, 3, 5, 15, 25, 75 
- factors of 90 are: 1, 2, 3, 5, 6, 9, 10, 15, 18, 30, 45, 90
according to the defination we can clearly see that 15 is the highest common factor which is diving both 75 7 90 
hence. HCF of 75 & 90 = 15 


#### LCM ( Lowest Common Multiple)
let's suppose we have two numbers, 2 & 3
- multiples of 2: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24,..
- multiples of 90: 3, 6, 9, 12, 15, 18, 21, 24,... 
we have common multiples for 2 & 3  such as 6, 12, 18, 24,...
here, the least common multiple is 6 
So, LCM of 2 & 3 is 6 


let's suppose we have two numbers, 2 & 3
- multiples of 75: 75, 150, 225, 300, 375, 450, 525, 600, 675, 750, ....
- multiples of 90: 90, 180, 270, 360, 450, 540, 630, 720, 810, 900....
here, the least common multiple is 450 
So, LCM of 75 & 90 is 450 

#### Mathematical expression to find LCM via HCF 
- LCM = (num1*num2)/HCF


