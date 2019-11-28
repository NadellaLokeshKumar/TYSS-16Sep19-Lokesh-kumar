import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-india',
  templateUrl: './india.component.html',
  styleUrls: ['./india.component.css']
})
export class IndiaComponent implements OnInit {
  news1: any;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getNews3() {
    this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&apiKey=b6e96e74d81d451a8bf18468bce19180`).subscribe(data =>{
        this.news1 = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log(`news got successfully`);
    });
  }

}
