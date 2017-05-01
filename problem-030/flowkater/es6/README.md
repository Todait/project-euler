## ES6 Project-Euler Skeleton Project

- ES2015 (ES6)
- JEST (test framework)

https://facebook.github.io/jest/

```
yarn add babel babel-jest babel-loader babel-preset-es2015 jest
touch .babelrc
```

.babelrc
```
{
  "presets": ["es2015"]
}
```

package.json
```
"scripts": {
    "test": "jest",
    "watch-test": "jest --watchAll"
}
```

```
mkdir src
mkdir src/test
touch src/example.js
touch src/test/example.test.js
```

```
yarn test 
```

```
yarn watch-test
```
