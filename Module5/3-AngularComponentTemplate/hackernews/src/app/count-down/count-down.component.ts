import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-count-down',
  templateUrl: './count-down.component.html',
  styleUrls: ['./count-down.component.css']
})
export class CountDownComponent implements OnInit {

  startTimes: any;
  _seconds: number;
  // seconds:any;


  constructor() {
    console.log("constructor");
  }

  ngOnInit(): void {
    console.log("init count down");
  }

  ngOnChanges(): void {
    console.log("onchange");
  }

  ngOnDestroy(): void {
    console.log("destroy");
  }

  start() {
    this.startTimes = setInterval(() => {
      this._seconds--;
      this.isCountDown();
    }, 1000);
  }

  stop() {
    clearInterval(this.startTimes);
  }

  reset() {
    this._seconds = 10;
  }


  setSeconds(){
    this._seconds = Number((<HTMLInputElement>document.getElementById("seconds")).value);
  }

  @Input()
  get seconds(): number {
    return this._seconds; }

  set seconds(v) {
    v = typeof v === 'undefined' ? 11 : v;
    const vFixed = Number(v);
    this._seconds = Number.isNaN(vFixed) ? 19 : vFixed;
  }

  @Output()
  finish = new EventEmitter<boolean>();
  private isCountDown() {
    if (this._seconds === 0) {
      this.stop();
      this.finish.emit(true);
    }
  }

}
