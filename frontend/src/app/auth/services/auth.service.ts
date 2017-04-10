import { Http, URLSearchParams } from '@angular/http';
import { Router } from '@angular/router';
import { Usuario } from './../models/usuario';
import { Auth } from './../models/auth';
import { Injectable } from '@angular/core';
import { AbstractService } from "app/core/services/abstract-service";
import 'rxjs/add/operator/toPromise';

@Injectable()
export class AuthService extends AbstractService {

    private auth: Auth = new Auth();

    constructor(private router: Router, private http: Http) {
        super();
        this.url = 'auth';
    }

    getHttp(): Http {
        return this.http;
    }

    login(email: string, senha: string) {
        let body = new URLSearchParams();
        body.append('email', email);
        body.append('senha', senha);

        return this.http.post(this.url, body)
            .toPromise().then((response) => {
                console.log(response);
                let usuario = response.json() as Usuario
                console.log(usuario);

                if (usuario && usuario.token) {
                    localStorage.setItem('user', JSON.stringify(usuario));
                    this.auth.usuario = usuario;
                }
            });
    }

    logout() {
        this.auth.usuario = null;
        localStorage.clear();

        this.router.navigateByUrl('/login');
    }

    registrar(usuario: Usuario) {
        console.log(usuario);
        this.login(usuario.email, usuario.senha);
    }

    enviarRecuperacaoDeSenha(email: string) {

    }

    alterarSenha(senha: string) {

    }

    getUsuario(): Usuario {
        if (this.auth.usuario == null) {
            this.auth.usuario = JSON.parse(localStorage.getItem('user'));
        }
        console.log(this.auth);
        return this.auth.usuario;
    }

    isLogado(): boolean {
        if (this.getUsuario() != null) {
            return true;
        }

        return false;
    }

}
