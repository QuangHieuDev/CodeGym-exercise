import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {
  playlist = [
    {id: 'W9gO-K7_31M', song: 'Xomu - Lanterns'},
    {id: 'nN-tJvEplB4', song: 'DiESi Remix'},
    {id: 'GT28MYh_jlE', song: 'China-A '},
    {id: 'wN83dn07TUw', song: 'Take Me Hand '},
    {id: 'O6mizTWwmTQ', song: 'I Do - 911'},
    {id: 'GqC8jWzmiLA', song: 'China Rain'}
  ];

  constructor() {
  }

  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
