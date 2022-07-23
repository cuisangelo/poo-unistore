import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TiendaComponent } from './tienda/tienda.component';
import { DetalleComponent } from './detalle/detalle.component';
import { HttpClientModule } from "@angular/common/http";
import { ReactiveFormsModule, FormsModule} from "@angular/forms";
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PerfilComponent } from './perfil/perfil.component';
import { DetalleDetalleComponent } from './detalle-detalle/detalle-detalle.component';

@NgModule({
  declarations: [
    AppComponent,
    TiendaComponent,
    DetalleComponent,
    RegisterComponent,
    LoginComponent,
    PerfilComponent,
    DetalleDetalleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
