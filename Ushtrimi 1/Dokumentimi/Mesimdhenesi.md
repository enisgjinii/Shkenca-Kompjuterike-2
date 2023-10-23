# Mesimdhenesi

Ky projekt përmban një klasë Java të quajtur `Mesimdhenesi` që është dizajnuar për të përfaqësuar informacionin për një mësues. Klasa ka disa atribute dhe metoda të ndryshme për manipulimin e tyre. Kjo është një dokumentacion i shkurtër për klasën.

## Përdorimi

Për të përdorur klasën `Mesimdhenesi` në projektin tuaj, mund të ndiqni hapat e mëposhtëm:

1. Importoni klasën në projektin tuaj:

   ```java
   import Mesimdhenesi;
   ```

2. Krijoni një objekt të kësaj klase:

   ```java
   Mesimdhenesi mesimdhenesi = new Mesimdhenesi("Emri Mesimdhenesit", 1980, "Profesor");
   ```

3. Përdorni metodat e klases për të manipuluar atributet dhe për të bërë operacione të tjera me objektin.

   ```java
   System.out.println(mesimdhenesi.toString());  // Shfaq informacionin e mesimdhenesit
   mesimdhenesi.setVitiLindjes(1990);  // Ndrysho vitin e lindjes
   ```

4. Testoni krahasimin e dy objekteve Mesimdhenesi:

   ```java
   Mesimdhenesi mesimdhenesi2 = new Mesimdhenesi("Emri Mesimdhenesit", 1980, "Profesor");
   System.out.println(mesimdhenesi.equals(mesimdhenesi2));  // Krahaso dy mësimdhënës të njëjtë
   ```