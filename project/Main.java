
package project;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
          
       
        Scanner input=new Scanner(System.in);
        int[] ticket=new int[19];
        AC a1=new AC();
        int j=0;
        int sum=0;
        Syltochitta x1=new Syltochitta();
        Dhakatosyl z1=new Dhakatosyl();
        SyltoDhaka y1=new SyltoDhaka();
        Chitto c1=new Chitto();
        Seat s1=new Seat();
        Seat s2=new Seat();
        Sleeper sl1=new Sleeper();
        Display d1=new Display();
        Dha2chitime t1=new Dha2chitime();
        System.out.println("                                                            WELLCOME");
        System.out.println("                                                 Our Bkash Number Is:01777777777");
        System.out.print("                                                         Your Number:");
        int bkash=input.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        d1.dis();
        int choice1=input.nextInt();
       switch(choice1){
           case 1:
           {
            
            t1.Time1();
            int Timechoice1;
            Timechoice1=input.nextInt();
            switch(Timechoice1)
                    {
                    case 1:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("");
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*650);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*550);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*350);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
            
                    case 2:
                    {
                s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
                    break;
                      case 3:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
             case 4:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
 
        }
                   
                
                }
            
            
            
            
        
           }
        break;
           case 2:
           {
            c1.time2();
            int Timechoice1;
            Timechoice1=input.nextInt();
            switch(Timechoice1)
                    {
                    case 1:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("");
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*650);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*550);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*350);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
            
                    case 2:
                    {
                s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
                    break;
                      case 3:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
             case 4:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
 
        }
                   
                
                }
            
            
            
            
        
            
            
        }
           break;
           case 3:
           {
               
            
            y1.time3();
            int Timechoice1;
            Timechoice1=input.nextInt();
            switch(Timechoice1)
                    {
                    case 1:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("");
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*650);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*550);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*350);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
            
                    case 2:
                    {
                s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
                    break;
                      case 3:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.print("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.print("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
             case 4:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.print("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.print("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.print("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.print("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
 
        }
                   
                
                }
            
            
            
            
        
            
            
        }
           break;
           case 4:
           {
               
            
            z1.time4();
            int Timechoice1;
            Timechoice1=input.nextInt();
            switch(Timechoice1)
                    {
                    case 1:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("");
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*650);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*550);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*350);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
            
                    case 2:
                    {
                s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
                    break;
                      case 3:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
             case 4:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
 
        }
                   
                
                }
            
            
            
            
        
            
            
        }
           break;
           case 5:
           {
               x1.time5();
            int Timechoice1;
            Timechoice1=input.nextInt();
            switch(Timechoice1)
                    {
                    case 1:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("");
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*650);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*550);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*350);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
            
                    case 2:
                    {
                s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
                    break;
                      case 3:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
            
        }
            break;
             case 4:
            {
           
                    s1.seat();
                        
                int seat=input.nextInt();
                switch(seat){
                    case 1:
                    {
                    sl1.slep();
                    System.out.println("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.println("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                
            }
                    break;
                    
             
                    case 2:
                    {
                    a1.ac();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                    }
                
                break;
                
                    case 3:
                    {
                    sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                }
                    break;
                    
                    case 4:
                    {
                        sl1.slep();
                    System.out.print("                                        How many tickets:");
                    int k=input.nextInt();
                    System.out.print("                                        Seat number:");
                    for(int i=1;i<=k;i++)
                    {
                      
                        int m=input.nextInt();
                        j++;
                    }
                
                    System.out.println("                                        Cost:"+j*450);
                       
                   }
                    break;
                
                }
            
            
            
 
        }
                   
                
                }
            
            
            
            
        
            
            
        }
           }
    
         System.out.println("");
         System.out.println("");
         System.out.println("                                                     Thank You");
         System.out.println("                         You will be registered as soon as you send the cost of ticket");
          
                
                }


         
         
          
        
        
            
            
            
 
        }
                   
                
                
            
            
            
            
        
            
            
               
  


      