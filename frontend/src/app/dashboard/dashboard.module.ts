import { RouterModule } from '@angular/router';
import { AtividadesComponent } from './components/atividades/atividades.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LayoutComponent } from './components/layout/layout.component';

@NgModule({
  imports: [
    CommonModule,
    RouterModule
  ],
  declarations: [AtividadesComponent, LayoutComponent],
})
export class DashboardModule { }
