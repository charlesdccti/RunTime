import { PasswordComponent } from './auth/components/password/password.component';
import { RegisterComponent } from './auth/components/register/register.component';
import { LoginComponent } from './auth/components/login/login.component';
import { Routes } from '@angular/router';

export const AppRoutes: Routes = [
    { path: '', component: LoginComponent },
    {
        path: 'login',
        component: LoginComponent,
    },
    {
        path: 'register',
        component: RegisterComponent,
    },
    {
        path: 'password',
        component: PasswordComponent,
    },
];