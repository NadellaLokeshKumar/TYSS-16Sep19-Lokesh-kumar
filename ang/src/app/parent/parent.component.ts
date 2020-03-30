import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  cars = [
    {
      imgUrl : `https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg`,
      name : `Benz`
    },
    {
      imgUrl : `https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png`,
      name : `Swift`
    },
    {
      imgUrl : `https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg`,
      name : `Audi`
    },
    {
      imgUrl : `https://cdn.pixabay.com/photo/2013/07/12/12/56/ford-mustang-146580__340.png`,
      name : `BMW`
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}
