import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class',
  templateUrl: './class.component.html',
  styleUrls: ['./class.component.css']
})
export class ClassComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
export class AppComponent {    
  applyBoldClass: boolean = true;    
  applyItalicsClass: boolean = true;    
  
  applyClasses() {    
      let classes = {    
          boldClass: this.applyBoldClass,    
          italicsClass: this.applyItalicsClass    
      };    
  
      return classes;    
  }    
}    	
