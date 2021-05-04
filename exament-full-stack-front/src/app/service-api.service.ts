import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PermissionsEntity } from "./entity/permissions-entity";
import { PersonInformation } from "./entity/person-information";

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

  createPersonUpdate(person:PersonInformation):Observable<any> {
    return this.http.post<any>("http://localhost:9001/cv", person, { headers: this.createHeaders() })
    .pipe()
    ;
  }

  private createHeaders(){
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json; charset=utf-8');
    return headers;
  }
 

}
