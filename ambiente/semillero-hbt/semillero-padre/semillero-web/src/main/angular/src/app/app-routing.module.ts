import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConsultarPedidoComponent } from './pedidos/consultar-pedido/consultar-pedido.component';
import { CrearPedidoComponent } from './crear-pedido/crear-pedido.component';

const routes: Routes = [
  {
  path: 'consultarpedido',
  component: ConsultarPedidoComponent
},
{
  path: 'crearPedido',
  component: CrearPedidoComponent
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
