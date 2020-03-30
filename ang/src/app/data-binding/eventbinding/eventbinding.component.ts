import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {
  inputData = ` `;
  constructor() { }

  ngOnInit() {
  }
  printAlertMsg() {
    alert(`Hai Helo`);
  }
  dataInput(event) {
    console.log(event.target.value);
    this.inputData = event.target.value;
  }
}
