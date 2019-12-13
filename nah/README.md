# Zpracovat json soubor s resources

*kasa-items.json* - jeden item
```json
{
  "originalPrice": 799,
  "currentPrice": 599,
  "discounted": true,
  "img": "https://img.kasa.cz/k-foto/280/4/6/0/product_2561064.jpg",
  "itemId": 1459455,
  "itemUrl": "https://www.kasa.cz/fitness-naramek-aligator-m2-m2bk-cerne/",
  "itemName": "Fitness náramek Aligator M2 (M2BK) černé",
  "breadCrums": "KASA.cz > Mobily, Nositelná elektronika > Nositelná elektronika > Fitness náramky",
  "category": [
    "KASA.cz",
    "Mobily, Nositelná elektronika",
    "Nositelná elektronika",
    "Fitness náramky"
  ]
}
```

kasa-items.json obsahuje jednoduchý výčet produktů z jednotlivých kategorií z webu kasa.cz

Vaším úkolem je vytvořit několik metod pracujících s daty v souboru:

- Vytvořte metodu, která vytvoří z parametru **category** strom kategorií
- Vytvořte metodu, která seřadí produkty od nejnižší ceny
- Za pomocí předchozí metody vypšete prvních 50 nejlevnších produktů
- Sečtětě produkty v kategorii **Vestavné domácí spotřebiče**
- Vytvořte medodu, která vypíše pouze zlevněné produkty
- Pomocí první metody vytvořte strom kategorií a poté ke každé kategorii sečtěte počet produktů v dané kategorii (TIP: lze počítat hned při vytváření stromu)
- Vytvořte si pomocnou mapu ve které bude jako klíče **itemId** a jako value rozdíl *originalPrice* a *currentPrice*
- díky předchozí metodě seřaďte produkty od nejvíce zlevněného po ten nejméně a do konzole vypiště jejich název a procentuální slevu