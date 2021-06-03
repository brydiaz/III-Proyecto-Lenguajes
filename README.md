# RoyalTraitor!

<br><br>

## :notebook: Descripción del proyecto


El proyecto presente tiene cómo objetivo representar un similar al "OutFoxed", un juego de mesa que tiene cómo objetivo encontrar al ladrón mediante descarte, observando pistas y prestando atención a los detalles, todo antes de que el ladrón logre llegar a la salida. Antes de explicar a fondo el cómo funciona el juego, se debe mencionar que todo el trabajo está realizado en Prolog (parte lógica) y Java (parte gráfica) con el fin de promover el conocimiento de un nuevo paradigma y a su vez, analizar y aplicar el cómo 2 lenguajes de programación diferentes se pueden ayudar entre sí para lograr una solución.


<br><br>

### :game_die: Explicación del juego


#### Que debe tener el juego

- El tablero de juego.
- 16 cartas de sospechosos (cada sospechoso con 3 prendas distintas) con su respectivo nombre.
- 16 cartas de ladrones (para elegir uno aleatorio en cada partida) iguales a las de sospechosos.
- 3 dados, cada uno 3 iconos únicamente: ojos, almohadillas y fallo.
- Decodificador de pistas.
- Las pistas.
- Representación del ladrón en el tablero.

<br><br>

#### Cómo está organizado el juego

1. Se muestra todo el tablero de juego, ahí mismo, se observan 16 cartas de sospechosos de las cuales solo 2 están al descubierto en un inicio. El ladrón está al inicio del camino en el tablero.

2. Al lanzar loa dados puede suceder lo siguiente:
      - En caso de obtener 2 dados con ojos, se revela una pista.
      - Si se tienen 2 dados con "patitas" dibujadas, se revela 2 sospechosos.

3. Para revelar una pista:
      - Se saca una pista (en este caso una de las armas), se mete en el decodificador de pistas y se verifica si el ladrón tiene esa arma o no la tiene.
      - Se verifican cuales sospechosos no tienen el arma y se quitan de la vista, ya no son necesarios.

4. El juego termina cuando:
      - Se cree tener al sospechoso, se dice su nombre y se revela al ladrón, de coincidir el nombre dicho se gana el juego, caso contrario se pierde.
      - Se han eliminado todas las opciones de sospechosos excepto una, si concuerdan se gana el juego, en caso contrario, se pierde el juego.
      - El ladrón llega al final del camino en el tablero, si esto sucede automáticamente se pierde el juego.




<br><br><br><br>

## :video_game: Pasos necesarios para la ejecución del programa

1. Lanzar el juego desde NetBeans, recuerde tener configurado dicho programa para que pueda acceder al conector entre Java y Prolog.
2. Darle correr al programa para iniciar.
3. Dar click en la opción de "iniciar a jugar".
4. En el tablero de juego debe lanzar los dados para poder jugar, esto se logra dando click en el respectivo botón señalado.
      - Si los dados muestran 2 ojos, se mostrará una pista de que arma tiene el ladrón.
      - Si las dados muestras 2 almohadillas, se mostrará un sospechoso.
      - Caso contrario a los anteriores el ladrón se mueve un espacio.
5. Puede escribir el nombre de quien cree que es el sospechoso en el momento que desee, pero de fallar el nombre, perderá.
6. Si sabe quien es el sospechoso y al escribir su nombre es el correcto, ganará.
7. Recuerde que el ladrón se va a ir moviendo cada vez que los dados correspondan con ello, si el ladrón llega a la meta, perderá.


<br><br><br><br>





## :video_camera: Links a los vídeos explicativos de los integrantes del grupo
**Jose Alexander Artavia Quesada:** _(Aquí va el link de YouTube)_
<br>

**Bryan Andrey Díaz Barrientos:** https://youtu.be/MCGv-oZD2MY
<br> 

**Josué Gerardo Gutiérrez Mora:** https://youtu.be/s-TcYQyFYFI
