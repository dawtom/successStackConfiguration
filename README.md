# successStackConfiguration

Jest tutaj postawiony cały stack z wyjątkiem MySQL.

Żeby to zadziałało potrzebny jest lokalnie postawiony serwer MySQL. Na tym serwerze musi być baza danych o nazwie "successTest", oraz użytkownik "root" z hasłem "rootps" (wszystkie te trzy parametry można zmienić w pliku konfiguracyjnym hibernate.cfg.xml (katalog src/main/resources).

Działanie tego przykładu jest następujące: otwiera się okno z dwoma polami tekstowymi i przyciskiem "Display it", po kliknięciu przycisku wartości tych pól są odczytywane przez JavaFX i zapisywane do bazy przez Hibernate.

Jeślibyście mieli problemy z konfiguracją to piszcie. Co prawda konfigurowałem to na Ubuntu, ale wydaje mi się, że te narzędzia są dość uniwersalne i nie będą zależały od systemu operacyjnego.
