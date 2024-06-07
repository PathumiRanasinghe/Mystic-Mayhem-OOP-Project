# Mystic Mayhem

Mystic Mayhem is a turn-based game between two players. Each player has an army  consisting of an Archer, a Knight, a Mage, a Healer, and a Mythical Creature.
 Users of the game need to create user profiles, providing a name and a username. The  name can be changed at any time, but the username cannot be changed once created. The
 username is a unique value; no two players can have the same username. If an attempt is  made to create a new player profile with an existing username, the user should be notified
 that the username is already taken and should be prompted to enter a new username. Each  user should also have a unique integer userID, which should be given by the system.
 Upon creating a profile, a user is awarded 500 gold coins by default. More coins can be  earned in combat; when two players combat, the winner gets 10% of the loser’s coins. In
 case of a draw, no coins are exchanged. Further, winning a match increases the XP of a  player by 1.
 Players can use gold coins to buy their army and equipment.  A player should have exactly one character from each of the categories Archer, Knight,
 Mage, Healer, and Mythical Creature. A new player will not have an army or equipment; in  order to combat, he or she would have to start by creating an army. If they wish to buy a new
 character at a later point, the existing character in that category can be sold for 90% of its  current value. Each character has attack, defense, health, and speed values. The characters
 available in the game are as follows.

![Screenshot (309)](https://github.com/PathumiRanasinghe/Project3_OOP/assets/162596287/baa0ef84-983e-46f2-ab6d-30b36eaa4311)

 Equipmentcanalsobebought toimprovethecharacters.Uponbuyingapieceof  equipment, thecurrentvalueof thecharacterincreasesby20%of thepriceof the
 equipment.Equipment isof twotypes:artefactsandarmour.Eachcharactercanhaveupto  1artefactand1armouratagiventime.Bydefault,noneof thecharactershaveequipment.
 If theplayerchangestheequipmentofacharacter,existingequipmentof thesamekind  wouldbediscarded.Wieldingequipmentcanchangethepropertiesofcharacters.The
 availableequipment isasfollows.

 ![Screenshot (310)](https://github.com/PathumiRanasinghe/Project3_OOP/assets/162596287/ad4e4b59-2220-475b-b969-9b98884c591a)

 
 Incombat, thecharacterstaketurnstoattack, intheorderofspeed.Thepersonwho  declareswarwill takethefirst turn.Thecharacterof thatplayerwiththehighestspeedwill
 attackfirst, followedbythecharacterof theopposingplayerwiththehighestspeed,andso  onandsoforth.Eachplayerwillbegiven10turns.Aplayerwinsagamebykillingall
 charactersof theopposingarmy. Ifbothteamsarestandingat theendof10turns, thebattle  isconsideredtobeadraw.TheattackofArchers,Knights,Mages,andMythicalCreatures
 willbetargetedonthecharacterof theopposingteamwiththelowestdefence.Whenoneof  thesecharactersattacks, thehealthof thedefenderwillbereducedby[0.5*(attackvalueof
 attackingcharacter)-0.1*(defencevalueofdefendingcharacter)].However,ahealer’s  attackisfocusedonhealingone’sownarmyinsteadofdamagingtheenemy.Therefore,
 whenahealerattacks, thehealthof thecharacterintheirownarmywiththelowesthealthis increased by 0.1*(attack value of healer). Once a character’s health reaches 0, it dies and
 cannot be revived till the battle ends. After a battle ends, all the characters are restored to  their state before the battle.
 
 Among characters with the same speed, the priority order of attacking is as follows.
 
 *Healer < Mage < Mythical Creature < Knight < Archer*
 
 Among characters with the same defence, the priority order of receiving attacks is as follows.
 
*Mage < Knight< Archer < Mythical Creature < Healer*

 Each player can select a home ground for their battles. When a player challenges another  player to combat, the battle will occur at the home ground of the player who is being challenged.
 
 Home grounds can be of four types: Hillcrest, Marshland, Desert, and Arcane. Further, the  characters can be divided into four categories as Highlanders, Marshlanders, SunChildren, and Mystics.
 
 *Highlanders: Shooter, Ranger, Cavalier, Zoro, Enchanter, Conjurer, Medic
 Marshlanders: Squire, Swiftblade, Warlock, Alchemist, Basilisk, Hydra
 Sunchildren: Sunfire, Zing, Templar, Soother, Lightbringer, Dragon, Phoenix
 Mystics: Saggitarius, Illusionist, Eldritch, Saint, Pegasus*
 
 In Hillcrest, the attack and defence of highlanders increase by 1 while the speed of marshlanders and sunchildren decrease by 1. When attacking in Hillcrest, each highlander
 can follow each of their turns with a bonus turn with 20% of their attack power. In Marshland, the defence of marshlanders increases by 2 while the attack of sunchildren
 decreases by 1. The speed of mystics also decreases by 1. In Desert, the health of marshlanders decreases by 1 while the attack of sunchildren increases by 1.
 In Arcane, the attack of mystics increases by 2 while the speed and defence of highlanders and marshlanders decrease by 1. When attacking in arcane, mystics increase their own
 health by 10% after each of their turns. In the game, players can look for opponents to battle. Here, the statistics of another randomly chosen player are displayed, and the player can either challenge them to battle or
 skip to the next player. It should be noted that only the names of the characters and the XP level of the player are displayed here. Home ground and customization details of characters
 like armour and artefacts will not be shown. Calculations of gold coins should be done to the nearest whole number and calculations of ttack, defense, health, and speed values should be done to the nearest first decimal place.
 Considering the above details, develop an object-oriented implementation for Mystic Mayhem using Java.
 
 Create the following player profile:
 #### Player 1
 *Name: GeraltofRivia
 Username: whitewolf
 XP: 32
 Gold coins: 215
 Homeground: Marshland
 Archer: Ranger + Chainmail
 Knight: Squire
 Mage: Warlock
 Healer: Medic + Amulet
 Mythical Creature: Dragon*
 
 Create a player profile of your own and customize it without exceeding the 500 gold coins initially awarded. Challenge whitewolf to battle.
 For each turn taken, the player who is taking the turn, the attacker, the defender, and the outcome of the turn should be printed. At the end of the battle, the outcome of the battle should be printed.
