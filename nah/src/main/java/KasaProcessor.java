import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.effect.Blend;

import java.io.*;
import java.util.*;

public class KasaProcessor {

    public KasaItem[] kasaItems;

    public KasaProcessor() {
        loadItems();
    }

    /**
     * Načíst přes ObjectMapper z knihovny jackson
     * tutorial: http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
     */
    private void loadItems() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("kasa.json").getFile());

        ObjectMapper objectMapper = new ObjectMapper();
        try (Reader reader = new FileReader(file)) {
            KasaItem[] items = objectMapper.readValue(reader, KasaItem[].class);
            kasaItems = items;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createCategoryTree() {
        //TODO vytvořte strom kategorií z parametru category

        loadItems();
        Map<String, Object> categoryTree = new HashMap<>();
        for (KasaItem i : kasaItems) {
            String[] categories = i.getCategory();
            Map<String, Object> temp = categoryTree;
            for (int j = 1; j < categories.length; j++) {
                String category = categories[j];
                if (temp.containsKey(category)) {
                    temp = (Map<String, Object>) temp.get(category);
                } else {
                    temp.put(category, new HashMap<String, Object>());
                    temp = (Map<String, Object>) temp.get(category);
                }
            }
        }
        categoryTree.size();
    }

    public void sortProductByPrice() {
        loadItems();
        Arrays.sort(kasaItems);
        for (KasaItem i : kasaItems) {
            System.out.println("currentPrice: " + i.getCurrentPrice());
            System.out.println("itemId: " + i.getItemId());
        }
    }

    public void printFirstSortedProducts() {
        //TODO Za pomocí předchozí metody vypšete prvních 50 nejlevnších produktů

    }

    public void sortProductsInCategory() {
        //TODO Sečtětě produkty v kategorii Vestavné domácí spotřebiče
    }

    public void printOnlyDiscountedProducts() {
        loadItems();
        for (KasaItem i : kasaItems) {
            if (i.isDiscounted()) {
                System.out.println(i.getItemName());
                System.out.println("current price:" + i.getCurrentPrice());
                System.out.println("original price:" + i.getOriginalPrice());
                System.out.println(i.getBreadCrums());
                System.out.println(i.getCategory());
                System.out.println(i.getImg());
                System.out.println(i.getItemId());
                System.out.println(i.getItemUrl());
                System.out.println(" ");
            }
        }
    }

    public void createCategoryTreeWithProductsCount() {
        //TODO Pomocí první metody vytvořte strom kategorií a poté ke každé kategorii sečtěte počet produktů v dané kategorii (TIP: lze počítat hned při vytváření stromu)
        loadItems();
        Map<String, Object> categoryTree = new HashMap<>();
        int count = 0;
        for (KasaItem i : kasaItems) {
            String[] categories = i.getCategory();
            Map<String, Object> temp = categoryTree;
            for (int j = 1; j < categories.length; j++) {
                String category = categories[j];
                if (temp.containsKey(category)) {
                    temp = (Map<String, Object>) temp.get(category);
                } else {
                    temp.put(category, new HashMap<String, Object>());
                    temp = (Map<String, Object>) temp.get(category);
                }
                count++;
            }
        }
        categoryTree.size();
    }

    public void createMap() {
        //TODO Vytvořte si pomocnou mapu ve které bude jako klíče itemId a jako value rozdíl originalPrice a currentPrice
    }
}
