import { Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  message="Hello to Child";
  msgFromChild:string;
  setmessage(message:string)
  {
    this.msgFromChild=message;
  }
  constructor() { }

  ngOnInit() {
  }

}
