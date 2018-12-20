# NesneLab11
Lab Uygulamasi II Ogretim

Sihirli 15 oyununu implement edeceksiniz.
Kulanici (x,y) hucresine [0, 9] araligindaki bir tam sayiyi yerlestirir. Her sayi sadece bir defa kullanilir. 
Amac oyle satir, sutun ya da kosegen olusturmaktir ki o sira, sutun ya da kosegeni olusturan sayilarin toplami 15 olsun. 
Ilk 15i elde eden oyunu kazanir.
  
Sinif:
oyun


Metotlar:
oyun(): yapilandirice metot. 3*3luk bir matris olusturur ve her hucresine 0 degerini atar.
tahtaCiz(): tahtanin o anki durumunu cizer
sayiKoy(int d, int x, int y): (x,y) hucresine d degerini koyar
sira(): siranin hangi oyuncuda oldugunu gosterir
siraAtla(): hamleler arasi oyuncu degistirir
bittiMi(): oyunun sona erip ermedigini kontrol eder.
