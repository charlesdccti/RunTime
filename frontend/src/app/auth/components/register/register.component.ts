import { AuthService } from './../../services/auth.service';
import { Usuario } from './../../models/usuario';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {

  usuario : Usuario = new Usuario();

  constructor(private authService : AuthService) { }

  cadastrar() {
    this.authService.registrar(this.usuario);
  }

}
