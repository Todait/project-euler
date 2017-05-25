import fs from 'fs';
import words from './words';
import { range } from './lib/euler';

const wordsValue = {
    A: 1,
    B: 2,
    C: 3,
    D: 4,
    E: 5,
    F: 6,
    G: 7,
    H: 8,
    I: 9,
    J: 10,
    K: 11,
    L: 12,
    M: 13,
    N: 14, 
    O: 15,
    P: 16,
    Q: 17,
    R: 18,
    S: 19,
    T: 20,
    U: 21,
    V: 22,
    W: 23,
    X: 24,
    Y: 25,
    Z: 26
};

export const wordToSumValue = (word) => Array.from(word).reduce((pre, w) => pre + wordsValue[w], 0);

export const isTriNumber = (number) => parseInt(Math.sqrt(8 * number + 1)) * parseInt(Math.sqrt(8 * number + 1)) === 8 * number + 1;
// export const isTriNumber = (number) => range(1, 351).find(i => (i * (i+1)) / 2 == number ) > -1;

export const answer = () => words.filter( word => isTriNumber(wordToSumValue(word))).length;