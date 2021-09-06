"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Player = void 0;
var Person_1 = require("./Person");
var Player = /** @class */ (function (_super) {
    __extends(Player, _super);
    function Player() {
        return _super.call(this) || this;
    }
    Object.defineProperty(Player.prototype, "playerTeam", {
        get: function () {
            return this._playerTeam;
        },
        set: function (playerTeam) {
            this._playerTeam = playerTeam;
        },
        enumerable: false,
        configurable: true
    });
    Player.prototype.getPlayerDetails = function (player) {
        console.log("Player Details");
        console.log("ID    : " + player.personId);
        console.log("Name  : " + player.personName);
        console.log("Age   : " + player.personAge);
        console.log("City  : " + player.personCity);
        console.log("Team  : " + player.playerTeam.teamName + " (Team ID : " + player.playerTeam.teamId + ")");
    };
    return Player;
}(Person_1.Person));
exports.Player = Player;
