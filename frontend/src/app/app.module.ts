import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TiendaComponent } from './tienda/tienda.component';
import { DetalleComponent } from './detalle/detalle.component';
import { HTTP_INTERCEPTORS, HttpClientModule } from "@angular/common/http";
import { DemoInterceptor } from './demo/demo.interceptor';
import { ReactiveFormsModule, FormsModule} from "@angular/forms";
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PerfilComponent } from './perfil/perfil.component';
import { DetalleDetalleComponent } from './detalle-detalle/detalle-detalle.component';
import { TiendaClienteComponent } from './tienda-cliente/tienda-cliente.component';
import { CarritoComponent } from './carrito/carrito.component';

@NgModule({
  declarations: [
    AppComponent,
    TiendaComponent,
    DetalleComponent,
    RegisterComponent,
    LoginComponent,
    PerfilComponent,
    DetalleDetalleComponent,
    TiendaClienteComponent,
    CarritoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: DemoInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
