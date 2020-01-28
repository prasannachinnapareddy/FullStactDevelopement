import { Component, OnInit } from '@angular/core';
import {UserService} from 'src/app/services/user.service';
import { User } from 'src/app/model/user';
@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private userService:UserService) { }
  users:User[];
  ngOnInit() {
    //this.users=this.userService.getAllUsers();
    this.userService.getAllUsers().subscribe(data => {
      this.users=data;
    });
}
deleteUser(user:User){
  this.userService.deleteUser(user.id).subscribe();
  this.users=this.users.filter(u => u !== user);
}
}
