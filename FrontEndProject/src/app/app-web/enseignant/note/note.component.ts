import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';
import { Classe } from '../../../model/classe';
import { Matier } from '../../../model/matier';
import { NoteService } from './note.service';
import { MatierEnseignantClasse } from '../../../model/MatierEnseignantClasse';
import { EleveNoteDTO } from '../../../model/EleveNoteDTO';
import { PARAMETERS } from '@angular/core/src/util/decorators';
<<<<<<< HEAD
import { letProto } from 'rxjs/operator/let';
// import {GridOption} from 'ag-grid';
=======
import { RowDataNote } from '../../../model/RowDataNote';
import { Note } from '../../../model/note';
import { Observable } from 'rxjs';
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9

export interface Food {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-note',
  templateUrl: './note.component.html',
  styleUrls: ['./note.component.css']
})
export class NoteComponent implements OnInit {
  private matiere1: Matier;
  private mecClasses: MatierEnseignantClasse[] = [];
  private matierEnseignantClasse: MatierEnseignantClasse[] = []; 
  public  classeSelectione: number; 
  public matiereSelectionee: number;
  private title: any;
  private columnDefs: any;
  private rowData: any;
  private afficherClasses: MatierEnseignantClasse[]= [];
  private mecMatier: MatierEnseignantClasse[] = [];
  private  matierNonDouble : MatierEnseignantClasse[]= [];
  private eleveNoteDTOList: EleveNoteDTO[] = [];
<<<<<<< HEAD
 
 private agGridRowList: any[]= [];
=======
  public    listresult = []; 
  public note : Note ;
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9


  onClick(): void {
    console.log(this.classeSelectione);
  }

  onClasseSelection1() {
    this.getAgGridData();
  }


  constructor(private noteService: NoteService) {
    
  }


