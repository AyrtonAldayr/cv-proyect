export class PermissionsEntity {

    lectura:String;
    escritura:String;

    constructor(lectura:String,escritura:String) {
        
        this.lectura =lectura;
        this.escritura =escritura;
    }
}