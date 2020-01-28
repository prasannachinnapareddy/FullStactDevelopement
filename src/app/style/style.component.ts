import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-style',
  templateUrl: './style.component.html',
  styleUrls: ['./style.component.css']
})
export class StyleComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
export class AppComponent {    
  isBold: boolean = true;    
  fontSize: number = 30;    
  isItalic: boolean = true;    
  
  MyStyle() {    
      let mystyles = {    
          'font-weight': this.isBold ? 'bold' : 'normal',    
          'font-style': this.isItalic ? 'italic' : 'normal',    
          'font-size.px': this.fontSize    
      };    
  
      return mystyles;    
  }    
}  