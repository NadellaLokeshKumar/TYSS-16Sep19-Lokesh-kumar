import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  fireBaseUrl = 'https://ust-ty-affbb.firebaseio.com/';
  constructor(public http: HttpClient) { }
  postUser(data) {
    console.log(`service`, data);
     return this.http.post(`${this.fireBaseUrl}/users.json`, data);    /* .json only for firebase.For remaining databases it is not required(only users is enough)*/
  }
  getUsers() {
    return this.http.get(`${this.fireBaseUrl}/users.json`).pipe(
      map(data => {
        const newArray = [];
        for (const key in data) {
          newArray.push({...data[key], id : key});
        }
        return newArray;
      })
    );
  }
  updateUser(id, data) {
    return this.http.put(`${this.fireBaseUrl}/users/${id}.json`, data);
  }
  deleteUser(id) {
    return this.http.delete(`${this.fireBaseUrl}/users/${id}.json`);
  }
}
