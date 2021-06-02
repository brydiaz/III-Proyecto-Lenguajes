% HECHOS
% armas
weapon(sword).
weapon(key).
weapon(spear).
weapon(shuriken).
weapon(mullet).
weapon(axe).
weapon(flail).
weapon(gem).
weapon(crossbow).
weapon(dreamCatcher).
weapon(wand).
weapon(bow).
weapon(potion).

%GUARDAR LOS PERSONAJES DE FORMA DINAMICA
:- dynamic character/1.
:- dynamic faceUp/1.
:- dynamic askWeapon/1.
:- dynamic turn2Arround/1.
:- dynamic addToSuspects/1.
:- dynamic deleteAllSuspectsW1/1.
:- dynamic deleteAllSuspectsW2/1.
:- dynamic deleteAllSuspectsW3/1.



% HECHOS
% personajes

%S P W
character(1,aristocrate,
    weapon(potion),
    weapon(wand),
    weapon(shuriken)).
%B C S
character(2,bard,
    weapon(bow),
    weapon(crossbow),
    weapon(spear)).
%C G P
character(3,clown,
    weapon(potion),
    weapon(gem),
    weapon(shuriken)).
%D M W
character(4,cultist,
    weapon(wand),
    weapon(dreamCatcher),
    weapon(mullet)).
%C K S 
character(5,spirit,
    weapon(spear),
    weapon(crossbow),
    weapon(key)).
%A M S 
character(6,healer,
    
    weapon(mullet),
    weapon(axe),
    weapon(sword)).
%B K S
character(7,king,
    weapon(sword),
    weapon(bow),
    weapon(key)).
%G S S
character(8,mask,
    weapon(shuriken),
    weapon(sword),
    weapon(gem)).

%F S W
character(9,poprigunchik,
    weapon(wand),
    weapon(spear),
    weapon(flail)).
%A C F
character(10,prince,
    weapon(flail),
    weapon(axe),
    weapon(crossbow)).
%B D S
character(11,princess,
    weapon(bow),
    weapon(dreamCatcher),
    weapon(spear)).
%P S K 
character(12,snow,
    weapon(potion),
    weapon(shuriken),
    weapon(key)).
%A F M
character(13,mohawk,
    weapon(axe),
    weapon(flail),
    weapon(mullet)).
%B  G S
character(14,child,
    weapon(bow),
    weapon(sword),
    weapon(gem)).
%D P W
character(15,oldman,
    weapon(wand),
    weapon(dreamCatcher),
    weapon(potion)).
%F G M
character(16,doll,
    weapon(mullet),
    weapon(flail),
    weapon(gem)).

%-------------------------------------------------------



%=======================================================
%LLAMAR A TODOS LOS PERSONAJES DESDE JAVA Y GUARDARLOS
%=======================================================


% Generar un culpable de manera random según su ID
generateGuilty():-
    random(1,17,RandomID),
    character(RandomID,Name, W1,W2, W3),
    assert(guilty(RandomID,Name, W1,W2, W3)).


% Se voltean 2 posibles culpables de manera random
turn2Arround():-
    random(1,8, R1),
    random(8,17, R2),
    character(R1,Name, W1,W2, W3),
    character(R2,Name2, W12,W22, W32),
    assert(faceUp(R1, Name, W1,W2,W3)),
    assert(faceUp(R2, Name2, W12,W22,W32)).


%=========================================================
%SE PODRIAN SACAR DE LA LISTA ACA Y EN AÑADIR A SOSPECHOSO
%=========================================================

% Añade un personaje a los sospechosos
addToSuspects(NAME):-
    character(IDC,NAME,WC,WC2,WC3),
    assert(faceUp(IDC,NAME,WC,WC2,WC3)).


% Verifica si un personaje tiene X arma
hasWeapon(Weapon):-
    guilty(_,_,weapon(Weapon),_,_)->true;
    guilty(_,_,_,weapon(Weapon),_)->true;
    guilty(_,_,_,_,weapon(Weapon))-> true;
    2=1,!.

deleteAllSuspectsW1(Weapon):-
    Weapon,
    retract(faceUp(_,_, Weapon,_,_))->
    deleteAllSuspectsW1(Weapon);
    true, !.

deleteAllSuspectsW2(Weapon):-
    Weapon,
    retract(faceUp(_,_,_,Weapon,_))->
    deleteAllSuspectsW2(Weapon);
    true, !.

deleteAllSuspectsW3(Weapon):-
    Weapon,
    retract(faceUp(_,_,_,_,Weapon))->
    deleteAllSuspectsW3(Weapon);
    true, !.

%Si el cupable tiene el arma no pasa nada, si no la tiene, elimina a los que la tengan 
askWeapon(Weapon):-
    hasWeapon(Weapon)-> true;
        %SI ESTÁ EN EL PRIMERO, SEGUNDO Y TERCERO LOS BORRA EN ESE ORDEN
        deleteAllSuspectsW1(weapon(Weapon)),
        deleteAllSuspectsW2(weapon(Weapon)),
        deleteAllSuspectsW3(weapon(Weapon))->write('Borrado')
        ->false;
       
        false.