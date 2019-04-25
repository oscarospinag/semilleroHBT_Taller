import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';

import { pedidosDTO } from 'src/app/modelo/pedidosDTO';
import { AbstractService } from './template.service';

@Injectable({
  providedIn: 'root'
})
export class PedidoService extends AbstractService {
	
  public pedido: pedidosDTO;
  public listaPedido: pedidosDTO[];
  
  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }
  //metodo para consultar el servicio

 public consultarPedidos(idPedido: number):  Observable<pedidosDTO> {
 	return this.get<pedidosDTO>("/semillero-servicios", "/ConsultasRest/consultarPedido");
 }
  //metodo para registrar el servicio
 public registartPedidos(pedido: pedidosDTO):  Observable<pedidosDTO> {
  return this.post<pedidosDTO>("/semillero-servicios", "/ConsultasRest/consultarPedido", pedido);
}
  

}
