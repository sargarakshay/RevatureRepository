import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent{
  student:Student;
  studentUpdateForm:FormGroup;
  studentId = new FormControl(null);

  constructor(private studentServie: StudentService, private router:Router) { 
    this.student = new Student();
    this.studentUpdateForm = new FormGroup({
      'studentName' : new FormControl(null, Validators.required),
      'studentAge' : new FormControl(null, Validators.required),
      'studentCity' : new FormControl(null, Validators.required),
      'studentGender' : new FormControl(null, Validators.required),
      'studentAvatar' : new FormControl(null, Validators.required)
    });
  }

  getStudentById() {
    this.studentServie.getStudentById(this.studentId.value).subscribe(res => {
      this.student = res;
    })

    this.studentUpdateForm.patchValue({
      'studentName' : this.student.studentName,
      'studentAge' : this.student.studentAge,
      'studentCity' : this.student.studentCity,
      'studentGender' : this.student.studentGender,
      'studentAvatar' : this.student.studentAvatar,
    });
  }

  updateStudent() {
    this.student.studentId = this.studentId.value
    this.student.studentName = this.studentUpdateForm.value.studentName
    this.student.studentAge = this.studentUpdateForm.value.studentAge
    this.student.studentCity = this.studentUpdateForm.value.studentGender
    this.student.studentGender = this.studentUpdateForm.value.studentCity
    this.student.studentAvatar = this.studentUpdateForm.value.studentAvatar

    this.studentServie.updateStudent(this.student).subscribe(res => {
      console.log(res);
    });
    this.router.navigate(['/viewStudents']);
  }
}