  getListMatiere() {
<<<<<<< HEAD
    this.noteService.getMatierservice(1).subscribe( result=> { 
=======
    this.noteService.getMatierservice(8).subscribe( result=> { 
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9
      this.matierEnseignantClasse = result ;


      //tableau matierNonDouble vide alors on fait l'initialization
      this.matierNonDouble.push(this.matierEnseignantClasse[0]);
      //taille de tableau sans duplication
      let m :number = 1;

      //bdit b'1 parsque j'ai déjà remplit le premier valeur
    for (let _i = 1; _i < this.matierEnseignantClasse.length ; _i++) {
      let j=0;
      let trouverDupliquer=false;
    while ((j < m) &&  ( trouverDupliquer == false )) {
        if (this.matierEnseignantClasse[_i].matier.idMatier  !=  this.matierNonDouble[j].matier.idMatier) {
          j++ ;
        }
          else {
             trouverDupliquer = true;
            }


        }
        if (j >= m ) {
          this.matierNonDouble.push(this.matierEnseignantClasse[_i]) ;
             m++ ;
            }
          }
    }) ;

  }
 
  
       
 selectionnermatier() {
  this.mecClasses = this.matierEnseignantClasse.filter( obj => obj.matier.idMatier == this.matiereSelectionee);
    }
// bch tjiblik tfiltri les classe ili l ma


<<<<<<< HEAD
getAgGridData() {
  this.agGridRowList = [];
  this.rowData = [];
  this.eleveNoteDTOList = [];
  this.noteService.getNoteEleveService(this.matiereSelectionee, this.classeSelectione).subscribe( resultat => {
     this.eleveNoteDTOList =  resultat ;
    this.getColumnDefs();
    this.getRowData();
   });
}

getColumnDefs(){
     //  t7otlik distinctThings mn eleveNoteDTOListtab ken l non dupliqué
     const distinctThings = this.eleveNoteDTOList.filter((eleveNote, i, arr) => {
      return arr.indexOf( 
        arr.find(t => {
          return t.nomNote === eleveNote.nomNote
        })) ===i;
    });
    this.title = 'app';
  this.columnDefs =[    
   {headerName: 'nom', field: 'nom' , sortable: true , filter: true, checkboxSelection: true },
     {headerName: 'prénom', field: 'prenom', sortable: true, filter: true },
// / field torbet bin data row w columdef
 ]; 
    distinctThings.forEach(obj=> {
      this.columnDefs.push({
        headerName:obj.nomNote,
        field:obj.nomNote,
        filter:true,
        sortable:true 
      })
    })
}
=======
NoteEleve() : void {
  let list : any =[] ;
  let nomExamen : any = []; 
  let valeurNote : any = [];
  this.noteService.getNoteEleveService(4,1).subscribe( resultat => {
   
    let eleveNoteDTOList =  resultat ;
    console.log(eleveNoteDTOList) ;
    let list : RowDataNote[]=[] ;

     let map = Object.keys(resultat );  
    map.forEach (nom => {
   let rd = { nomPrenom : nom }
   for ( let object of resultat[nom] ) {
    nomExamen = object.nomExamen ;
       valeurNote = object.valeurNote ;
       rd[nomExamen] =valeurNote;
  }
  list.push(rd);

    //  const distinctThings = this.eleveNoteDTOList.filter((eleveNote, i, arr) => {
    //   return arr.indexOf( 
    //     arr.find(t => {
    //       debugger;
    //       return t[2] === eleveNote[2] 
    //     })) ===i;
    // });
    // distinctThings.forEach(obj=> {
    //   debugger;
    //   this.columnDefs.push({
    //     headerName:obj[2],
    //     field:obj[2],
    //     filter:true,
    //     sortable:true 
        
    //   })
    
    });
    this.listresult = list;
    console.log(this.listresult);

    }) ;
  
 
   }
  
  
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9

getRowData() {

this.eleveNoteDTOList.forEach ( object1 => {
  this.eleveNoteDTOList.forEach( object2 => {
   if (object1.idEleve == object2.idEleve){
     let index = this.agGridRowList.findIndex(obj => {
       return obj.idEleve === object1.idEleve
     });
     if (index == -1)  {
     let objetDouble={};
     objetDouble  ["idEleve"] = object1.idEleve ;
     objetDouble  ["nom"] = object1.nom;
     objetDouble  ["prenom"] =object1.prenom;
     objetDouble  [object1.nomNote]= object2.valeurNote;
     objetDouble [object2.nomNote] = object2.valeurNote;
     this.agGridRowList.push(objetDouble);
    } else {
      this.agGridRowList[index][object2.nomNote] = object2.valeurNote;
    }   
   }
  });
});
this.rowData = this.agGridRowList;
}

  ngOnInit() {
    this.getListMatiere();
<<<<<<< HEAD
    // this.  TestDifusion();
  }
}
=======
    this.ngGridTableau();

  }
  ngGridTableau () {
  this.title = 'app';
  this.columnDefs =[ 

    {headerName: 'nom et prénom', field: 'nomPrenom' , sortable: true , filter: true, },
    {headerName: 'Note Controle 1', field: 'controle1' , sortable: true , filter: true , editable : true },
    {headerName: 'Note Controle 2', field: 'controle2' , sortable: true , filter: true , editable : true },
    {headerName: 'Note Orale', field: 'orale' , sortable: true , filter: true , editable : true },
    {headerName: 'Note Synthése', field: 'synthese' , sortable: true , filter: true , editable : true},
    {headerName: 'Moyenne', field: 'moyenne' , sortable: true , filter: true , editable : true},
 
 
 ]; 

 console.log(this.columnDefs);


//  this.rowData = [
//      {nomPrenom: 'Ikram saadi', controle1: 15, orale: 18 , synthese: 14 , moyenne: 12 , controle2 : 15 },
//      {nomPrenom: 'Chaima zargani', controle1: 18, orale: 18 , synthese: 14 , moyenne: 12 , controle2 : 15  },
//      {nomPrenom: 'Mariem bouali', controle1: 19, orale: 18 , synthese: 14 , moyenne: 12 , controle2 : 15  },

//  ];
   }
  enregistrerNote() {
    this.noteService.postNote().subscribe(result => {
      console.log(result);
    });
   }
  
}

>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9
