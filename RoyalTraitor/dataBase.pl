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


:- dynamic(character/5).
:- dynamic(faceUp/5).
:- dynamic(askWeapon/1).
:- dynamic(turn2Arround/0).
:- dynamic(addToSuspects/1).
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
    weapon(sword),
    weapon(mullet),
    weapon(axe)).
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
%LLAMAR A TODOS LOS PERSONAJES DESDE JAVA Y GUARDARLOS

generateGuilty():-
    random(1,17,RandomID),
    character(RandomID,Name, W1,W2, W3),
    assert(guilty(RandomID,Name, W1,W2, W3)).

turn2Arround():-
    random(1,8, R1),
    random(8,17, R2),
    character(R1,Name, W1,W2, W3),
    character(R2,Name2, W12,W22, W32),
    assert(faceUp(R1, Name, W1,W2,W3)),
    assert(faceUp(R2, Name2, W12,W22,W32)).
%SE PODRIAN SACAR DE LA LISTA ACA Y EN AÑADIR A SOSPECHOSO

addToSuspects(NAME):-
    character(IDC,NAME,WC,WC2,WC3),
    assert(faceUp(IDC,NAME,WC,WC2,WC3)).


hasWeapon(Weapon):-
    guilty(_,_,weapon(Weapon),_,_);
    guilty(_,_,_,weapon(Weapon),_);
    guilty(_,_,_,_,weapon(Weapon)).

%Si el cupable tiene el arma no pasa nada, si no la tiene, elimina a los que la tengan 
askWeapon(Weapon):-
    hasWeapon(Weapon)-> 
        retract(faceUp(_,_, weapon(Weapon),_,_));
        retract(faceUp(_,_, _,weapon(Weapon),_));
        retract(faceUp(_,_, _,_,weapon(Weapon))).
