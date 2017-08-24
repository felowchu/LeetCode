package leetcode;

import java.util.List;

public class OJ638_ShoppingOffers {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int res = Integer.MAX_VALUE;
        for(List<Integer> offer : special){
            boolean isValid = true;
            for(int j = 0; j < needs.size(); j++){
                int remain = needs.get(j) - offer.get(j);
                needs.set(j, remain);
                if(isValid && remain < 0) isValid = false;
            }
            if(isValid){
                res = Math.min(res, shoppingOffers(price, special, needs) + offer.get(needs.size()));
            }
            for(int j = 0; j < needs.size(); j++){
                needs.set(j, needs.get(j) + offer.get(j));
            }
        }
        int noOffer = 0;
        for(int i = 0; i < needs.size(); i++){
            noOffer += (needs.get(i) * price.get(i));
        }
        return Math.min(res, noOffer);
    }
}
