export class Person {
    private _personId:number;
    private _personName:string;
    private _personAge:number;
    private _personCity:string;

    constructor() {
    }

    public get personId():number {
        return this._personId;
    }

    public set personId(personId:number) {
        this._personId = personId;
    }

    public get personName():string {
        return this._personName;
    }

    public set personName(personName:string) {
        this._personName = personName;
    }

    public get personAge():number {
        return this._personAge;
    }

    public set personAge(personAge:number) {
        this._personAge = personAge;
    }

    public get personCity():string {
        return this._personCity;
    }

    public set personCity(personCity:string) {
        this._personCity = personCity;
    }
}