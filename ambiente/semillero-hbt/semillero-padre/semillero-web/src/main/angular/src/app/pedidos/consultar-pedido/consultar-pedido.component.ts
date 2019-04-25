import { Component, OnInit } from '@angular/core';
import { pedidosDTO } from 'src/app/modelo/pedidosDTO';
import { PedidoService } from 'src/app/servicios/pedido.service';
 
@Component({
  selector: 'app-consultar-pedido',
  templateUrl: './consultar-pedido.component.html',
  styleUrls: ['./consultar-pedido.component.css']
})
export class ConsultarPedidoComponent implements OnInit {
  
  public id  ;
  pedidoConsultado:pedidosDTO;

  constructor(public pedidoService: PedidoService) { }

  ngOnInit() {
  }
//metodo para consultar pedido
  public consultarPedido()  {
    //this.pedidoService.consultarPedidos(this.id).subscribe(data => {
     // this.pedidoConsultado = data;
   // });
   
  }
}
