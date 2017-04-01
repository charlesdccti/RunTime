import { Usuario } from './../models/usuario';
import { Auth } from './../models/auth';
import { Injectable } from '@angular/core';

@Injectable()
export class AuthService {

  private auth : Auth;

  constructor() { }

  login(email : string, senha : string) {
    let usuario : Usuario = new Usuario();
    usuario.email = "licnoln@gmail.com";
    usuario.token = "alksdkjlfsad043i83jlro9fjlflkjdffdf";
    
    localStorage.setItem('user', JSON.stringify(usuario));

    this.auth.usuario = usuario;
  }

  logout() {
    this.auth = null;
    localStorage.clear();
  }

  registrar(usuario : Usuario) {

  }

  enviarRecuperacaoDeSenha(email : string) {

  }

  alterarSenha(senha : string) {

  }

  getUsuario() : Usuario {
    return this.auth.usuario;
  }

  isLogado() : boolean {
    if (this.getUsuario() != null) {
      return true;
    }

    return false;
  }

}
