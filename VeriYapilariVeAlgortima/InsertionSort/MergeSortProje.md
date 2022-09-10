# Merge Sort

## [16,21,11,8,12,22] bu diziye merge sort yaparak sıralarsak adımlar şu şekilde olucaktır 

### **ilk önce diziyi ikiye bölüyoruz sonra tekrardan diziyi bölüyoruz dizinin her bir elemanı tek kalana kadar devam ediyoruz.**
                                                
                
                                                   |16|21|11|8|12|22|
-----------------------------------------------------
                                        |16|21|11|                  |8|12|22|   
---------------------------------------------------------------------------------
                                    |16|21|        |11|           |8|12|     |22|
----------------------------------------------------
                                  |16|   |21|      |11|          |8|   |12|  |22| 

### **bütün elemanlar tek kaldıktan sonra ikili şekilde tekrardan birleştirmeye başlıyoruz birleştirme işleminde elemanları sıralayarak birleştiyoruz.**

                            |16|     |21|    |11|               |8|   |12|    |22|
--------------------------------
                            |16|21|     |11|                    |8|12|      |22|
--------------------------------------------
                            |11|16|21|                          |8|12|22|
---------------------------------------
                                                   |8|11|12|16|21|22|                            


## Big-O gösterimi 
### O(n*(logn)) --> O(6*(log6))