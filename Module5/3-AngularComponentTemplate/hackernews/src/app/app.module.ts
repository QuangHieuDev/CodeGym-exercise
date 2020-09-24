import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { LikesComponent } from './likes/likes.component';
import { CountDownComponent } from './count-down/count-down.component';

@NgModule({
  declarations: [
    AppComponent,
    LikesComponent,
    CountDownComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
