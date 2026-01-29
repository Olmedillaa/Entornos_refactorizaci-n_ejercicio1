# Refactorización de un poryecto
## Dado un código sin variables especificadas, he tenido que refacotrizar todas las variables para poder entender el programa 
1. Pasamos los **números** del array para comprobar entre ellos.
2. Una vez declarados las **variables**, creas los búcles y haces los prints para ver el código.
```java
for (int i = 1; i < array.length; i++) {
            if (array[i] > auxiliar) {
                auxiliar = array[i];
            }
        }
```
3. Muestra si se **repite** el número más alto.
4. Por último crear cual es la media y hacer una pequeña comparación para ver si es más o menos de 5.
```java
if (media >= 5) {
            System.out.println("La media es mayor que 5");
        } else {
            System.out.println("La media es menor que 5");
        }
```
6. Pones **comentarios** para aclarar que es cada cosa
   
## Héctor Olmedilla Calero
