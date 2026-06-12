import { Injectable } from "@angular/core";
import {
  HttpEvent,
  HttpHandler,
  HttpInterceptor,
  HttpRequest,
  HttpResponse,
} from "@angular/common/http";
import { Observable, of } from "rxjs";
import { delay } from "rxjs/operators";
import { environment } from "../../environments/environment";
import { CLIENTES, LOGIN_OK, PRODUCTOS } from "./demo-data";

// Demo-mode interceptor: answers the 2022 Spring Boot endpoints
// (localhost:8080) with static fixtures so the app runs with no backend.
@Injectable()
export class DemoInterceptor implements HttpInterceptor {
  intercept(
    req: HttpRequest<unknown>,
    next: HttpHandler
  ): Observable<HttpEvent<unknown>> {
    if (!environment.demo || !req.url.includes("localhost:8080")) {
      return next.handle(req);
    }
    return of(new HttpResponse({ status: 200, body: this.resolve(req) })).pipe(
      delay(200)
    );
  }

  private resolve(req: HttpRequest<unknown>): unknown {
    const path = new URL(req.url).pathname;
    switch (path) {
      case "/obtener-productos":
        return { lista: PRODUCTOS };
      case "/obtener-cliente-perfil":
        return { listaCliente: CLIENTES };
      case "/agregar-cliente":
        return req.body;
      case "/registerByEmail":
      case "/loginByEmail":
        return LOGIN_OK;
      default:
        console.warn(`[demo] Endpoint sin fixture: ${path}`);
        return {};
    }
  }
}
