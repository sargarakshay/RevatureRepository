import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddStudentComponent } from './add-student/add-student.component';
import { DeleteStudentComponent } from './delete-student/delete-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { ViewStudentsComponent } from './view-students/view-students.component';


const routes: Routes = [
  {
    path:"addStudent", 
    component:AddStudentComponent
  },
  {
    path:"updateStudent", 
    component:UpdateStudentComponent
  },
  {
    path:"deleteStudent", 
    component:DeleteStudentComponent
  },
  {
    path:"viewStudents", 
    component:ViewStudentsComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
