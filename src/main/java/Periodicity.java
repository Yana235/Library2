public enum Periodicity {
            WEEKLY("semanal"),
            MONTHLY("mensual"),
            QUARTERLY("trimestral");
            private final String periodicity;
            Periodicity(String periodicity){
                this.periodicity=periodicity;
            }
            @Override
            public String toString(){
                return periodicity;
            }
}
