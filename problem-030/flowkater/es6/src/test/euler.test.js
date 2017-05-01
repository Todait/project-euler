import * as euler from '../lib/euler';

test('powOfDigits', () => {
    expect(euler.powOfDigits(1634, 4)).toEqual(1634);
    expect(euler.powOfDigits(8208, 4)).toEqual(8208);
    expect(euler.powOfDigits(9474, 4)).toEqual(9474);
});