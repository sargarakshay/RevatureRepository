export class Car {
    private name:string;
    private model:number;
    private manufacturer:string;

    constructor(name:string, model:number, manufacturer:string) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    getCarDetails() {
        console.log("Name : " + this.name);
        console.log("Version : " +this.model);
        console.log("Manufacturer : "+this.manufacturer);
    }
}