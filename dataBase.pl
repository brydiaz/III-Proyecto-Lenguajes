weapon(sword).
weapon(key).
weapon(spear).
weapon(shuriken).
weapon(mallet).
weapon(axe).
weapon(flail).
weapon(gem).
weapon(crossbow).
weapon(dreamCatcher).
weapon(wand).
weapon(bow).
weapon(potion).


:- dynamic(character/5).
:- dynamic(askWeapon/1).
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
    weapon(mallet)).
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
    weapon(mallet)).
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
    weapon(mallet),
    weapon(flail),
    weapon(gem)).

generateGuilty():-
    random(1,17,RandomID),
    character(RandomID,Name, W1,W2, W3),
    assert(guilty(RandomID,Name, W1,W2, W3)).
    
hasWeapon(Weapon):-
    guilty(_,_,weapon(Weapon),_,_);
    guilty(_,_,_,weapon(Weapon),_);
    guilty(_,_,_,_,weapon(Weapon)).

askWeapon(Weapon):-
    hasWeapon(Weapon)->
        retract(character(_,_, weapon(Weapon),_,_));
        retract(character(_,_, _,weapon(Weapon),_));
        retract(character(_,_, _,_,weapon(Weapon))).
