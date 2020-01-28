import { Component, OnInit, Input, Output ,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  message="Hello From Child";
  @Input() msgFromParent:string;
  @Output() msgFromChild=new EventEmitter<string>();
  constructor() {}

  ngOnInit() {
    this.msgFromChild.emit(this.message);
  }

}
