public class KasaItem implements  Comparable<KasaItem> {

    private int itemId;
    private Long currentPrice;
    private Long originalPrice;
    private boolean discounted;
    private String img;
    private String itemUrl;
    private String itemName;
    private String breadCrums;
    private String[] category;


    public KasaItem() {
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBreadCrums() {
        return breadCrums;
    }

    public void setBreadCrums(String breadCrums) {
        this.breadCrums = breadCrums;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    @Override
    public int compareTo(KasaItem kasaItem) {
            long compareCurrentPrice = kasaItem.currentPrice;
        return (int) (this.currentPrice - compareCurrentPrice);
    }
}
