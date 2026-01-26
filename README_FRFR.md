# myjava-app
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://openjdk.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.2.1-blue.svg)](https://www.gradle.org/)
## Aperçu

Il s'agit d'un petit projet que j'ai créé en apprenant la programmation Java.

> Note : Il s'agit principalement d'un dépôt d'apprentissage personnel. Le code ici peut être simpliste ou expérimental. N'hésitez pas à emprunter toute partie utile pour votre propre apprentissage.

> [!TIP]
> Si vous souhaitez construire une version plus ancienne du projet (<=1.14.1),
> veuillez utiliser Maven.

> [!WARNING]
> Ce projet utilise la licence GPLv3 pour distribuer le code source. Veuillez maintenir le logiciel toujours libre.

> [!NOTE]
>
> La dernière version publiée (Release) :
>
> **1.14.2**
>

## Prérequis

- Java 25
- Gradle 9.3.0

## Utilisation

```bash
# Créer le package JAR (avec dépendances incluses)
./gradlew shadowJar
# Compiler
./gradlew compileJava
```

## Fonctionnalités

- Syntaxe Java de base
- Exemples de Programmation Orientée Objet (POO)
- Configuration Gradle
- Tests JUnit

## Classe principale & Nom du package

### Classe principale

Attention, la classe principale de ce projet est App.class. Normalement, veuillez ne pas la déplacer en dehors du dossier src.

### Nom du package

Le nom du package pour ce projet est com.myjava.app et com.myjava.tests.

```java
package com.myjava.app;
```

ou

```java
package com.myjava.tests;
```

## À propos du dossier d'archive

Étant donné que les fichiers JAVA de ce projet sont séparés, afin d'économiser les performances, les fichiers JAVA temporairement inutiles sont placés dans le dossier archive.

Cependant, si vous souhaitez compiler et exécuter les fichiers JAVA du dossier archive, vous pouvez exécuter les commandes suivantes :

```bash
cd archive && mv Le-fichier-JAVA-dont-vous-avez-besoin.java ../app/src/main/java/com/myjava/app/ && cd .. && ./gradlew compileJava && ./gradlew shadowJar
```

> [!CAUTION]
> Ce projet est construit avec OpenJDK.