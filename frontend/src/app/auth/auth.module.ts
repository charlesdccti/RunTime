import { CoreModule } from './../core/core.module';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AuthService } from './services/auth.service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { PasswordComponent } from './components/password/password.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RouterModule,
    CoreModule
  ],
  declarations: [LoginComponent, RegisterComponent, PasswordComponent]
})
export class AuthModule { }
