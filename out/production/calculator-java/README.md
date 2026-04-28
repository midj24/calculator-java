## Project Overview
Projekat predstavlja jednostavnu Java konzolnu aplikaciju za evaluaciju aritmetičkih izraza.
Analiza obuhvata samo Java fajlove (`Calculator.java` i `Start.java`). `LICENSE.txt` nije uključen jer ne predstavlja izvorni kod.

---
## Lines of Code (LOC)
U LOC metriku uključene su samo linije koje sadrže izvorni kod.
Prazni redovi i komentari nisu računati.

| File name       | LOC |
|-----------------|-----|
| Calculator.java | 112 |
| Start.java      |  19 |
| **Total LOC**   | 131 |

---
## Static Analysis & Observations
Calculator.java – 112 LOC – Klasa sadrži kompletnu logiku parsiranja i evaluacije izraza. Metoda `Calculate` je kompleksna i sadrži veliki broj uslova, što utiče na čitljivost i održavanje koda.
Start.java – 19 LOC – Klasa sadrži main metodu i rukuje korisničkim unosom putem konzole. Kod je jednostavan, ali se `Scanner` objekat kreira unutar while petlje.

---
## Code Smells
- Metoda `Calculate` je dugačka i kompleksna
- Klasa `Calculator` ima više odgovornosti
- Nedostaju JavaDoc komentari
- Neefikasno upravljanje resursima (`Scanner` u petlji)

---
## Conclusion
Projekat je mali i funkcionalan, sa umerenim brojem linija koda.
Statička analiza ukazuje na mogućnosti poboljšanja u pogledu modularnosti, čitljivosti i održavanja koda.
