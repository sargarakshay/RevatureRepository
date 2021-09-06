"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Team = void 0;
var Team = /** @class */ (function () {
    function Team() {
    }
    Object.defineProperty(Team.prototype, "teamId", {
        get: function () {
            return this._teamId;
        },
        set: function (teamId) {
            this._teamId = teamId;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Team.prototype, "teamName", {
        get: function () {
            return this._teamName;
        },
        set: function (teamName) {
            this._teamName = teamName;
        },
        enumerable: false,
        configurable: true
    });
    return Team;
}());
exports.Team = Team;
