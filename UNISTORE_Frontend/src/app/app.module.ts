import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TiendaComponent } from './tienda/tienda.component';
import { DetalleComponent } from './detalle/detalle.component';

import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from "@angular/forms"
import {ApiService} from "../ApiService";

@NgModule({
  declarations: [
    AppComponent,
    TiendaComponent,
    DetalleComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
