public class Alcohol extends Beverage{
        private boolean Weekend;
        private final double WEEKEND_FEE = .6;
        
        /** Constructors */
        public Alcohol(String n, SIZE s, boolean w) {
                super(n, TYPE.ALCOHOL, s);
                Weekend = w;
        }
        
        /** Utility */
        public String toString() {
                String s = getBevName() +", " +getSize();
                
                if (Weekend) {
                        s += " Weekend";
                }
                
                s += ", $" +calcPrice();
                
                return s;
        }
        public boolean equals(Alcohol a) {
                if (super.equals(a) && Weekend == a.getWeekend()) {
                        return true;
                }
                else {
                        return false;
                }
        }
        public double calcPrice() {
                double price = super.getBasePrice();
                
                if (super.getSize() == SIZE.MEDIUM) {
                        price += super.getSizePrice();
                }
                else if (super.getSize() == SIZE.LARGE) {
                        price += 2 * super.getSizePrice();
                }
                
                if (Weekend) {
                        price += WEEKEND_FEE;
                }
                
                return price; 
        }
        
        /** Accessors */
        public boolean getWeekend() {
                return Weekend;
        }
        public double getWeekendFee() {
                return WEEKEND_FEE;
        }
        
        /** Mutators */ 
        public void setWeekend(boolean is) {
                Weekend = is;
        }
}