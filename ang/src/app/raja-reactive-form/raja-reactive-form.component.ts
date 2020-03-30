import { Component, OnInit } from '@angular/core';
import { Form, FormGroup, FormControl, FormArray, Validators } from '@angular/forms';

@Component({
  selector: 'app-raja-reactive-form',
  templateUrl: './raja-reactive-form.component.html',
  styleUrls: ['./raja-reactive-form.component.css']
})
export class RajaReactiveFormComponent implements OnInit {

  constructor() { }

  registrationForm: FormGroup;

  ngOnInit() {
    this.registrationForm = new FormGroup({
      name: new FormControl(),
      email: new FormControl(),
      password: new FormControl(),
      skills: new FormArray([
        this.skillField()
      ])
  });
}

removeSkill(i: number) {
  (this.registrationForm.get('skills') as FormArray).removeAt(i);
}
skillField() {
  return new FormGroup({
    skill: new FormControl(),
    rating: new FormControl()
  });
}
addSkill() {
  (this.registrationForm.get('skills') as FormArray).push(this.skillField());
}
printForm() {
  console.log(this.registrationForm.value);
}
}
