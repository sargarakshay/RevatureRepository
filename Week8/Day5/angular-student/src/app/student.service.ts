import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  url:string;

  constructor(private http: HttpClient) { 
    this.url = "http://localhost:8080/student";
  }

  public addStudent(student:Student): Observable<Student> {
    return this.http.post<Student>(this.url, student);
  }

  public updateStudent(student:Student): Observable<Student> {
    return this.http.put<Student>(this.url, student);
  }

  public deleteStudent(studentId :number)  {
    return this.http.delete(this.url+"/"+studentId);
  }

  public getStudentById(studentId: number):Observable<Student> {
    return this.http.get<Student>(this.url+"/"+studentId);
  }

  public viewStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(this.url+"s");
  }
}
