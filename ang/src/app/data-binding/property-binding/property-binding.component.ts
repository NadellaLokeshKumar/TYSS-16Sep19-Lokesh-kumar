import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name: string = `Lokesh`;
  imgUrl = 'https://cdn.pixabay.com/photo/2019/08/19/15/13/eiffel-tower-4416700__340.jpg';
  address = `kanasanapalli,vijayawada-521212`;
  colorName = `red`;
  isActive: boolean = false;
  colSpanValue: number = 2;


  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = `pink`;
      this.isActive = !this.isActive;
    }, 2000);
  }

  

}
