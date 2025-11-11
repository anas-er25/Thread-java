# Thread en java

## Exercice 1 - Nombres pairs et impairs

- Version 1 : Affichage non synchronisé (ordre aléatoire)
- Version 2 : Utilisation de wait() et notify() pour une alternance parfaite (0 à 20 en ordre)

## Exercice 2 - Threads nommés avec délais aléatoires

- Création de 3 threads nommés (Alpha, Beta, Gamma)
- Chaque thread attend un délai aléatoire (0-200ms) avant d'afficher son nom
- Le thread principal attend la fin avec join()
