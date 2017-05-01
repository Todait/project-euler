import * as sols from '../solution';


describe('각 자릿수를 나눴을때', () => {
    test('numberToArray', () => {
        expect(sols.numberToArray(1)).toEqual([1]);
        expect(sols.numberToArray(123)).toEqual([1,2,3]);
        expect(sols.numberToArray(1634)).toEqual([1,6,3,4]);
        expect(sols.numberToArray(8208)).toEqual([8,2,0,8]);
        expect(sols.numberToArray(9474)).toEqual([9,4,7,4]);
    });
});

describe('제곱 합이 자기자신일때', () => {
    test('powerOfnSum(4)', () => {
        expect(sols.powerOfnSum([1,6,3,4], 4)).toEqual(1634);
        expect(sols.powerOfnSum([8,2,0,8], 4)).toEqual(8208);
        expect(sols.powerOfnSum([9,4,7,4], 4)).toEqual(9474);
    });

    test('powerOfnSum(numberToArray, 4)', () => {
        expect(sols.powerOfnSum(sols.numberToArray(1634), 4)).toEqual(1634);
        expect(sols.powerOfnSum(sols.numberToArray(8208), 4)).toEqual(8208);
        expect(sols.powerOfnSum(sols.numberToArray(9474), 4)).toEqual(9474);
    });

    
});

describe('이제 5제곱으로 답을 찾자', () => {
    test('searchNumbers', () => {
        // expect(sols.searchNumbers(5)).toEqual([4150, 4151, 54748, 92727, 93084, 194979]);
    });

    test('answer', () => {
        expect(sols.answer(5)).toEqual(443839);
    });
});