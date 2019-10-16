import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
 data;
 movie;

  constructor(public http: HttpClient) { }

  ngOnInit() {
  }
  search(event) {
this.data = event.target.value;
    this.http.get<any>(`http://www.omdbapi.com/?tt3896198&apikey=7d7fa1e1&s=`+this.data).subscribe(data =>{
        this.movie = data.Search;
    }, err => {
        console.log(err);
    }, () => {
        console.log(`news got successfully`);
    });



  }

}
