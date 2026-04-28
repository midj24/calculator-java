# TEST RESULTS – Calculator Application

## Testing Approach
Testiranje je izvršeno po metodi crne kutije (black-box testing).  
Aplikacija je posmatrana isključivo sa korisničke strane, bez analize izvornog koda.  
Cilj testiranja bio je pronalazak potencijalnih grešaka, nedostataka i nelogičnosti u radu kalkulatora.

---

## Valid Input Tests
- Input: 2+2  
  Expected result: 4  
  Actual result: 4  
  Status: PASS

- Input: 10+5*4+3  
  Expected result: 33  
  Actual result: 33  
  Status: PASS

- Input: 8-3*2  
  Expected result: 2  
  Actual result: 2  
  Status: PASS

- Input: 20/5+1  
  Expected result: 5  
  Actual result: 5  
  Status: PASS

---

## Invalid Input Tests
- Input: 5++2  
  Expected result: Error  
  Actual result: ERROR  
  Status: PASS

- Input: abc  
  Expected result: Error  
  Actual result: ERROR  
  Status: PASS

- Input: 5*  
  Expected result: Error (invalid expression)  
  Actual result: 5  
  Status: FAIL  
  Observation: Calculator prihvata nekompletan izraz i vraća netačan rezultat umesto greške.

- Input: *5  
  Expected result: Error  
  Actual result: ERROR  
  Status: PASS

- Input: 5/  
  Expected result: Error  
  Actual result: 5  
  Status: FAIL  
  Observation: Nekompletan izraz nije adekvatno validiran.

---

## Edge Case Tests
- Input: 10/0  
  Expected result: Error  
  Actual result: Infinity  
  Status: WARNING  
  Observation: Deljenje nulom ne rezultira greškom niti jasnom porukom korisniku.

- Input: 0*5  
  Expected result: 0  
  Actual result: 0  
  Status: PASS

- Input: 0002+3  
  Expected result: 5  
  Actual result: 5  
  Status: PASS
---

## General Observations
- Kalkulator ne vrši potpunu validaciju aritmetičkih izraza.
- Nekompletni izrazi (npr. `5*`, `5/`) mogu vratiti netačan rezultat umesto greške.
- Deljenje nulom nije jasno obrađeno i vraća “Infinity”.
- Aplikacija ne podržava razmake unutar izraza (npr. `5 + 2`).

---

## Conclusion
Black-box testiranjem identifikovano je više funkcionalnih nedostataka u obradi neispravnih i nekompletnih izraza.  
Iako aplikacija ispravno obrađuje validne aritmetičke izraze i poštuje prioritet operacija, validacija ulaza može biti značajno unapređena.
``