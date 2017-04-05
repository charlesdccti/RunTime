import { DashboardModule } from './dashboard/dashboard.module';
import { AtividadeService } from './dashboard/services/atividade.service';
import { AuthService } from './auth/services/auth.service';
import { AppRoutes } from './app.routes';
import { LoginComponent } from './auth/components/login/login.component';
import { AuthModule } from './auth/auth.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AuthModule,
    DashboardModule,
    RouterModule.forRoot(AppRoutes),
  ],
  providers: [AuthService, AtividadeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
