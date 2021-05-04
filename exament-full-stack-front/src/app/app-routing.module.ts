import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormCvComponent } from './form-cv/form-cv.component';
import { FormularioComponent } from './formulario/formulario.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', redirectTo: '/login', pathMatch: 'full' },
      { path: 'login', component: LoginComponent },
      { path: 'formulario', component: FormularioComponent },
      { path: 'form-cv', component: FormCvComponent },

    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
