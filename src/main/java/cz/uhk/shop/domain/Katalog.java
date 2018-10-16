package cz.uhk.shop.domain;

import java.util.List;

/**
 * Rozhrani pro spravu katalogu polozek
 * @author kozelto1
 */
public interface Katalog {
    
    /**
     * Vraci seznam položek katalogu
     * @return seznam
     */
    public List<Polozka> getPolozky();
    /**
     * Přidává položku do katalogu
     * @param p polozka k pridani
     */
    public void pridej(Polozka p);
    /**
     * Odstraňuje instanci položky
     * @param p polozka k odstraneni
     */
    public void odstran(Polozka p);
    /**
     * Odstraňuje položku dle id
     * @param id ID polozk k odstraneni
     */
    public void odstran(int id);
    /**
     * Vrací položku dle zadaného id
     * @param id ID polozky k nalezeni
     * @return polozka
     */
    public Polozka getById(int id);
	    
}
