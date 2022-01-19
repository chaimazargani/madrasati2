import { Injectable } from '@angular/core';
import { Matier } from '../../../model/matier';
import { HttpClient } from 'selenium-webdriver/http';
import { MatierEnseignantClasse } from '../../../model/MatierEnseignantClasse';
import { HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class CoursHttpService {
  private matier: Matier;

  constructor(private httpClient: HttpClient) {
    this.matier = new Matier();

   }
 
    
}
