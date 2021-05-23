# OutFoxed!

<br><br>

## :notebook: Descripción del proyecto


El proyecto presente tiene cómo objetivo representar el juego "OutFoxed", un juego de mesa que tiene cómo objetivo encontrar al ladrón mediante descarte, observando pistas y prestando atención a los detalles, todo antes de que el ladrón logre llegar a la salida. Antes de explicar a fondo el cómo funciona el juego, se debe mencionar que todo el trabajo está realizado en Prolog (parte lógica) y Java (parte gráfica) con el fin de promover el conocimiento de un nuevo paradigma y a su vez, analizar y aplicar el cómo 2 lenguajes de programación diferentes se pueden ayudar entre sí para lograr una solución.


<br><br>

### :game_die: Explicación del juego


#### Que debe tener el juego

- El tablero de juego
- 16 cartas de sospechosos (cada sospechoso con 3 prendas distintas) con su respectivo nombre
- 16 cartas de ladrones (para elegir uno aleatorio en cada partida) iguales a las de sospechosos
- 3 dados, cada uno 2 iconos únicamente: ojos y almohadillas
- Decodificador de pistas
- Las pistas
- Representación del jugador, en este caso un sombrero de color
- Representación del zorro en el tablero

<br><br>

#### Cómo está organizado el juego

1. Se muestra todo el tablero de juego, ahí mismo, se observan 16 cartas de sospechosos de las cuales solo 2 están al descubierto en un inicio. El ladrón está al inicio del camino en el tablero.

2. Se debe elegir que se quiere obtener en los dados (ojos o almohadillas):
      - Se pueden lanzar los dados 3 veces, los dados que salgan y tengan el icono de lo que se busca no hace falta volverlos a lanzar.
      - si lanza las 3 veces y no tiene los 3 iconos de lo elegido, el zorro avanza 3 campos.
      

3. En caso de obetener en los dados lo que se eligió puede suceder lo siguiente:
      - En caso de obtener los 3 dados con ojos, el jugador tiene derecho a voltear 2 de las 16  cartas de sospechosos
      - Si se tienen los 3 dados con "patitas" dibujadas, se puede mover al sombrero detective ese número de espacios ya sea vertical u horizontal. La idea es moverse para llegar al punto donde se pueda revelar una pista ( en caso de no llegar, simplemente se debe de mover y ya, en algún momento llegará a un punto de pista)

4. Para revelar una pista se debe:
      - Se saca una pista (en este caso una de las prendas), se mete en el decodificador de pistas y se verifica si el ladrón tiene esa prenda o no la tiene
      - Cada localización solo puede tener una pista
      - Se verifican cuales sospechosos no tienen la prenda y se quitan de la vista, ya no son necesarios

5. El juego termina cuando:
      - Se cree tener al sospechoso, se dice su nombre y se revela al ladrón, de coincidir el nombre dicho se gana el juego, caso contrario se pierde
      - Se han eliminado todas las opciones de sospechosos excepto una, se voltea la carta y se muestra la carta del ladrón, si concuerdan se gana el juego, en caso contrario, se pierde el juego.
      - El zorro llega al final del camino en el tablero, si esto sucede automáticamente se pierde el juego




<br><br><br><br>

## :video_game: Pasos necesarios para la ejecución del programa en la consola interactiva




<br><br><br><br>





## :video_camera: Links a los vídeos explicativos de los integrantes del grupo
**Jose Alexander Artavia Quesada:** _(Aquí va el link de YouTube)_
<br>

**Bryan Andrey Díaz Barrientos:** _(Aquí va el link de YouTube)_
<br> 

**Josué Gerardo Gutiérrez Mora:** _(Aquí va el link de YouTube)_
