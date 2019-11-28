import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-lokesh',
  templateUrl: './lokesh.component.html',
  styleUrls: ['./lokesh.component.css']
})
export class LokeshComponent implements OnInit {
  news: any;
  news1: any;
  news2: any;

  constructor(private http: HttpClient ) { 
    this.getNews();
    this.getNews1();
    this.getNews2();
  }

  ngOnInit() {
  }
  getNews() {
    this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=b6e96e74d81d451a8bf18468bce19180`).subscribe(data =>{
        this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log(`news got successfully`);
    });
}

getNews1() {
  this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&apiKey=b6e96e74d81d451a8bf18468bce19180`).subscribe(data =>{
      this.news1 = data.articles;
  }, err => {
      console.log(err);
  }, () => {
      console.log(`news got successfully`);
  });
}

getNews2() {
  this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=b6e96e74d81d451a8bf18468bce19180`).subscribe(data =>{
      this.news2 = data.articles;
  }, err => {
      console.log(err);
  }, () => {
      console.log(`news got successfully`);
  });
}
}
