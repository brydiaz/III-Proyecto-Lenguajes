
%Determina si un sospechoso tiene un arma
suspect_has_weapon(Id,Weapon):-
     character(Id,_,weapon(Weapon),_,_);
     character(Id,_,_,weapon(Weapon),_);
     character(Id,_,_,_,weapon(Weapon)).

%Se borran sospechosos segun la pista de un arma
delete_suspects(Weapon):-
    next_valid_id(0,NextId), delete_suspects_aux(NextId,Weapon).

delete_suspects_aux(17,_):-!.
delete_suspects_aux(Id,Weapon):-
    %Si el culpable tiene el arma y el sospecho no tiene esa arma,
    (hasWeapon(Weapon), \+suspect_has_weapon(Id,Weapon)), 
        %Se borra el sospechoso.
        (retract(character(Id,_,_,_,_))), next_valid_id(Id,NextId), delete_suspects_aux(NextId,Weapon);
    %Si el culpable no tiene el arma y el sospechoso si la tiene.
    (\+hasWeapon(Weapon), suspect_has_weapon(Id,Weapon)),
        %Se borra el sospechoso
        (retract(character(Id,_,_,_,_))), next_valid_id(Id,NextId), delete_suspects_aux(NextId,Weapon);
    %No se borra el sospechoso    
    next_valid_id(Id,NextId), delete_suspects_aux(NextId,Weapon).

%Recibe un id y retorna el siguiente sospechoso valido
next_valid_id(Id,Result):-
    (Id > 16),(Result is 17),!;
    NewId is Id + 1,
    character(NewId,_,_,_,_) -> (Result is NewId); 
    (NewId is Id + 1, next_valid_id(NewId,Result)).
