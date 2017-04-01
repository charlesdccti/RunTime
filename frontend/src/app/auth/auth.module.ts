import { AuthService } from './services/auth.service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { PasswordComponent } from './components/password/password.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [LoginComponent, RegisterComponent, PasswordComponent],
  providers: [AuthService]
})
export class AuthModule { }
