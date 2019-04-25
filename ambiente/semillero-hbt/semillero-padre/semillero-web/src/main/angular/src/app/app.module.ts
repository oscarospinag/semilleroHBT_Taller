import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { APP_BASE_HREF } from '@angular/common';
import { ConsultarPedidoComponent } from './pedidos/consultar-pedido/consultar-pedido.component';
import { CrearPedidoComponent } from './crear-pedido/crear-pedido.component';

@NgModule({
  declarations: [
    AppComponent,
    ConsultarPedidoComponent,
    CrearPedidoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
