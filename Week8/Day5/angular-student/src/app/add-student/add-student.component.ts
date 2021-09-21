import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent  {

  student:Student;
  

  constructor(private studentServie:StudentService, private router:Router) { 
    this.student = new Student();
    
  }

  addStudent():void {
    this.studentServie.addStudent(this.student).subscribe(res => {
      this.student = res;
      console.log(res);
      this.student = new Student();
    });
    this.router.navigate(['/viewStudents']);
  }

}
