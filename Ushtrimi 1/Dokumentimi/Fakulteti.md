## Përdorimi

Për të përdorur klasën `Fakulteti` në projektin tuaj, mund të ndiqni hapat e mëposhtëm:

1. Krijoni një instancë të kësaj klase duke përdorur konstruktorin:

   ```java
   Fakulteti fakulteti = new Fakulteti("Shkenca Kompjuterike dhe Inxhinieri", 15);
   ```

   Ky rresht krijon një fakultet me drejtimin "Shkenca Kompjuterike dhe Inxhinieri" dhe me mundësi të ruajtjes së 15 mësimdhënësve.

2. Shtoni mësimdhënës në fakultet duke përdorur metodën `shtoMesimdhenesin`:

   ```java
   Mesimdhenesi mesimdhenesi = new Mesimdhenesi("Fistek Filani", 1985, "Asistent");
   fakulteti.shtoMesimdhenesin(mesimdhenesi);
   ```

3. Testoni ekzistencën e një mësimdhënësi në fakultet përmes metodes `ekziston`:

   ```java
   boolean ekziston = fakulteti.ekziston(new Mesimdhenesi("Fistek Filani", 1985, "Asistent"));
   System.out.println("Ekziston 'Fistek Filani : 1985 - Asistent'? " + ekziston);
   ```

4. Për të gjetur mësimdhënësin më të ri në fakultet, përdorni metodën `mesimdhenesiMeIRi`:

   ```java
   Mesimdhenesi mesimdhenesiIRi = fakulteti.mesimdhenesiMeIRi();
   if (mesimdhenesiIRi != null) {
       System.out.println("Mësimdhënësi më i ri: " + mesimdhenesiIRi.toString());
   } else {
       System.out.println("Nuk ka mësimdhënës në fakultet.");
   }
   ```

5. Për të gjetur dhe shtypur (afishuar) mësimdhënësit me një angazhim të caktuar, përdorni metodën `shtypAngazhimet`:

   ```java
   fakulteti.shtypAngazhimet("Profesor");
   ```
