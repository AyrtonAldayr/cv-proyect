import { Component, OnInit } from '@angular/core';
import { ServiceApiService } from '../service-api.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private _serviceApiService:ServiceApiService) { }

  ngOnInit(): void {
  }
  
  validar(){
    this._serviceApiService.getAccess().subscribe(data => {
      console.log(data);
    });
    console.log("ingreso");
  }


}
