import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './customValidation';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  get add() {
    return this.form.get('add');
  }
  get title() {
     return this.form.get('title');
  }
  get url() {
    return this.form.get('url');
  }
  get area() {
     return this.form.get('area');
  }

  form = new FormGroup({
    add: new FormControl(``, [Validators.required, CustomValidation.unique]),
    title: new FormControl(``, [Validators.required]),
    url: new FormControl(``, [Validators.required]),
    area: new FormControl(``, [Validators.required]),
  });
  constructor() { }

  ngOnInit() {
  }
  addMovie(form) {
    console.log(form);
  }
}
