import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {TiendaComponent} from "./tienda/tienda.component";
import {DetalleComponent} from "./detalle/detalle.component";
import {RegisterComponent} from "./register/register.component";
import {LoginComponent} from "./login/login.component";


const routes: Routes = [
  {path: "tienda", component: TiendaComponent},
  {path:"register", component:RegisterComponent},
  {path:"detalle/:id", component:DetalleComponent},
  {path: "login", component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
