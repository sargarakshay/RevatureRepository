"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Person = void 0;
var Person = /** @class */ (function () {
    function Person() {
    }
    Object.defineProperty(Person.prototype, "personId", {
        get: function () {
            return this._personId;
        },
        set: function (personId) {
            this._personId = personId;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "personName", {
        get: function () {
            return this._personName;
        },
        set: function (personName) {
            this._personName = personName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "personAge", {
        get: function () {
            return this._personAge;
        },
        set: function (personAge) {
            this._personAge = personAge;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Person.prototype, "personCity", {
        get: function () {
            return this._personCity;
        },
        set: function (personCity) {
            this._personCity = personCity;
        },
        enumerable: false,
        configurable: true
    });
    return Person;
}());
exports.Person = Person;
