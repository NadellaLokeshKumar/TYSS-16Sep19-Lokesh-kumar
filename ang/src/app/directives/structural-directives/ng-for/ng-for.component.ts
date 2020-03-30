import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

   products = [
    {
      img : 'https://cdn.pixabay.com/photo/2019/09/27/15/26/pomegranate-4508741__340.jpg',
      name : 'promogranatte',
      price : 50,
    },
    {
     img : 'https://cdn.pixabay.com/photo/2019/09/28/15/36/lemon-4511081__340.jpg',
      name : 'orange',
      price : 30,
    },
    {
      img : 'https://cdn.pixabay.com/photo/2016/08/18/13/03/ink-1602896__340.jpg',
      name : 'paint',
      price : 400,
    }
  ];
     constructor() {
   }

  ngOnInit() {
  }

}
