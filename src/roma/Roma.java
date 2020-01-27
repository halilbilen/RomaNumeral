/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roma;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Roma 
{

    private static String kelime1,kelime2;
    private StringIndexOutOfBoundsException xse;
    private int i = 0;
    private static int boyut=0,sayi=0,sayi1=0,sayi2=0,toplam=0;
    
    public static void main(String[] args) 
    {
        Roma h1 = new Roma();
        h1.setRakam();
        sayi1=h1.getRakam(kelime1);
        sayi2= h1.getRakam(kelime2);
        toplam=sayi1+sayi2;
        System.out.println(toplam);
        h1.cevir();
    }
    private void setRakam()
    {
        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci Rakamı  Giriniz: ");
        kelime1 = oku.next();
        System.out.print("İkinci Rakamı  Giriniz: ");
        kelime2 = oku.next();
    }
    public int  getRakam(String kelime)
    {
        boyut=kelime.length();
        i=0;
        sayi=0;
        try
        {
            while(i<boyut)
            {
                if(kelime.charAt(i)=='M')
                {
                    sayi+=1000;
                }
                if(kelime.charAt(i)=='D')
                {
                    sayi+=500;
                }
                if(kelime.charAt(i)=='C')
                {
                    sayi+=100;
                }
                if(kelime.charAt(i)=='L')
                {
                    sayi+=50;
                }
                if(kelime.charAt(i)=='X')
                {
                    sayi+=10;
                }
                if(kelime.charAt(i)=='V')
                {
                    sayi+=5;
                }
                if(kelime.charAt(i)=='I')
                {
                    sayi+=1;
                }
               i++;
            }
        }
        catch(StringIndexOutOfBoundsException xse)
        {
            this.xse = xse;
        }
        return sayi;
    }
    private void cevir()
    {
        int birler,onlar,yuzler,binler;
        binler=toplam/1000;
        yuzler=(toplam%1000)/100;
        onlar=((toplam%1000)%100)/10; 
        birler=((toplam%1000)%100)%10; 
        if(binler==1)
        {
            System.out.print("M");
        }
        else if(binler==2)
        {
            System.out.print("MM");
        }
       else if(binler==3)
        {
            System.out.print("MMM");
        }
       else if(binler==4)
        {
            System.out.print("Mv");
        }
       else if(binler==5)
        {
            System.out.print("v");
        }
       else if(binler==6)
        {
            System.out.print("vM");
        }
       else if(binler==7)
        {
            System.out.print("vMM");
        }
       else if(binler==8)
        {
            System.out.print("vMMM");
        }
       else if(binler==9)
        {
            System.out.print("Mx");
        }
        //
        if(yuzler==1)
        {
            System.out.print("C");
        }
        else if(yuzler==2)
        {
            System.out.print("CC");
        }
       else if(yuzler==3)
        {
            System.out.print("CCC");
        }
       else if(yuzler==4)
        {
            System.out.print("CD");
        }
       else if(yuzler==5)
        {
            System.out.print("D");
        }
       else if(yuzler==6)
        {
            System.out.print("DC");
        }
       else if(yuzler==7)
        {
            System.out.print("DCC");
        }
       else if(yuzler==8)
        {
            System.out.print("DCCC");
        }
       else if(yuzler==9)
        {
            System.out.print("CM");
        }
        //
        if(onlar==1)
        {
            System.out.print("X");
        }
        else if(onlar==2)
        {
            System.out.print("XX");
        }
       else if(onlar==3)
        {
            System.out.print("XXX");
        }
       else if(onlar==4)
        {
            System.out.print("XL");
        }
       else if(onlar==5)
        {
            System.out.print("L");
        }
       else if(onlar==6)
        {
            System.out.print("LX");
        }
       else if(onlar==7)
        {
            System.out.print("LXX");
        }
       else if(onlar==8)
        {
            System.out.print("LXXX");
        }
       else if(onlar==9)
        {
            System.out.print("XC");
        }
        //
        if(birler==1)
        {
            System.out.print("I");
        }
        else if(birler==2)
        {
            System.out.print("II");
        }
       else if(birler==3)
        {
            System.out.print("III");
        }
       else if(birler==4)
        {
            System.out.print("IV");
        }
       else if(birler==5)
        {
            System.out.print("V");
        }
       else if(birler==6)
        {
            System.out.print("VI");
        }
       else if(birler==7)
        {
            System.out.print("VII");
        }
       else if(birler==8)
        {
            System.out.print("VIII");
        }
       else if(birler==9)
        {
            System.out.print("IX");
        }
        System.out.println();
    }
}
