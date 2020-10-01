import {Component, Inject, OnInit, Optional} from '@angular/core';
import {GalleryConfig} from './token';

@Component({
  selector: 'app-image-gallery',
  templateUrl: './image-gallery.component.html',
  styleUrls: ['./image-gallery.component.scss']
})
export class ImageGalleryComponent implements OnInit {
  url = 0;
  listImage = [
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=1',
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=2',
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=3',
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=4'
  ];
  itemWidth: number;
  config = 4;

  constructor(
    @Inject(GalleryConfig)
    @Optional()
      config: number
  ) {
    if (config) {
      this.config = config;
    }
  }

  ngOnInit(): void {
    this.itemWidth = (101 - this.config) / this.config;
  }

  update(events: number): void {
    this.url += events;
    if (this.url < 0) {
      this.url = 0;
    } else if (this.url >= this.listImage.length) {
      this.url = this.listImage.length - 1;
    }
    console.log(this.url);
  }

}
