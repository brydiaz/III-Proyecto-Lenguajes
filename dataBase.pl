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


hasWeapon(Name, Weapon):-
    character(Name,weapon(Weapon),,);
    character(Name,,weapon(Weapon),);
    character(Name,,,weapon(Weapon)).

%S P W
character(aristocrate,
    weapon(potion),
    weapon(wand),
    weapon(shuriken)).
%B C S
character(bard,
    weapon(bow),
    weapon(crossbow),
    weapon(spear)).
%C G P
character(clown,
    weapon(potion),
    weapon(gem),
    weapon(shuriken)).
%D M W
character(cultist,
    weapon(wand),
    weapon(dreamCatcher),
    weapon(mallet)).
%C K S 
character(spirit,
    weapon(spear),
    weapon(crossbow),
    weapon(key)).
%A M S 
character(healer,
    weapon(sword),
    weapon(mullet),
    weapon(axe)).
%B K S
character(king,
    weapon(sword),
    weapon(bow),
    weapon(key)).
%G S S
character(mask,
    weapon(shuriken),
    weapon(sword),
    weapon(gem)).

%F S W
character(poprigunchik,
    weapon(wand),
    weapon(spear),
    weapon(flail)).
%A C F
character(prince,
    weapon(flail),
    weapon(axe),
    weapon(crossbow)).
%B D S
character(princess,
    weapon(bow),
    weapon(dreamCatcher),
    weapon(spear)).
%P S K 
character(snow,
    weapon(potion),
    weapon(shuriken),
    weapon(key)).
%A F M
character(mohawk,
    weapon(axe),
    weapon(flail),
    weapon(mallet)).
%B  G S
character(child,
    weapon(bow),
    weapon(sword),
    weapon(gem)).
%D P W
character(oldman,
    weapon(wand),
    weapon(dreamCatcher),
    weapon(potion)).
%F G M
character(doll,
    weapon(mallet),
    weapon(flail),
    weapon(gem)).
