# P02-30 Git resolución de conflictos
## Primer problema
Al hacer push en la segunda carpeta, surge un error que se soluciona haciendo `git pull` y `git push`.
## Segundo problema
Al hacer push en la segunda carpeta, surge un error que se soluciona haciendo `git pull`.
Para hacer el mismo cambio en dos carpetas distintas no sería necesario realizarlo en la segunda, con un pull bastaría. Hacer otro push daría como resultado dos commits idénticos.
## Tercer problema
Al hacer push en la segunda carpeta, surge un error que se soluciona haciendo `git pull` y volviendo a hacer `git add`, `git commit` y `git push`, quedarían reflejados 3 commits, el primero, el segundo que dió error (finalmente se ejecuta) y un tercer commit con los dos commits juntos.
