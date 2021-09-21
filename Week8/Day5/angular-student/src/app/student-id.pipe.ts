import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'studentId'
})
export class StudentIdPipe implements PipeTransform {

  transform(studentId:number): string {
    return studentId.toString().padStart(3, '0');
  }

}
