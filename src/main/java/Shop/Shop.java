package Shop;

import Stock.ISell;
import Stock.StockItem;

import java.util.ArrayList;

public class Shop implements ISell {

    private ArrayList<StockItem> stockItems;

    public Shop(ArrayList<StockItem> stockItems) {
        this.stockItems = stockItems;
    }

    public int getStockSize() {
        return stockItems.size();
    }

    public void addStockItem(StockItem stockItem) {
        stockItems.add(stockItem);
    }

    public ArrayList<StockItem> getStockItems() {
        return stockItems;
    }

    public String getStockItemName(int index){
        return stockItems.get(index).getName();
    }

    public void removeStockItem(int index) {
        stockItems.remove(index);
    }

    public void removeSpecificStockItem(StockItem stockItem){
        if (stockItems.contains(stockItem)) {
            stockItems.remove(stockItem);
        }
    }

    public int calculateTotalMarkup(){
        int totalMarkup = 0;
        for (StockItem stockItem : stockItems){
            totalMarkup += calculateMarkup(stockItem.getBuyPrice(), stockItem.getSellPrice());
        }
        return totalMarkup;
    }

    @Override
    public int calculateMarkup(int buyPrice, int sellPrice) {
        return sellPrice - buyPrice;
    }
}