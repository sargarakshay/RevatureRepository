import { Component } from '@angular/core';
import { FormControl } from '@angular/forms'; 

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  name = new FormControl('');
  
  updateName() {
    this.name.setValue('Nancy');
  }
  
}
