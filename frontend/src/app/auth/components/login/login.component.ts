import { Router } from '@angular/router';
import { AuthService } from './../../services/auth.service';
import { Usuario } from './../../models/usuario';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss']
})
export class LoginComponent {

    usuario: Usuario = new Usuario();

    constructor(private authService: AuthService, private router: Router) { }

    login() {
        
        this.authService.login(this.usuario.email, this.usuario.senha)
            .then(
                (response) => {
                    console.log(this.authService.getUsuario());
                    this.router.navigateByUrl('/app');
                }
            );
    }

}
