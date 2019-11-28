import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-searchnews',
  templateUrl: './searchnews.component.html',
  styleUrls: ['./searchnews.component.css']
})
export class SearchnewsComponent implements OnInit {
  news4: any;
  selected: any;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }


  selectOne(event) {
    this.selected = event.target.value;
    this.http.get<any>(`https://newsapi.org/v2/top-headlines?apiKey=b6e96e74d81d451a8bf18468bce19180&q=`+this.selected).subscribe(data => {
      this.news4 = data.articles;
      console.log(this.news4);
  }, err => {
      console.log(err);
  }, () => {
      console.log(`news got successfully`);
  });
  
  }

}
