//PROGRAM CODE—Abhishek Sawalkar last seen 16/9/16. many glitches present such as quantity glitch, no upper limit glitch
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class PROJECT
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int a,a1,b,b1,c,c1,d,n1,n2,n3,n4,tb1,tb2,tb3;
    
    String ring_donut[]=new String[8];
    String fill_donut[]=new String[8];
          
    String bites[]=new String[8];
    
    String coff[]=new String[8];
    int coff_amt[]=new int[8];
    
    String content[]=new String[50];
    int content_amt[]=new int[50];
    int content_qty[]=new int[50];
    
    int ch1[]=new int[30];
    int qty1[]=new int[30];
    
    int ch2[]=new int[30];
    int qty2[]=new int[30];
    
    int ch3[]=new int[30];
    int qty3[]=new int[30];
    
    int ch4[]=new int[30];
    int qty4[]=new int[30];   
    PROJECT()
    {
        ring_donut[0]="Original Sin             ";
        ring_donut[1]="M.O.D - My Original Donut";
        ring_donut[2]="Midnight Beauty          ";
        ring_donut[3]="Dark Knight              ";
        ring_donut[4]="Colour Me Bad            ";
        ring_donut[5]="Cinnaster                ";
        ring_donut[6]="Rainbow Surprise         ";
        ring_donut[7]="Webmaster                ";
                
        fill_donut[0]="Black & White Bavarian   ";
        fill_donut[1]="The Chocolate Spot       ";
        fill_donut[2]="Raspberry Ripple         ";
        fill_donut[3]="Cool Blue Ice            ";
        fill_donut[4]="Hazel Dazzle             ";
        fill_donut[5]="Black Forest Beauty      ";
        fill_donut[6]="Double Trouble           ";
        fill_donut[7]="After Dark               ";
        
        bites[0]="Coconutter               ";
        bites[1]="Nuts Over Donuts         ";
        bites[2]="White Mocha Madness      ";
        bites[3]="Choco Bomb               ";
        bites[4]="Planet Pink              ";
        bites[5]="Almond Einstein          ";
        bites[6]="Dark Knight              ";
        bites[7]="Midnight Beauty          ";
           
        coff[0]="Café Mocha               ";
        coff[1]="Iced Mocha               ";
        coff[2]="Iced Coffee              ";
        coff[3]="Caramel Latte            "; 
        coff[4]="Chai Latte               ";
        coff[5]="Iced Hazelnut Latte      ";
        coff[6]="Expresso                 ";
        coff[7]="Cup-A-Chino              ";
        coff_amt[0]=75;
        coff_amt[1]=80;
        coff_amt[2]=70;
        coff_amt[3]=100;
        coff_amt[4]=100;
        coff_amt[5]=115;
        coff_amt[6]=75;
        coff_amt[7]=75;
        a=0;a1=0;
        b=0;b1=0;
        c=0;c1=0;
        d=0;
        tb1=0;
        tb2=0;
        tb3=0;
    }
    static void main()throws IOException
    {   
        PROJECT ob=new PROJECT();
        ob.loading();
        System.out.println("\t\t*****************************************************************");
        System.out.println("\t\t#   #   #    ####    #       ####     ####      #   #      ####  ");                                                                                                      
        System.out.println("\t\t # # # #     ##      #       #        #  #     #  #  #     ##    ");
        System.out.println("\t\t #    #      ####    ####    ####     ####    #       #    ####  ");
        System.out.println("\t\t*****************************************************************");
        System.out.println();
        System.out.println("\t\t                     TO tHE pERFECT dONUTS !!!!");
        System.out.println();
        ob.menu();
    }
    void loading()
    {
        long i;
        System.out.print("\t\t\tPLEASE WAIT ");
        for(i=0;i<=100000000;i++)
        { 
            if(i==18000000)
            System.out.print(".");
            if(i==38000000)
            System.out.print(".");
            if(i==58000000)
            System.out.print(".");
            if(i==78000000)
            System.out.print(".");
            if(i==98000000)
            System.out.print(".");            
        }
        System.out.println();
        System.out.println();
        System.out.println("\u000c");
    }
    void menu()throws IOException
    {
        int t=0,t1=0,ch=0;
        System.out.println("\t\t\t******************************");
        System.out.println("\t\t\t* CHOICE  *   MENU           *");
        System.out.println("\t\t\t******************************");
        System.out.println("\t\t\t*   1.    *  DONUTS          *");
        System.out.println("\t\t\t*   2.    *  BITES           *");
        System.out.println("\t\t\t*   3.    *  COFFEE          *");
        System.out.println("\t\t\t******************************");
        while(t==0)
        {           
            do
            {
                try
                {
                    System.out.print("\t\t\tPLEASE ENTER YOUR CHOICE-->");//1 for donuts,2 for bites,3 for coffee
                    ch=Integer.parseInt(in.readLine());
                    t1=1;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                    t1=0;
                    System.out.println();
                }
            } 
            while(t1==0);                    
            switch(ch)
                {
                case 1:
                t=1;
                System.out.println("\u000c");
                System.out.println("\t\t\t******************************");
                System.out.println("\t\t\t* CHOICE  *   MENU           *");
                System.out.println("\t\t\t******************************");
                System.out.println("\t\t\t*   1.    *  Ringed DONUTS   *");
                System.out.println("\t\t\t*   2.    *  Filled DONUTS   *");
                System.out.println("\t\t\t******************************");                
                donuts();
                break;
                
                case 2:
                t=1;
                bites();
                break;
                
                case 3:
                t=1;
                coffee();
                break;
                
                default:
                t=0;
                System.out.println("INVALID CHOICE");
            }        
        }
    }
    void donuts()throws IOException
    {
        int ch1=0,ch4=0,ch5=0,t=0,i;
        do
        {
            try
            {
                System.out.print("\t\t\tPLEASE ENTER YOUR CHOICE-->");
                ch1=Integer.parseInt(in.readLine());
                t=1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                t=0;
                System.out.println();
            }
        } 
        while(t==0);        
        t=0;    
        if(ch1==1)
        {
            System.out.println("\u000c");
            System.out.println("\t\t\t*************************************************************************************");
            System.out.println("\t\t\t* CHOICE *  RINGED DONUTS     \t\t\t\t\t*       AMOUNT      *");
            System.out.println("\t\t\t*************************************************************************************");
            for(i=0;i<8;i++)
            System.out.println("\t\t\t*   "+(i+1)+"   *  "+ring_donut[i]+"\t\t\t\t*       55          *");
            System.out.println("\t\t\t*************************************************************************************");            
            offers(1);            
            do
            {
                try
                { 
                    System.out.println("\t\t\tWOULD YOU LIKE TO HAVE A TREASURE BOX containg all flavours?");
                    System.out.print("\t\t\tENTER 1 FOR YES AND 2 FOR NO-->");
                    tb1=Integer.parseInt(in.readLine());
                    System.out.println();
                    System.out.println("\t\t\tPLEASE ENTER THE NUMBER OF RINGED DONUTS YOU WOULD LIKE TO HAVE,");
                    System.out.print("\t\t\tor ENTER 0 TO HAVE NONE -->");
                    n1=Integer.parseInt(in.readLine());          
                    t=1;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                    t=0;
                    System.out.println();
                }
            }
            while(t==0);
            System.out.println();
            choice(n1,1);
            System.out.println();
            t=0;
            do
            {
                try
                {
                    System.out.println("\t\t\tENTER 1-->TO RETURN BACK TO MENU");   
                    System.out.print("\t\t\tENTER 2-->TO PRINT BILL AND EXIT-->"); 
                    ch4=Integer.parseInt(in.readLine());
                    t=1;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                    t=0;
                    System.out.println();
                }
            }
            while(t==0);
            if(ch4==1)
            {   
                System.out.println("\u000c");
                menu();
            }
            else 
            bill();
        }
        else
        {
            System.out.println("\u000c");
            System.out.println("\t\t\t*************************************************************************************");
            System.out.println("\t\t\t* CHOICE *  FILLED DONUTS     \t\t\t\t\t*       AMOUNT      *");
            System.out.println("\t\t\t*************************************************************************************");
            for(i=0;i<8;i++)
            System.out.println("\t\t\t*   "+(i+1)+"   *  "+fill_donut[i]+"\t\t\t\t*       55          *");
            System.out.println("\t\t\t*************************************************************************************");
            offers(2);
            do
            {
                try
                { 
                    System.out.println("\t\t\tWOULD YOU LIKE TO HAVE A TREASURE BOX containing all flavours ?");
                    System.out.print("\t\t\tENTER 1 FOR YES AND 2 FOR NO-->");
                    tb2=Integer.parseInt(in.readLine());
                    System.out.println();
                    System.out.println("\t\t\tPLEASE ENTER THE NUMBER OF FILLED DONUTS YOU WOULD LIKE TO HAVE,");
                    System.out.print("\t\t\tor ENTER 0 TO HAVE NONE -->");
                    n2=Integer.parseInt(in.readLine());
                    t=1;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                    t=0;
                    System.out.println();
                }
            }
            while(t==0); 
            System.out.println();
            choice(n2,2);
            System.out.println();
            t=0;
            do
            {
                try
                {
                    System.out.println("\t\t\tENTER 1-->TO RETURN BACK TO MENU");   
                    System.out.print("\t\t\tENTER 2-->TO PRINT BILL AND EXIT-->"); 
                    ch5=Integer.parseInt(in.readLine());
                    t=1;
                }
                catch(NumberFormatException e)
                {
                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                    t=0;
                    System.out.println();
                }
            }
            while(t==0);            
            if(ch5==1)
            {   
                System.out.println("\u000c");
                menu();
            }
            else 
            bill();
        }            
    }
    void bites()throws IOException
    {   
        int ch6=0,t=0,i;
        System.out.println("\u000c");
        System.out.println("\t\t\t*************************************************************************************");
        System.out.println("\t\t\t* CHOICE *      BITES         \t\t\t\t\t*       AMOUNT      *");
        System.out.println("\t\t\t*************************************************************************************");
        for(i=0;i<8;i++)
        System.out.println("\t\t\t*   "+(i+1)+"   *  "+bites[i]+"\t\t\t\t*       35          *");
        System.out.println("\t\t\t*************************************************************************************");        
        offers(3);
        do
        {
            try
            { 
                System.out.println("\t\t\tWOULD YOU LIKE TO HAVE A TREASURE BOX containg all flavours ?");
                System.out.print("\t\t\tENTER 1 FOR YES AND 2 FOR NO-->");
                tb3=Integer.parseInt(in.readLine());
                System.out.println();
                System.out.println("\t\t\tPLEASE ENTER THE NUMBER OF BITES YOU WOULD LIKE TO HAVE,");
                System.out.print("\t\t\tor ENTER 0 TO ENTER NONE-->");
                n3=Integer.parseInt(in.readLine());
                t=1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                t=0;
                System.out.println();
            }
        }
        while(t==0);
        System.out.println();
        choice(n3,3);
        t=0;
        System.out.println();
        do
        {
            try
            {
                System.out.println("\t\t\tENTER 1-->TO RETURN BACK TO MENU");   
                System.out.print("\t\t\tENTER 2-->TO PRINT BILL AND EXIT-->"); 
                ch6=Integer.parseInt(in.readLine());
                t=1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                t=0;
                System.out.println();
            }
        }
        while(t==0);        
        if(ch6==1)
        {   
            System.out.println("\u000c");
            menu();
        }
        else 
        bill();
    }
    void coffee()throws IOException
    {
        int ch7=0,i,t=0;
        System.out.println("\u000c");
        System.out.println("\t\t\t*****************************************************************");
        System.out.println("\t\t\t* CHOICE *      COFFEE        \t\t        *       AMOUNT  *");
        System.out.println("\t\t\t*****************************************************************");
        for(i=0;i<8;i++)
        System.out.println("\t\t\t*  "+(i+1)+"     *  "+coff[i]+"\t\t*\t"+coff_amt[i]+"\t*");
        System.out.println("\t\t\t*****************************************************************");       
        do
        {
            try
            { 
                System.out.println("\t\t\tPLEASE ENTER THE NUMBER OF ITEMS YOU WOULD LIKE TO HAVE,");
                System.out.print("\t\t\tor ENTER 0 TO HAVE NONE-->");
                n4=Integer.parseInt(in.readLine());
                t=1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                t=0;
                System.out.println();
            }
        }
        while(t==0);
        System.out.println();
        choice(n4,4);
        System.out.println();
        t=0;
        do
        {
            try
            {
                System.out.println("\t\t\tENTER 1-->TO RETURN BACK TO MENU");   
                System.out.print("\t\t\tENTER 2-->TO PRINT BILL AND EXIT-->"); 
                ch7=Integer.parseInt(in.readLine());
                t=1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                t=0;
                System.out.println();
            }
        }
        while(t==0);  
        
        if(ch7==1)
        {   
            System.out.println("\u000c");
            menu();
        }
        else 
        bill();         
    }
    void choice(final int x,int y)throws IOException//x for no. of choices and y for different menus
    {   
        int i,j,t=0;
        if(y==1)
        {            
            if(x!=0)
            {
                a=1;
                System.out.println("\t\t\tPLEASE ENTER:- ");
                for(i=0;i<x;i++)
                {                
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tCHOICE NUMBER "+(i+1)+"-->");
                           ch1[i]=Integer.parseInt(in.readLine());                       
                           t=1;
                           if(ch1[i]>8)
                           {
                               System.out.println("\t\t\tINVALID CHOICE");
                               t=0;
                           }
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }
                    while(t==0);                    
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tQUANTITY-->");
                           qty1[i]=Integer.parseInt(in.readLine());                        
                           t=1;
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }while(t==0);                               
                    System.out.println();
                    if(i==(x-1))
                    {
                        if(x==3)
                        {
                            a1=1;//no. of complementaries
                            System.out.println("\t\t\tYOU WILL GET A COMPLEMENTARY DONUT !!");
                            t=0;
                            do
                            {
                                try
                                {
                                   System.out.print("\t\t\tPLEASE ENTER YOUR CHOICE-->");
                                   ch1[(i+1)]=Integer.parseInt(in.readLine());                      
                                   t=1;
                                }
                                catch(NumberFormatException e)
                                {
                                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                                    t=0;
                                }
                            }while(t==0);        
                            qty1[i+1]=1;                        
                        }
                        else if(x==5)
                        {   
                            a1=2;
                            System.out.println("\t\t\tYOU WILL GET 2 COMPLEMENTARY DONUTS !!");
                            t=0;
                            do
                            {
                                try
                                {
                                   System.out.println("\t\t\tPLEASE ENTER :-");
                                    for(j=0;j<2;j++)
                                   {
                                        System.out.print("\t\t\tCHOICE NUMBER "+(j+1)+"-->");
                                        ch1[((i+1)+j)]=Integer.parseInt(in.readLine());
                                        qty1[((i+1)+j)]=1;
                                   }                   
                                   t=1;
                                }
                                catch(NumberFormatException e)
                                {
                                    System.out.println("\t\t\tPLEASE ENTER A NUMBER !!");
                                    t=0;
                                }
                            }while(t==0);
                            
                        }
                    }
                }
            }                
        }
        else if(y==2)
        {
            if(x!=0)
            {
                b=1;
                System.out.println("\t\t\tPLEASE ENTER ");
                for(i=0;i<x;i++)
                {                
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tCHOICE NUMBER "+(i+1)+"-->");
                           ch2[i]=Integer.parseInt(in.readLine());                       
                           t=1;
                           if(ch2[i]>8)
                           {
                               System.out.println("\t\t\tINVALID CHOICE");
                               t=0;
                           }
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }
                    while(t==0);                    
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tQUANTITY-->");
                           qty2[i]=Integer.parseInt(in.readLine());                        
                           t=1;
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }while(t==0);                               
                    System.out.println();
                    if(i==(x-1))
                    {
                        if(x==3)
                        {
                            b1=1;//no. of complementaries
                            System.out.println("\t\t\tYOU WILL GET A COMPLEMENTARY DONUT !!");
                            t=0;
                            do
                            {
                                try
                                {
                                   System.out.print("\t\t\tPLEASE ENTER YOUR CHOICE-->");
                                   ch2[(i+1)]=Integer.parseInt(in.readLine());                      
                                   t=1;
                                }
                                catch(NumberFormatException e)
                                {
                                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                                    t=0;
                                }
                            }while(t==0);        
                            qty2[(i+1)]=1;
                            
                        }
                        else if(x==5)
                        {   
                            b1=2;
                            System.out.println("\t\t\tYOU WILL GET 2 COMPLEMENTARY DONUTS !!");
                            t=0;
                            do
                            {
                                try
                                {
                                   System.out.println("\t\t\tPLEASE ENTER :-");
                                    for(j=0;j<2;j++)
                                   {
                                        System.out.print("\t\t\tCHOICE NUMBER"+(j+1)+"-->");
                                        ch2[((i+1)+j)]=Integer.parseInt(in.readLine());
                                        qty2[((i+1)+j)]=1;
                                   }                   
                                   t=1;
                                }
                                catch(NumberFormatException e)
                                {
                                    System.out.println("\t\t\tPLEASE ENTER A NUMBER !!");
                                    t=0;
                                }
                            }while(t==0);
                            
                        }
                    }
                }
            }
        }      
        else if(y==3)//bites
        {
            if(x!=0)
            {
                c=1;           
                for(i=0;i<x;i++)
                {                                
                    System.out.println("\t\t\tPLEASE ENTER ");
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tCHOICE NUMBER "+(i+1)+"-->");
                           ch3[i]=Integer.parseInt(in.readLine());                       
                           t=1;
                           if(ch3[i]>8)
                           {
                               System.out.println("\t\t\tINVALID CHOICE");
                               t=0;
                           }
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }
                    while(t==0);                    
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tQUANTITY-->");
                           qty3[i]=Integer.parseInt(in.readLine());                        
                           t=1;
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }while(t==0);                               
                    System.out.println();
                    if(i==(x-1))
                    {
                        if(x==2)//for special offers
                        {
                            c1=1;//no. of complementaries
                            System.out.println("\t\t\tYOU WILL GET A COMPLEMENTARY BITE !!");
                            t=0;
                            do
                            {
                                try
                                {
                                   System.out.print("\t\t\tPLEASE ENTER YOUR CHOICE-->");
                                   ch3[(i+1)]=Integer.parseInt(in.readLine());                      
                                   t=1;
                                }
                                catch(NumberFormatException e)
                                {
                                    System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                                    t=0;
                                }
                            }while(t==0);        
                            qty3[(i+1)]=1;                            
                        }
                        else if(x==5)
                        {   
                            c1=3;
                            System.out.println("\t\t\tYOU WILL GET 3 COMPLEMENTARY BITES !!");
                            t=0;
                            do
                            {
                                try
                                {
                                   System.out.println("\t\t\tPLEASE ENTER :-");
                                    for(j=0;j<3;j++)
                                   {
                                        System.out.print("\t\t\tCHOICE NUMBER "+(j+1)+"-->");
                                        ch3[((i+1)+j)]=Integer.parseInt(in.readLine());
                                        qty3[((i+1)+j)]=1;
                                   }                   
                                   t=1;
                                }
                                catch(NumberFormatException e)
                                {
                                    System.out.println("\t\t\tPLEASE ENTER A NUMBER !!");
                                    t=0;
                                }
                            }while(t==0);
                            
                        }
                    }
                }
            }
        }
        
        else if(y==4)
        {
            if(x!=0)
            {
                d=1;
                System.out.println("\t\t\tPLEASE ENTER ");
                for(i=0;i<x;i++)
                {
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tCHOICE no. "+(i+1)+"-->");
                           ch4[i]=Integer.parseInt(in.readLine());                       
                           t=1;
                           if(ch4[i]>8)
                           {
                               System.out.println("INVALID CHOICE");
                               t=0;
                           }
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }
                    while(t==0);                                
                    t=0;
                    do
                    {
                        try
                        {
                           System.out.print("\t\t\tQUANTITY-->");
                           qty4[i]=Integer.parseInt(in.readLine());                        
                           t=1;
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("\t\t\tPLEASE ENTER A NUMBER!!");
                            t=0;
                        }
                    }
                    while(t==0);                   
                    System.out.println();
                }
            }
        }    
    }
    void bill()throws IOException
    {
        int i,l,m,n,o,s=0,p2,p3,p4,t=0;
        int k1=0,k2=0,k3=0,k4=0,k=0;
        int c2=0,c3=0,c4=0;
        if(a==1)//if ringed donuts are chosen
        {
            for(i=0;i<(n1+a1);i++)//n1 is the no. of choices and a1 is the no. of complementaries
            {                
                l=ch1[i];//extracting choice of user
                content_qty[i]=qty1[i];
                content[i]=("RD-->")+(ring_donut[(l-1)]);                
                content_amt[i]=(qty1[i]*55);
                if(i>=n1)//for complementary donuts
                {
                    content_amt[i]=0;
                    content[i]=("FREE>")+(ring_donut[(l-1)]);
                }
                if(i==((n1+a1)-1))//enters just before for loop ends
                {
                    k1=i+1;//or k=n1+a1;
                    k2=i+1;
                    k3=i+1;                    
                }
            }
        }
        if(b==1)//filled donuts
        {
            p2=n2+k1;//increasing the length of for loop till no. of choices
            for(i=k1;i<(p2+b1);i++)//n2 is the no. of choices and b1 is the no. of complementaries
            {
                m=ch2[c2];                
                content_qty[i]=qty2[c2];//storing 1st value of qty4 to content_qty[]
                content[i]=("FD-->")+(fill_donut[(m-1)]);
                content_amt[i]=(qty2[c2]*55);
                if(i>=p2)//for complementary donuts
                {
                    content_amt[i]=0;
                    content[i]=("FREE>")+(fill_donut[m-1]);
                }
                c2++;//counter value for ch2
                if(i==((p2+b1)-1))//just before the end of for loop, it enters
                {   
                    k2=p2+b1;//making for continuation of content[] in next for loop
                    k3=p2+b1;
                }
            }
        }
        if(c==1)//bites
        {
            p3=n3+k2;
            for(i=k2;i<(p3+c1);i++)//n3 is the no. of choices and c1 is the no. of complementaries
            {
                n=ch3[c3];                
                content_qty[i]=qty3[c3];//storing 1st value of qty3 to content_qty[]
                content[i]=("B-->")+(bites[(n-1)])+" ";                
                content_amt[i]=(qty3[c3]*35);
                if(i>=p3)//for complementary bites
                {
                    content_amt[i]=0;
                    content[i]=("FREE>")+(bites[(n-1)]);
                }
                c3++;
                if(i==((p3+c1)-1))
                k3=p3+c1;
            }
        }
        if(d==1)//coffee
        {
            p4=n4+k3;
            for(i=k3;i<p4;i++)//n4 is the no. of choices
            {
                o=ch4[c4];                                
                content_qty[i]=qty4[c4];//storing 1st value of qty4 to content_qty[]
                content[i]=("C-->")+(coff[o-1])+" ";                                
                content_amt[i]=(coff_amt[o-1]*qty4[c4]); 
                c4++;
            }
        }
        t=0;
        if(tb1==1)
        {
            content[n1+n2+n3+n4+a1+b1+c1]="RD--> TREASURE BOX            ";
            content_amt[n1+n2+n3+n4+a1+b1+c1]=350;
            content_qty[n1+n2+n3+n4+a1+b1+c1]=1;
            t=1;k++;
        }
        if(tb2==1)
        {
            content[n1+n2+n3+n4+a1+b1+c1+t]="FD--> TREASURE BOX            ";
            content_amt[n1+n2+n3+n4+a1+b1+c1+t]=350;
            content_qty[n1+n2+n3+n4+a1+b1+c1+t]=1;  
            k++;
            if(t==1)
            t=2;  
            else
            t=1;
        }
        if(tb3==1)
        {
            content[n1+n2+n3+n4+a1+b1+c1+t]="B--> TREASURE BOX             ";
            content_amt[n1+n2+n3+n4+a1+b1+c1+t]=200;
            content_qty[n1+n2+n3+n4+a1+b1+c1+t]=1;
            k++;
        }
        for(i=0;i<(n1+n2+n3+n4+a1+b1+c1+k);i++)
         s=s+content_amt[i];
        System.out.println("\u000c");
        System.out.println("\t\t\t\t\t\t      TAX INVOICE :-");
        System.out.println();
        System.out.println("\t\t\t\t\t\t     PERFECT DONUTS");
        DateFormat dateFormat = new SimpleDateFormat("\t\t\tdd/MM/yyyy\t\t\t\t\t\t\thh:mm:ss");
        Date date=new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("\t\t\t************************************************************************");
        System.out.println("\t\t\t* Sr No. *      ITEMS                     *  QUANTITY   *    AMOUNT    *");        
        System.out.println("\t\t\t************************************************************************");
        for(i=0;i<(n1+n2+n3+n4+a1+b1+c1+k);i++)//k is the no. of times box has been selected
        {
            if(i>=(n1+n2+n3+n4+a1+b1+c1))
            System.out.println("\t\t\t*   "+(i+1)+"    *  "+content[i]+"*\t"+content_qty[i]+"\t*\tRs."+content_amt[i]+" *");
            else
            System.out.println("\t\t\t*   "+(i+1)+"    *  "+content[i]+"*\t"+content_qty[i]+"\t*\tRs."+content_amt[i]+"  *");            
        }
        System.out.println("\t\t\t************************************************************************");
        System.out.println("\t\t\tTOTAL AMOUNT:- Rs."+s);
        System.out.println("\t\t\tVAT = 12.5%");
        System.out.println("\t\t\tFINAL AMOUNT:- Rs."+(s+((0.125*s))));        
        System.out.println("\t\t********************************************************************************");
        System.out.println("\t\t #####   #  #      #        #     #    #  #        #   #   ####  #  #    #  #  #");                                                                                                      
        System.out.println("\t\t   #     ####    # * #     #  #  #     ##            #     #  #  #  #    #  #  #");
        System.out.println("\t\t   #     #  #   #     #   #     #      #  #          #     ####  ####    *  *  *");
        System.out.println("\t\t********************************************************************************"); 
        System.out.println("\t\t\t\t\tTHANK YOU !!!! PLEASE VISIT US AGAIN :)");
    }                                                                    
    void offers(int of)
    {
        if(of==1)//ringed donuts
        {
            System.out.println("\t\t\tSPECIAL OFFERS");
            System.out.println("\t\t\t-->BUY 3 DONUTS AND GET 1 DONUT FREE"); 
            System.out.println("\t\t\t-->BUY 5 DONUTS AND GET 2 DONUTS FREE");
            System.out.println("\t\t\t-->BUY A TREASURE BOX(contanining all flavours) ONLY FOR Rs.350*"); 
            System.out.println();
        }
        if(of==2)
        {
            System.out.println("\t\t\tSPECIAL OFFERS");
            System.out.println("\t\t\t-->BUY 3 DONUTS AND GET 1 DONUT FREE"); 
            System.out.println("\t\t\t-->BUY 5 DONUTS AND GET 2 DONUTS FREE");
            System.out.println("\t\t\t-->BUY A TREASURE BOX(contanining all flavours) ONLY FOR Rs.350*"); 
            System.out.println();
        }
        if(of==3)
        {
            System.out.println("\t\t\tSPECIAL OFFERS");
            System.out.println("\t\t\t-->BUY 2 BITES AND GET 1 BITE FREE"); 
            System.out.println("\t\t\t-->BUY 5 BITES AND GET 3 BITES FREE");
            System.out.println("\t\t\t-->BUY A TREASURE BOX(contanining all flavours) ONLY FOR Rs.200*"); 
            System.out.println();
        }
    }
}
