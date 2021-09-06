export class Team {
    private _teamId:number;
    private _teamName:string;

    constructor() {
    }

    public get teamId():number {
        return this._teamId;
    }

    public set teamId(teamId:number) {
        this._teamId = teamId;
    }

    public get teamName():string {
        return this._teamName;
    }

    public set teamName(teamName:string) {
        this._teamName = teamName;
    }

}