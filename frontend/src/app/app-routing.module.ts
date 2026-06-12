import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {TiendaComponent} from "./tienda/tienda.component";
import {DetalleComponent} from "./detalle/detalle.component";
import {RegisterComponent} from "./register/register.component";
import {LoginComponent} from "./login/login.component";
import {PerfilComponent} from "./perfil/perfil.component";
import {DetalleDetalleComponent} from "./detalle-detalle/detalle-detalle.component";
import {TiendaClienteComponent} from "./tienda-cliente/tienda-cliente.component";


const routes: Routes = [
  {path: "", redirectTo: "tienda", pathMatch: "full"},
  {path: "tienda", component: TiendaComponent},
  {path: "register", component: RegisterComponent},
  {path: "tienda/:id", component: TiendaClienteComponent},
  {path: "detalle/:id", component: DetalleComponent},
  {path: "detalle-detalle/:id", component: DetalleDetalleComponent},
  {path: "login", component: LoginComponent},
  {path: "perfil", component: PerfilComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
