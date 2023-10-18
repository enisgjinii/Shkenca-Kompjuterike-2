# Dokumentim i Klasave në Java

Ky është një program i thjeshtë në Java i cili përbëhet nga dy klasa: `Mesimdhenesi` dhe `Fakulteti`. Programi demonstron se si të krijoni instanca të klases `Mesimdhenesi` dhe të vendosni pronat e tyre në metodën `main` të klases `Fakulteti`.

## Tabela e Përmbajtjes

1. [Struktura e Projektit](#struktura-e-projektit)
2. [Si të Kompilohen](#si-të-kompilohen)
3. [Si të Ekzekutohen](#si-të-ekzekutohen)
4. [Përshpjegim i Kodit](#përshpjegim-i-kodit)

## Struktura e Projektit

Projekti është i organizuar në dy dosje të ndara Java:

- `Mesimdhenesi.java`: Permban definicionin e klases `Mesimdhenesi`.
- `Fakulteti.java`: Permban definicionin e klases `Fakulteti` dhe metodën `main`.

## Si të Kompilohen

Për të kompiluar klasat Java, shkoni në direktoriumin ku ndodhen dosjet dhe përdorni komandën `javac`.

```bash
javac Mesimdhenesi.java Fakulteti.java
```

Kjo komandë do të gjenerojë dosjet `.class` për secilën prej dosjeve Java.

## Si të Ekzekutohen

Pas kompilimit të klasave Java, mund të ekzekutoni programin duke përdorur komandën `java`. Ekzekutoni klasën `Fakulteti`, e cila përmban metodën `main`.

```bash
java Fakulteti
```

Kjo komandë do të ekzekutojë klasën `Fakulteti` dhe do të prodhojë rezultatin e programit.

## Përshpjegim i Kodit

- Klasa `Mesimdhenesi`: Kjo klasë definon një model të thjeshtë për një mësues ose profesor me atributet e tij si emri (`emri`), viti i lindjes (`vitiLindjes`), dhe pozita e punës (`angazhimi`). Kjo klase ofron konstruktorë për inicializimin e objektit dhe metoda për të vendosur dhe marrë atributet.

- Klasa `Fakulteti`: Kjo klasë përmban metodën `main`, ku krijohen dhe manipulohen instancat e klases `Mesimdhenesi`. Ajo demonstroi se si të krijoni objekte të klases `Mesimdhenesi`, të vendosni pronat e tyre dhe të shfaqni informacionin për secilën instancë.

Rrjedha e programit mund të përmbledhet në këtë mënyrë:

1. Krijoni instanca të klases `Mesimdhenesi`.
2. Vendosni atributet për secilën instancë.
3. Shfaqni informacionin për secilën instancë të `Mesimdhenesi`.
