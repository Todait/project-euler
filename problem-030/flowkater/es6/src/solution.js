import { powOfDigits, range } from './lib/euler'

/*
    5제곱일때,
    최소값 10이상 
    최대값 2**5 + 9**5 + 9**5 + 9**5 + 9**5 
    왜냐하면, 3**5 + 9**5 + 9**5 + 9**5 + 9**5 > '2'36439
    3~9 일때 > '2'ddddd
*/

export const answer = (n) => range(10, 236439).filter((i) =>  i == powOfDigits(i, n)).reduce((a,b) => a + b);


/*
    older
*/

export const numberToArray = (number) => Array.from(number.toString()).map(Number);

export const powerOfnSum = (arr, n) => arr.reduce((a,b) => a + (b ** n), 0);

export const searchNumbers = (n) => range(10, 236439).filter((i) =>  i == powOfDigits(i, n));

// export const searchNumbers = (n) => range(10, 236439).filter((i) =>  i == powerOfnSum(numberToArray(i), n));

// export const answer = (n) => searchNumbers(n).reduce((a,b) => a + b);