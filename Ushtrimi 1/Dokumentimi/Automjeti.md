# Automjeti

Ky është një dokumentacion i shkurtër për klasën `Automjeti` në Java, e cila përfaqëson një automjet me atributet e tij, duke përfshirë numrin e shasisë, prodhuesin dhe vitin e prodhimit.

## Përdorimi

Për të përdorur klasën `Automjeti` në projektin tuaj, ndiqni këto hapa:

1. Krijo një instancë të kësaj klase duke përdorur konstruktorin:

   ```java
   Automjeti automjeti = new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015);
   ```

   Ky rresht krijo një objekt `Automjeti` me numrin e shasisë "XYZABC123409873CDE", prodhuesin "Mercedes-Benz", dhe vitin e prodhimit 2015.

2. Për të lexuar vlerat e atributave ose ndryshuar ato, përdorni metodat `get` dhe `set` përkatëse. Për shembull:

   ```java
   String prodhuesi = automjeti.getProdhuesi();
   int vitiProdhimit = automjeti.getVitiProdhimit();

   automjeti.setProdhuesi("Audi");
   automjeti.setVitiProdhimit(2018);
   ```

3. Për të paraqitur objektin në formatin e kërkuar, përdorni metodën `toString`:

   ```java
   System.out.println(automjeti.toString());
   ```

4. Për krahasimin e dy objekteve `Automjeti`, përdorni metodën `equals`:

   ```java
   Automjeti automjeti2 = new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015);
   boolean janeTeNjejte = automjeti.equals(automjeti2);
   ```
