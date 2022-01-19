import { Component, OnInit, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CreerexamenComponent } from '../creerexamen/creerexamen.component';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';

@Component({
  selector: 'app-creermatier',
  templateUrl: './creermatier.component.html',
  styleUrls: ['./creermatier.component.css']
})
export class CreermatierComponent implements OnInit {

  constructor(private httpClient : HttpClient ,public dialogRef: MatDialogRef<CreermatierComponent>, @Inject(MAT_DIALOG_DATA)public data: any) { }

  ngOnInit() {
  }
 
  onNoClick(): void {
    this.dialogRef.close()
  }

 

  dialogClose(){
    this.dialogRef.close({matiere:this.data.matiere,validation:"sauvegarder"});
    
  }
}
