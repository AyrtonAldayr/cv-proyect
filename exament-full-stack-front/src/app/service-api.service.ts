import { HttpClient } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PermissionsEntity } from "./entity/permissions-entity";

@Injectable({
  providedIn: 'root'
})
export class ServiceApiService {
//PermissionsEntity
  constructor(private http: HttpClient) { }

  getAccess():Observable<PermissionsEntity> {

    return this.http.get<PermissionsEntity>("http://localhost:9001/access",
    {headers:{"user":"admin","password":"admin","Content-Type":"application/json"}});

  }

}
