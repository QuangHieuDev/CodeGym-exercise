import {Component, Input, OnInit, SimpleChanges} from '@angular/core';
import {IRatting} from "../iratting";

@Component({
  selector: 'app-bar',
  templateUrl: './bar.component.html',
  styleUrls: ['./bar.component.scss']
})
export class BarComponent implements OnInit {
  rating: Array<IRatting> = [];
  @Input()
  max = 5;
  @Input()
  ratingValue = 2;
  @Input()
  showRatingValue = true;

  constructor() { }

  ngOnInit() {
    this.calculate(this.max, this.ratingValue);
  }

  calculate(max, ratingValue) {
    this.rating = Array.from({length: max}, (_, index) => ({
        value: index + 1,
        active: index < ratingValue
      }));
  }

  ngOnChanges(changes: SimpleChanges) {
    if ('max' in changes) {
      let max = changes.max.currentValue;
      max = typeof max === 'undefined' ? 5 : max;
      this.max = max;
      this.calculate(max, this.ratingValue);
    }
  }

  select(index) {
    this.ratingValue = index + 1;
    this.rating.forEach((item, idx) =>
      item.active = idx < this.ratingValue);
    console.log(this.ratingValue);
    console.log(this.rating);
    // this.rateChange.emit(this.ratingValue);
  }
}
