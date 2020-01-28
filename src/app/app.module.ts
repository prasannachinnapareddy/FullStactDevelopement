import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HeroComponent } from './hero/hero.component';
import { ChildComponent } from './child/child.component';
import { ParentComponent } from './parent/parent.component';
import { AttributeComponent } from './attribute/attribute.component';
import { StyleComponent } from './style/style.component';
import { ClassComponent } from './class/class.component';
import { SwitchComponent } from './switch/switch.component';
import { UsersComponent } from './user/users/users.component';
import {HttpClientModule} from '@angular/common/http';
import { UserComponent } from './add/user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    HeroComponent,
    ChildComponent,
    ParentComponent,
    AttributeComponent,
    StyleComponent,
    ClassComponent,
    SwitchComponent,
    UsersComponent,
    UserComponent 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
