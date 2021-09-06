"use strict";
exports.__esModule = true;
exports.TSClass = void 0;
var car_1 = require("./car");
console.log("Hello, This is the first TypeScripts file.");
function firstTSFunction() {
    console.log("Hello from firstTSFunction() function.");
}
var TSClass = /** @class */ (function () {
    function TSClass() {
        console.log("Hello from constructor.");
    }
    TSClass.prototype.secondTSFunction = function () {
        console.log("Hello from secondTSFunction()");
    };
    return TSClass;
}());
exports.TSClass = TSClass;
var a = new TSClass();
a.secondTSFunction();
var car = new car_1.Car("Audi 8", 2, "INDIA");
car.getCarDetails();
