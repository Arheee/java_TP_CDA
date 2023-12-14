
## Diagramme Interfaces
```
@startuml
interface Personne {
getAge():int
getNom(): String
getPrenom(): String
getNomComplet(): String
}

abstract class Collaborateur implements Personne {
dateDebut :LocalDate
dateFin : LocalDate
licencier()
travailler()
estDansLesEffectifs()
}

class CDI extends Collaborateur implements Remunerable{}

class CDD extends Collaborateur implements Remunerable, Renouvelable{}

class Stagiaire extends Collaborateur implements Renouvelable{}

interface Remunerable{
+payer(heures:int= 151): void
+getTauxHoraire(): double
- calculerRemunerationHeureSupp(double heures): double
  }

interface Renouvelable{
+prolongerContrat(LocalDate dateFin): void
}


@enduml
```