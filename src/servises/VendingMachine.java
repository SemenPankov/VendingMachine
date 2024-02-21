package servises;

import java.util.List;
import domen.Prodyct;

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDespenser coinDespenser;
    private List<Prodyct> prodycts;
    
    public VendingMachine(Holder holder, Display display, CoinDespenser coinDespenser, List<Prodyct> prodycts) {
        this.holder = holder;
        this.display = display;
        this.coinDespenser = coinDespenser;
        this.prodycts = prodycts;
    }
    public Holder getHolder() {
        return holder;
    }
    public void setHolder(Holder holder) {
        this.holder = holder;
    }
    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public CoinDespenser getCoinDespenser() {
        return coinDespenser;
    }
    public void setCoinDespenser(CoinDespenser coinDespenser) {
        this.coinDespenser = coinDespenser;
    }
    public List<Prodyct> getProdycts() {
        return prodycts;
    }
    public void setProdycts(List<Prodyct> prodycts) {
        this.prodycts = prodycts;
    }
    /**
     * @apiNote добавление продукта в апарат
     * @param prodyct объект добавляемого продукта
     */
    public void addProdyct(Prodyct prodyct) {
        if (prodyct.getPrise() <= 0) {
            prodyct.setPrise(100);
        }
        this.prodycts.add(prodyct);
    }
}
