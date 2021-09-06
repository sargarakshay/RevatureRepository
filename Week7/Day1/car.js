"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(name, model, manufacturer) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
    }
    Car.prototype.getCarDetails = function () {
        console.log("Name : " + this.name);
        console.log("Version : " + this.model);
        console.log("Manufacturer : " + this.manufacturer);
    };
    return Car;
}());
exports.Car = Car;
