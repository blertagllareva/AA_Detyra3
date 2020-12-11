package lartesiaPemes;
public class llogaritjaLartesise
{
    /*
    * Reprezentimi i pemes si liste e lidhur
    * 1->2->3->4->5->6->7->8->9->10
    *  */

    public int vlera;
    public llogaritjaLartesise majtas;
    public llogaritjaLartesise djathtas;
    public llogaritjaLartesise(int data)
    {
        vlera = data;
        majtas = null;
        djathtas = null;
    }
    public static int lartesia(llogaritjaLartesise rrenja)
    {
        //rasti bazik
        if (rrenja == null)
        {
            return 0;
        }

        //lartesia e pemes = 1+maximum
        //(lartesia e gjysempemes se majte, lartesia e gjysempemes se djathtë)
        return 1 + Math.max(lartesia(rrenja.majtas), lartesia(rrenja.djathtas));
    }

    public static void main(String[] args)
    {
        //ndertimi i pemes
        llogaritjaLartesise pema = new llogaritjaLartesise(1);

        pema.majtas = new llogaritjaLartesise(2);
        pema.majtas.djathtas = new llogaritjaLartesise(4);
        pema.djathtas = new llogaritjaLartesise(3);
        pema.djathtas.majtas = new llogaritjaLartesise(5);
        pema.djathtas.djathtas = new llogaritjaLartesise(6);
        pema.djathtas.majtas.majtas = new llogaritjaLartesise(7);
        pema.djathtas.djathtas.djathtas = new llogaritjaLartesise(8);
        pema.djathtas.djathtas.djathtas.djathtas = new llogaritjaLartesise(9);
        pema.djathtas.djathtas.djathtas.djathtas.majtas = new llogaritjaLartesise(10);

        System.out.print("Lartesia e pemes eshte :");
        System.out.print(lartesia(pema));

    }
}
