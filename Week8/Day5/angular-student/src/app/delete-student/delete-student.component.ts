import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-delete-student',
  templateUrl: './delete-student.component.html',
  styleUrls: ['./delete-student.component.css']
})
export class DeleteStudentComponent {
  studentList:Student[];
  studentId:number;

  constructor(private studentService: StudentService, private router:Router) { 
    this.studentList = [];
  }

  deleteStudent() {
    this.studentService.viewStudents().subscribe(res => {
      this.studentList = res;
      for(let i = 0; i < this.studentList.length; i++) {
        if(this.studentList[i].studentId==this.studentId) {
          this.studentService.deleteStudent(this.studentList[i].studentId).subscribe(res => {
            console.log(res);
          });
        }
      }
    });
    this.router.navigate(['/viewStudents']);
  }

}
