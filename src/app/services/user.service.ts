import { Injectable } from '@angular/core';
import {USERS} from '../model/usermock';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../model/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl='http://localhost:3000/users/';
user=USERS;
  constructor(private httpClient:HttpClient) { }
  getTodayDate()
  {
    return new Date();
  }
  getAllUsers():Observable<User[]>
  {
    return this.httpClient.get<User[]>(this.httpUrl);
  }
 saveUser(user:User):Observable<User>
  {
    return this.httpClient.post<User>(this.httpUrl,user);
  }
  deleteUser(id:number):Observable<User>
  {
    return this.httpClient.delete<User>(this.httpUrl +id);
  }
}
