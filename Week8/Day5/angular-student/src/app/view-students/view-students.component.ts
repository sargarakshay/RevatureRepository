import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-view-students',
  templateUrl: './view-students.component.html',
  styleUrls: ['./view-students.component.css']
})
export class ViewStudentsComponent implements OnInit {
  studentList : Student[]
  flag:boolean;

  constructor(private studentService:StudentService, private router: Router) { 
    this.flag=false;
  }

  addStudent() {
    this.router.navigate(['/addStudent']);
  }

  ngOnInit() {
    this.studentService.viewStudents().subscribe(res => {
      this.studentList = res;
      if(this.studentList.length > 0) {
        this.flag = true;
      } else {
        this.flag = false;
      }
    });
    this.router.navigate(['/viewStudents']);
  }
}
