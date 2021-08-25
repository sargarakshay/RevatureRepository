export class Employee {
    constructor(id, name, contact, gender) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}

export class Gender {
    constructor(code, name) {
        this.code = code;
        this.name = name;
    }
}

export function display(employee) {
    console.log("Employee ID : " + employee.id);
    console.log("Name : " + employee.name);
    console.log("Contact Number : " + employee.contact);
    console.log("Gender : " + employee.gender.name);
}