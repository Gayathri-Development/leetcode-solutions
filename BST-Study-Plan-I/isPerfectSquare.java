/***
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 
Example 1:

Input: num = 16
Output: true

Example 2:

Input: num = 14
Output: false

***/
class Solution {
    public boolean isPerfectSquare(int num) {
        

// Solution - 1

        long left = 0, right = num, middle = 0, numSquare = 0;
        
        while (left <= right){
            middle = left + (right - left) / 2;
            numSquare = middle * middle;
        
            if (numSquare == num)
                return true;
            else if (numSquare < num)
                left = middle + 1;
            else 
                right = middle - 1;
        }
        return false;


/***
Solution - 2 

        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
***/

/***
Solution - 3

    for (int i = 0; i * i >= 0 && i * i <= num; i ++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
***/
        
        
        
    }
}
