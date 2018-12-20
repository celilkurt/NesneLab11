

package nesnelab11;



public class Oyun {
    
    int sira;
    int[][] matris = new int[3][3];
    
    public void oyun(){
        
        for(int i = 0; i< 3; i++){
             for(int j = 0; j< 3; j++){
                 matris[i][j] = -1;
             }
        }
    }
    
    public void tahtaCiz(){
        
        for(int i = 0; i< 3; i++){
             for(int j = 0; j< 3; j++){
                 if(matris[i][j]==-1)
                     System.out.print("   -");
                 else
                     System.out.print("   " + matris[i][j]);
             }
             System.out.print("\n");
             
        }
        
    }
    
    public void sayiKoy(int sayi,int x, int y){
        boolean key=false;
        
        for(int i = 0; i < 3; i++){//atanmak istenen sayı daha önce matrise eklenmişmi kontrol eder.
            
            for(int j = 0; j< 3; j++){
                
                  if(sayi==matris[i][j])
                      key = true;
             }
            
        }
        
        
        if(matris[x-1][y-1]==-1&&key!=true){
            matris[x-1][y-1]=sayi;
        }else
            System.out.println("Daha önce atama yapıldığından işlen yapılamıyor.");
        
        
    }
    
    public void sira(){
        
        System.out.println("Sıra : "+sira);
        
    }
    
    public void siraAtla(){
        
        if(sira==2)
            sira=1;
        else
            sira=2;
        
        
    }
    
    public boolean bittiMi(){
        int toplam=0;
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j< 3; j++){
                
                if(matris[i][j]!=-1)
                    toplam+=matris[i][j];
            
             }
            if(toplam>=15)
                return true;
            toplam = 0;
        }
        
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j< 3; j++){
                
                if(matris[j][i]!=-1)
                    toplam+=matris[j][i];
            
             }
            if(toplam>=15)
                return true;
            toplam = 0;
        }
        
        if(matris[0][0]!=-1)
            toplam+=matris[0][0];
        if(matris[1][1]!=-1)
            toplam+=matris[1][1];
        if(matris[2][2]!=-1)
            toplam+=matris[2][2];  
       if(toplam>=15)
            return true;
        
       toplam = 0;
       if(matris[0][2]!=-1)
            toplam+=matris[0][2];
        if(matris[1][1]!=-1)
            toplam+=matris[1][1];
        if(matris[2][0]!=-1)
            toplam+=matris[2][0];  
        if(toplam>=15)
                return true;
        
        return false;
        
    }
    
}
