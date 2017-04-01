import { Usuario } from './../../models/usuario';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  usuario : Usuario = new Usuario();

  constructor() { }

  login() {
    console.log(this.usuario);
    console.log("asdasdf");
  }

}
