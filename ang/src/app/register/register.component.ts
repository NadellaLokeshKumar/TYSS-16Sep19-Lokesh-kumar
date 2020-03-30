import { Component, OnInit, DoCheck, AfterViewChecked, AfterViewInit, OnDestroy } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
  users;
  selectedUser;
  today = new Date();
  constructor(public service: UserService) {
    console.log("constructor is executed");
    this.getData();
   }

  ngOnInit() {
    console.log("ngoninit is executed");
  }

  ngDoCheck() {
    console.log('ng docheck is executed');
  }

    ngAfterViewInit(){
      console.log('ngafterviewinit is executed');
    }

    ngAfterViewChecked(){
      console.log('ngafterviewchecked is executed');
    }

    ngOnDestroy() {
      console.log('ngondestroy is executing');
    }

  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log(`data posted successfully`);
    });
  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log(`data got successfully`);
    });
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log(`data delete successfully`);
    });
  }
  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log(`data updation successfull`);
    });
  }
}
