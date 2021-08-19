public class BalancoTrimestral{
    public static void main (String args[]){
        int gastosJaneiro=15000;
        int gastosFevereiro=22000;
        int gastosMarco=17000;
        int gastosTrimestral=gastosJaneiro+gastosFevereiro+gastosMarco;
        int gastosMensal=gastosTrimestral/3;

        System.out.println("O gasto Trimestral foi de : "+gastosTrimestral);
        System.out.println("O gasto Mensal foi de: "+gastosMensal);
    }
}