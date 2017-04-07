import { Usuario } from './../../auth/models/usuario';
import { AuthService } from './../../auth/services/auth.service';
import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { Http, Request, XHRBackend, RequestOptions, RequestOptionsArgs, Response } from '@angular/http';
import { Observable } from "rxjs/Observable";
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';

@Injectable()
export class HttpService extends Http {

    private baseUrl : string = 'http://localhost:8090/api/';

    constructor(
        backend: XHRBackend,
        defaultOptions: RequestOptions) {
        
        super(backend, defaultOptions);
    }

    request(url: string | Request, options?: RequestOptionsArgs): Observable<Response> {
        // recupera usuário do local storage
        let usuario : Usuario = JSON.parse(localStorage.getItem('user'));

        if (usuario) (url as Request).headers.set('Authorization', usuario.token);
        // concatena base url com url 
        (url as Request).url = this.baseUrl + (url as Request).url;

        return super.request(url, options).catch((error: Response) => {
            console.log(error.status);
            console.log(error.statusText);

            /*if ((error.status === 401 || error.status === 403) && (window.location.href.match(/\?/g) || []).length < 2) {
                console.log('The authentication session expires or the user is not authorised. Force refresh of the current page.');
                window.location.href = window.location.href + '?' + new Date().getMilliseconds();
            }*/
            return Observable.throw(error);
        });
    }

}
