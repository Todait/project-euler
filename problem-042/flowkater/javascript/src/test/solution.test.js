import * as sols from '../solution';

test('wordToSumValue', () => {
    expect(sols.wordToSumValue('SKY')).toBe(55);
    expect(sols.wordToSumValue('NEGOTIATION')).toBe(129);
});

test('isTriNumber', () => {
    expect(sols.isTriNumber(55)).toBe(true);
    expect(sols.isTriNumber(1)).toBe(true);
    expect(sols.isTriNumber(3)).toBe(true);
    expect(sols.isTriNumber(6)).toBe(true);
    expect(sols.isTriNumber(10)).toBe(true);
    expect(sols.isTriNumber(129)).toBe(false);
});

test('answer', () => {
    expect(sols.answer()).toBe(162);
});