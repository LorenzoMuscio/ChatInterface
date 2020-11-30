# SimpleChat #

SimpleChat est un ensemble de 2 applications permettant de déployer un serveur de chat et un client en Java.

## Besoins fonctionnels ##

L'application doit respecter les besoins suivants :
* Les utilisateurs doivent pouvoir se connecter sur le serveur de chat en même temps
* Un utilisateur doit être averti s'il ne peut pas se connecter au serveur
* Un utilisateur doit être averti s'il est déconnecté du serveur
* Un utilisateur doit pouvoir créer une chatroom
* Un utilisateur NE doit PAS pouvoir créer une nouvelle chatroom ayant le même nom qu'une chatroom déjà existante
* Les utilisateurs doivent pouvoir se connecter à une chatroom simultanément
* Un utilisateur doit pouvoir envoyer un nouveau message sur une chatroom
* Un utilisateur doit recevoir en temps réel les nouveaux messages envoyés dans une chatroom

## Contraintes techniques ##
* Chaque message doit avoir un ID unique sur la plateforme
* Chaque nom de chatroom doit être unique
* Un utilisateur est identifié par son username

## Manuel utilisateur ##

### Déployer le serveur en local ###
`gradlew :server:run --args="1234 2345"`

### Arrêter le serveur ###
`CTRL + c`

### Déployer le client en local ###
`gradlew :clients:console:run --args="127.0.0.1 1234 2345"`

## Références ##

### Test framework for Specifications ###
[Spock framework](http://spockframework.org/)

### UI library for the client app ###
[Lanterna](https://github.com/mabe02/lanterna)

### Web server for the server app ###
[Spark Java](http://sparkjava.com/)
