# Algoritmet e Avancuara
Detyra 3 - Implemento algoritmin rekursiv për gjetjen e lartësisë se pemës

Function lartesia( NyjaPemes rrenja) //kthen lartësinë (int)<br />
    int lartesia(NyjaPemes rrenja): <br />
        //rasti bazë <br />
        if rrenja is NULL <br />
            return 0 <br />
        //1  paraqet lartesine e rrenjes <br />
        return 1+ maximum (lartesia(rrenja->majtas, lartesia(rrenja->djthtas)) <br />
