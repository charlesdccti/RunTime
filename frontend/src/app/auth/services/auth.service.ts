import { Router } from '@angular/router';
import { Usuario } from './../models/usuario';
import { Auth } from './../models/auth';
import { Injectable } from '@angular/core';

@Injectable()
export class AuthService {

    private auth: Auth = new Auth();

    constructor(private router: Router) { }

    login(email: string, senha: string) {
        let usuario: Usuario = new Usuario();
        usuario.nome = "Lincoln Luiz";
        usuario.email = email;
        usuario.token = "alksdkjlfsad043i83jlro9fjlflkjdffdf";

        localStorage.setItem('user', JSON.stringify(usuario));

        this.auth.usuario = usuario;
    }

    logout() {
        this.auth = null;
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
        return this.auth.usuario;
    }

    isLogado(): boolean {
        if (this.getUsuario() != null) {
            return true;
        }

        return false;
    }

}
