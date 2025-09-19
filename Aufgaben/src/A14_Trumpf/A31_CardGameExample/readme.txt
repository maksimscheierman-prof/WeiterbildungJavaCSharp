

    - Beispiel wie die Spielelogik separat von den Spielerklassen gehandhabt werden kann.
    - Quick and Dirty. Fokus liegt auf der Trennung der Aufgaben für jede Klasse.
    - Für bessere Struktur sollten die Klassen in korrekte Packages eingeordnet werden.


    Klassenzusammenhänge und Aufgaben der Klassen:
    - Participant (Parent)  [Beschreibt was die Personen im Spiel haben]
    ---> Player (Child)     [Besondere Methoden für den Spieler]
    ---> Bot (Child)        [Besondere Methoden für den Computer]

    - Card [ Blaupause für eine einzelne Karte ]

    - Deck (Parent) [ Blaupause für ein ganzes Deck ] ; weil ein Deck aus Karten besteht, kann Deck nicht ohne Card existieren! Es besteht dadurch aber keine Vererbungslogik!
    ---> DeckAnimals (Child)

    - GameLogic [Hier werden karten gemischt und ausgeteilt]

    - Main [ Einstiegspunkt ins Porgramm]