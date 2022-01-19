import { Injectable } from '@angular/core';
import { CoursHttpService } from './cours-http.service';
import { MatierEnseignantClasse } from '../../../model/MatierEnseignantClasse';
import { Observable } from 'rxjs';

@Injectable()
export class CoursService {

  constructor(private coursHttpService: CoursHttpService) { }


 
}
