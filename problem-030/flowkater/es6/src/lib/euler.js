export const powOfDigits = (n, e) => {
    let s = 0;
    while(n > 0){
        s = s + (n % 10)**e;
        n = parseInt(n / 10)
    }
    return s;
};

export const range = (start, end) => Array.from({length: (end - start)}, (v, k) => k + start);