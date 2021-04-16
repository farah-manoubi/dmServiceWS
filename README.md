
Réalisé par MANOUBI Farah et DENDOUNE Rayane.
manoubi.farah@yahoo.com, rayane.dendoune@gmail.com.
16/04/21  
Université Cergy-Pontoise 


<h2 align="center"> Description des services </h2>

### 1) Service WS
Concernant la réalisation de ce projet de WebService, la première étape a été la mise en place d'un service web de type WS. Notre application est divisée en 3 différents packages:
* Package com.webservice.model 
* Package com.webservice.service

Le premier package "com.webservice.model" comporte nos classes de données qui sont aux nombre de 2 : 
* Country
* Politician

Ces classes vont nous permettre de modéliser un objet représentant un pays ainsi qu'un objet modélisant un politicien.
Dans le deuxieme package "com.webservice.service ", ce dernier comporte l'interface dans laquelle sont décrites les méthodes fournis par le notre service web. Ces méthodes ont été implémentées dans une autre classe "CountryImplement". Cette classe comporte 3 méthodes:
* addCountry
* addPolitician
* getPoliticianByCountry
La méthode "addCountry" permet à un client d'ajouter un pays à notre web service.
La méthode "addPolitician" permet à un client d'ajouter un politicien en précisant son nom, son âge, sa popularité et son pays.
La méthode "getPoliticianByCountry" permet de récupérer une liste de politiciens en fonction du pays choisit par le client.

Pour pouvoir créer notre service web, nous avons ajouté des annotations "jax-ws", qui comporte :
* @WebService précédent le nom de notre interface.
* @WebMethode précédent chacune de nos méthodes.
* @WebResult correspondant au nom du résultat pour chaque méthode.


### 2) Service RS

<h2 align="center"> Description des clients </h2>

### 1) Client WS
### 2) Clien RS

<h2 align="center"> Démonstration d'une fonctionnalité de notre implémentation </h2>

### 1) Client WS
### 2) Client RS
