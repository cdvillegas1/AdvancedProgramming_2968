"use strict";
"use Math"

function f(x) {
    return Math.sqrt(1.0 + Math.cos(x));
}

function IntSimpson() {
    var lowerLimit = Number(document.getElementById('a').value);
    var upperLimit = Number(document.getElementById('b').value);
    var n = Number(document.getElementById('n').value);

    var deltaX;
    var accumulator = 0;
    var i = 1;

    deltaX = (upperLimit - lowerLimit) / n;

    accumulator += f(lowerLimit);

    for (var increase = lowerLimit + deltaX; increase < upperLimit; increase += deltaX, i++) {
        if (i % 2 != 0) {
            accumulator += 4 * f(increase);
        } else {
            accumulator += 2 * f(increase);
        }
    }

    accumulator += f(upperLimit);

    document.getElementById('result').innerHTML = deltaX * (1.0 / 3) * accumulator;

    return true;
}

document.getElementById('go').addEventListener('click', IntSimpson);