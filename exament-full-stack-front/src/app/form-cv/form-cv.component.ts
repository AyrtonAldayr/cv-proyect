import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PersonInformation } from '../entity/person-information';
import { ServiceApiService } from '../service-api.service';

@Component({
  selector: 'app-form-cv',
  templateUrl: './form-cv.component.html',
  styleUrls: ['./form-cv.component.scss']
})
export class FormCvComponent {
  addressForm = this.fb.group({
    // company: null,
    firstName: [null, Validators.required],
    secondName: [null, Validators.required],
    otherNames: null,
    paternalSurname: [null, Validators.required],
    maternalSurname: [null, Validators.required],
    typeDocument: [null, Validators.required],
    numberDocument: [null, Validators.required],
    numberPhone: [null, Validators.compose([
      Validators.required, Validators.minLength(9), Validators.maxLength(9)])],
    email: [null, Validators.compose([
      Validators.required, Validators.email
    ])]
  });

  hasOtherNames = false;

  typeDocuments = [
    { name: 'DNI', abbreviation: 'DNI' },
    { name: 'Carnet de Extranjeria', abbreviation: 'CE' },
  ]

  constructor(private fb: FormBuilder,private service:ServiceApiService) { }

  onSubmit(): void {/*
    this.builderPersonInformation(this.addressForm);*/
    console.log(this.addressForm.value);
    this.service.createPersonUpdate(this.builderPersonInformation(this.addressForm))
    .subscribe(data=>{
      console.log("data: ",data);
    });
  }

  builderPersonInformation(form:FormGroup):PersonInformation{
    let person:PersonInformation = new PersonInformation();
    person.firstName=form.controls['firstName'].value;
    person.secondName=form.controls['secondName'].value;
    person.otherNames=form.controls['otherNames'].value;
    person.fatherLastName=form.controls['paternalSurname'].value;
    person.motherFirstName=form.controls['maternalSurname'].value;
    person.typeDocument=form.controls['typeDocument'].value;
    person.numDocument=form.controls['numberDocument'].value;
    person.numberPhone=form.controls['numberPhone'].value;
    person.email=form.controls['email'].value;
    return person;
  }
}
