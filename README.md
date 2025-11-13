# 📦 Projet Java : Gestion d'employés

Ce projet en java orienté objet propose une modélistation de personnes, de villes et d'employés.

### 🧱 Structure des classes

1. **Person** -> Classe de base qui représente une personne :
  - Prénom, nom âge et adresse
  - Ville de naissance (City)
2. **City** -> Représente une ville avec :
  - Le nom de la ville
  - Le pays
  - Le nombre d'habitants
3. **Capital** (qui hérite de **City**) -> Représente une ville avec un monument
    
4. **Employee** (qui hérite de **Personne**) -> Représsente un salarié avec:
  - Le nom de l'entreprise
  - Le salaire mensuel (par défaut 500)
5. **Commercial** (qui hérite de **Employee**) -> Représentente un commercial qui est un rémnunéré suivant le
  chiffre d'affaire de l'entreprise:
  - Chiffre d'affaire de l'entreprise
  - Pourcentage de rémunération
  - Calcul automatique du salaire
6. **TestEntities** -> C'est notre classe pour mener les différents tests

### ⚙️ Fonctionnalités
- Création d'objets avec des constructeurs personnalisés
- encapsulation (getters et setters)
- Affichage des informations avec les méthodes toString()
- Validations des données (salaire, chiffre d'affaire et pourcentage de rémunération)
